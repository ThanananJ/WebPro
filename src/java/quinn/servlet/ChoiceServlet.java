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
import quinn.model.Answer;
import quinn.model.Item;
import quinn.model.Quiz;

/**
 *
 * @author nattawanee.sks
 */
public class ChoiceServlet extends HttpServlet {

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
        //count item
        String count = request.getParameter("count");
        int countno = Integer.valueOf(count);
        request.setAttribute("count", countno);

        HttpSession session = request.getSession(false);
        int score = (int) session.getAttribute("score");

        String userAnswer = request.getParameter("userAnswer");

        List<Item> il = (List<Item>) session.getAttribute("li");
        
        if (il.size() == countno) {
            session.setAttribute("lastAnswer", userAnswer);
            request.getRequestDispatcher("/WEB-INF/view/endQuiz.jsp").forward(request, response);
            return;
        }
        QuizController qc = new QuizController();
        Quiz q = (Quiz) session.getAttribute("q");
        
        List<Answer> al = qc.findAnswer(il.get(countno).getItem_id());
        List<Answer> alcheck = qc.findAnswer(il.get(countno-1).getItem_id());
        Answer correct = null;
        
        //find correct answer
        for(int i = 0; i < al.size(); i++){
            if(alcheck.get(i).isIsCorrect() == true){
                correct = alcheck.get(i);
            }
        }
        
        if(userAnswer.equals(correct.getDescription())){
            score +=1;
        }
        
        session.setAttribute("score", score);
        Item i = il.get(countno);
        request.setAttribute("i", i);
        request.setAttribute("answers", al);
        request.getRequestDispatcher("/WEB-INF/view/doQuizChoice.jsp").forward(request, response);
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
