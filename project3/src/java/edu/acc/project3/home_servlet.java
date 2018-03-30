package edu.acc.project3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryan Sprague
 */
@WebServlet(name = "home_servlet", urlPatterns = {"/home"})
public class home_servlet extends HttpServlet {

    private void incrementSessionCounter(HttpServletRequest request) {
        Integer count = (Integer) request.getSession().getAttribute("sessionCounter1");
        if (count == null) {
            count = 0;
        }
        count++;
        request.getSession().setAttribute("sessionCounter1", count);
    }
    
    private void incrementApplicationCounter(ServletContext servletContext) {
        Integer count = (Integer) servletContext.getAttribute("globalCounter1");
        if (count == null) {
            count = 0;
        }
        count++;
        servletContext.setAttribute("globalCounter1", count);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        incrementSessionCounter(request);
        incrementApplicationCounter(getServletContext());
        
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }

}
