/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quinn.controller.QuizController;
import quinn.controller.ScoreController;
import quinn.controller.StudentController;
import quinn.model.Quiz;
import quinn.model.Score;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author donnaya
 */
public class SeeTotalScoreServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        //String studentId = request.getParameter("userName");
        //String studentName = request.getParameter("firstName");
        //String studentLname = request.getParameter("lastName");

        HttpSession session = request.getSession(false);
        QuizController qc = new QuizController();
        String id = request.getParameter("id");
        if (!id.equals("")) {
            int idValue = Integer.valueOf(id);
            Quiz q = qc.findByQuizID(idValue);
            session.setAttribute("q", q);
            ScoreController sc = new ScoreController();
            List<Score> Score = sc.findScoreByQuiz(q.getQuiz_id());
            request.setAttribute("Score", Score);
            request.getServletContext().getRequestDispatcher("/TotalScore.jsp").forward(request, response);
        }

//        Student student = (Student) session.getAttribute("student");
        //Teacher teacher = (Teacher) session.getAttribute("teacher");
        //StudentController st = new StudentController();
        //request.setAttribute("Score", Score);
        request.getServletContext().getRequestDispatcher("/TotalScore.jsp").forward(request, response);
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
        processRequest(request, response);
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
