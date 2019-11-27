/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quinn.controller.QuizController;
import quinn.model.Answer;
import quinn.model.Item;
import quinn.model.Quiz;

/**
 *
 * @author nattawanee.sks
 */
public class SummaryServlet extends HttpServlet {

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
        HttpSession session = request.getSession(false);

        QuizController qc = new QuizController();

        int score = (int) session.getAttribute("score");

        Quiz q = (Quiz) session.getAttribute("q");
        List<Item> il = (List<Item>) session.getAttribute("li");
        List<Answer> al = qc.findAnswer(il.get(il.size() - 1).getItem_id());
        String userAnswer = (String) session.getAttribute("lastAnswer");
        Answer correct = null;

        request.setAttribute("lastAnswer", userAnswer);
        request.setAttribute("lastCorrect", correct);
        session.setAttribute("score", score);

        request.getRequestDispatcher("/WEB-INF/view/ScoreSummary.jsp").forward(request, response);

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

        QuizController qc = new QuizController();

//        String scoreA = (String) session.getAttribute("score");
//        int score = Integer.valueOf(scoreA);
        int score = (int) session.getAttribute("score");

        Quiz q = (Quiz) session.getAttribute("q");
        List<Item> il = (List<Item>) session.getAttribute("li");
        List<Answer> al = qc.findAnswer(il.get(il.size() - 1).getItem_id());
        //List<Answer> al = qc.findAnswer(il.get(0).getItem_id());
        String userAnswer = (String) session.getAttribute("lastAnswer");
        Answer correct = null;

        if (q.getType().equals("1")) {
            if (al.get(0).getDescription().equals(userAnswer)) {
                score += 1;
            }
        }

        if (q.getType().equals("2")) {
            //find correct answer
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).isIsCorrect() == true) {
                    correct = al.get(i);
                }
            }
            if (correct != null) {
                if (userAnswer.equals(correct.getDescription())) {
                    score += 1;
                }
            }
        }

        request.setAttribute("lastAnswer", userAnswer);
        request.setAttribute("lastCorrect", correct);
        session.setAttribute("score", score);
        request.getRequestDispatcher("/WEB-INF/view/ScoreSummary.jsp").forward(request, response);
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
