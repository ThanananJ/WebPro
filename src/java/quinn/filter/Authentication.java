/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import quinn.model.Teacher;

/**
 *
 * @author donnaya
 */
public class Authentication implements Filter {

    FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        if (session == null) {
            config.getServletContext().getRequestDispatcher("/selectRole.jsp").forward(request, response);
        }
        if (session.getAttribute("student") == null) {
            if (teacher == null) {
                config.getServletContext().getRequestDispatcher("/selectRole.jsp").forward(request, response);
            } else {
                chain.doFilter(request, response);
                return;
            }
            config.getServletContext().getRequestDispatcher("/selectRole.jsp").forward(request, response);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
