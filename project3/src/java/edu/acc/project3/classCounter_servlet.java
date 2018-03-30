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
@WebServlet(name = "classCounter_servlet", urlPatterns = {"/classCounter"})
public class classCounter_servlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        incrementSessionCounter(request);
        incrementApplicationCounter(getServletContext());
        getServletContext().getRequestDispatcher("/WEB-INF/classCounter.jsp").forward(request, response);
    }

    private void incrementSessionCounter(HttpServletRequest request) {
        Counter count = (Counter) request.getSession().getAttribute("sessionCounter3");
        if (count == null) {
            count = new Counter();
            request.getSession().setAttribute("sessionCounter3", count);
        }
        count.increment();
    }

    private void incrementApplicationCounter(ServletContext servletContext) {
        Counter count = (Counter) servletContext.getAttribute("globalCounter3");
        if (count == null) {
            count = new Counter();
            servletContext.setAttribute("globalCounter3", count);
        }
        count.increment();
    }
    
}
