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
import quinn.controller.AnnouncementConntroller;
import quinn.controller.QuizController;
import quinn.controller.ScoreController;
import quinn.model.Announcement;
import quinn.model.Quiz;
import quinn.model.Score;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author Mark
 */
public class IndexServlet extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        AnnouncementConntroller ac = new AnnouncementConntroller();
        List<Announcement> announcementList = ac.findAll();
        session.setAttribute("announcementList", announcementList);
        if (session.getAttribute("score") == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            int scores = (int) session.getAttribute("score");
            Student student = (Student) session.getAttribute("student");
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            QuizController qc = new QuizController();
            Quiz quizes = (Quiz) session.getAttribute("q");
            Quiz quiz = qc.findByDesc(quizes.getDescription()).get(0);
            if (teacher == null) {
                ScoreController sc = new ScoreController();
                Score score = new Score(student.getUserName(), quiz.getQuiz_id(), quiz.getDescription(), scores, quiz.getMaxScore());
                sc.AddScore(score);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }
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
