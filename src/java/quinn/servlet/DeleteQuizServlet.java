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
import quinn.model.Answer;
import quinn.model.Item;
import quinn.model.Quiz;
import quinn.model.Score;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author donnaya
 */
public class DeleteQuizServlet extends HttpServlet {

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

        HttpSession session = request.getSession(false);

        //send table
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        Student student = (Student) session.getAttribute("student");
        ScoreController sc = new ScoreController();
        QuizController qc = new QuizController();
        if (teacher == null) {
            request.setAttribute("StudentFristname", student.getFirstName());
            request.setAttribute("StudentLastname", student.getLastName());
            List<Score> studentList = sc.findScoreByStudent(student.getUserName());
            request.setAttribute("studentList", studentList);
        } else {
            request.setAttribute("TeacherFristname", teacher.getFirstName());
            request.setAttribute("TeacherLastname", teacher.getLastName());
            List<Quiz> teacherList = qc.findByTeacherId(teacher.getUserName());
            request.setAttribute("teacherList", teacherList);
        }

        request.setAttribute("message", "Delete Fail");
        String quiz = request.getParameter("id");
        if (quiz != null) {
            int qid = Integer.valueOf(quiz);
//            System.out.println(qid);
            Quiz q = qc.findByQuizID(qid);
//            System.out.println(q);
            List<Item> itemL = qc.findItem(qid);
            if (itemL != null) {
                for (int i = 0; i < itemL.size(); i++) {
                    List<Answer> answerL = qc.findAnswer(itemL.get(i).getItem_id());
                    if (answerL != null) {
                        for (int j = 0; j < answerL.size(); j++) {
                            qc.deleteAnswer(answerL.get(j));
                        }
                    }
                    qc.deleteItem(itemL.get(i));
                }
            }
            qc.deleteQuiz(q);

            request.setAttribute("message", "Delete Complete");
        }

        request.setAttribute("quizinput", quiz);
        response.sendRedirect("./Profile");
        //request.getServletContext().getRequestDispatcher("/profile.jsp").forward(request, response);

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
