package edu.acc.project3;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryan Sprague
 */
@WebServlet(urlPatterns = {"/altCounter"})
public class altCounter_servlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        incrementSessionCounter(request.getSession());
        incrementApplicationCounter(getServletContext());
        
        getServletContext().getRequestDispatcher("/WEB-INF/altCounter.jsp").forward(request, response);
    }
    
    private void incrementSessionCounter(HttpSession session) {
        Integer count = (Integer) session.getAttribute("sessionCounter2");
        if (count == null) {
            count = 0;
        }
        count++;
        
        session.setAttribute("sessionCounter2", count);
    }
    
    private void incrementApplicationCounter(ServletContext servletContext) {
        Integer count = (Integer) servletContext.getAttribute("globalCounter2");
        if (count == null) {
            count = 0;
        }
        count++;
        
        servletContext.setAttribute("globalCounter2", count);
    }
}
