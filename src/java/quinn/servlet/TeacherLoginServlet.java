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
import quinn.model.Student;
import quinn.controller.StudentController;
import quinn.model.Teacher;
import quinn.controller.TeacherController;
import quinn.model.Announcement;

/**
 *
 * @author nattawanee.sks
 */
public class TeacherLoginServlet extends HttpServlet {

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
        String t_id = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "";
        HttpSession session = request.getSession();
        if (t_id.trim().length() > 0) {
            int t_int = Integer.valueOf(t_id);
            TeacherController tc = new TeacherController();
            Teacher user = (Teacher) tc.findByTeacherId(t_int);
            if (user == null) {
                message = "Invalid User";
                request.setAttribute("message", message);
                request.getRequestDispatcher("/teacherLogin.jsp").forward(request, response);
            }
            if (password.length() > 0) {
                if (!user.getPassword().equals(password)) {
                    message = "Invalid Username or Password";
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("/teacherLogin.jsp").forward(request, response);
                } else {
                    session.setAttribute("teacher", user);
                    AnnouncementConntroller ac = new AnnouncementConntroller();
                    List<Announcement> announcementList = ac.findAll();
                    session.setAttribute("announcementList", announcementList);
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                }
            }
        }
        message = "Invalid Username or Password!!";
        request.setAttribute("message", message);
        request.getRequestDispatcher("/teacherLogin.jsp").forward(request, response);
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
        request.getRequestDispatcher("/teacherLogin.jsp").forward(request, response);
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
