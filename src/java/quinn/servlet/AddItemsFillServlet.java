/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.servlet;

import java.io.IOException;
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
 * @author Mark
 */
public class AddItemsFillServlet extends HttpServlet {

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

        QuizController qc = new QuizController();
        HttpSession session = request.getSession(false);
        Quiz quizes = (Quiz) session.getAttribute("quizes");
        Quiz quiz = qc.findByDesc(quizes.getDescription()).get(0);
        String number = (String) session.getAttribute("runLoop");
        int numberItems = Integer.valueOf(number);

        for (int i = 1; i < numberItems + 1; i++) {
            String itemDescription = request.getParameter("itemdescription" + i);
            Item ite = qc.findItemById(itemDescription, quiz.getQuiz_id());
            if (ite != null) {
                request.setAttribute("errorAddItem", "Can not create duplicate question");
                response.sendRedirect("./AddItemsFill");
                return;
            }
            Item items = new Item(itemDescription, quiz.getQuiz_id());
            qc.addItem(items, quiz);

            Item item = qc.findItemById(items.getDescription(), items.getQuiz_id());
            String answerss = request.getParameter("answersdescription" + i);
            Answer answers = new Answer(answerss, true, item.getItem_id());
            qc.addAnswer(item, answers);

        }

        request.getRequestDispatcher("/WEB-INF/view/AddQuiz/FinishAddQuiz.jsp").forward(request, response);

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
