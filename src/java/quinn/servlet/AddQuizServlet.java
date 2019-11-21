/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quinn.controller.QuizController;
import quinn.controller.TeacherController;
import quinn.model.Item;
import quinn.model.Quiz;
import quinn.model.Teacher;

/**
 *
 * @author Mark
 */
public class AddQuizServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String quizName = request.getParameter("quizname");
        String quizSubject = request.getParameter("quizsubject");
        String quizType = request.getParameter("quiztype");
        String numberItems = request.getParameter("numberitems");
        String quizForClass = request.getParameter("quizforclasss");

        QuizController qc = new QuizController();
        TeacherController tc = new TeacherController();
        HttpSession session = request.getSession(false);
        Teacher teachers = (Teacher) session.getAttribute("teacher");
        Teacher teacher = tc.findByTeacherFullName(teachers.getFirstName(), teachers.getLastName());

        Quiz quiz = new Quiz(quizName, quizSubject, quizType, teacher.getUserName(), quizForClass, Integer.valueOf(numberItems));
        qc.addQuiz(quiz);

        session.setAttribute("runLoop", numberItems);
        session.setAttribute("quizes", quiz);

        if (quizType.equals("1")) {
            getServletContext().getRequestDispatcher("/WEB-INF/view/AddQuiz/AddFillQuiz.jsp").forward(request, response);
        } else if (quizType.equals("2")) {
            int choiceLoop = Integer.valueOf(numberItems) * 4;
            session.setAttribute("runLoopChoice", choiceLoop);
            getServletContext().getRequestDispatcher("/WEB-INF/view/AddQuiz/AddChoiceQuiz.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/AddQuiz/AddQuiz.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
