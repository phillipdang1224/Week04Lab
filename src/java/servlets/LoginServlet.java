package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.*;

/**
 *
 * @author 747787
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("logout") != null) {
            request.setAttribute("message", "You have sucessfully logged out!");
            HttpSession session = request.getSession();
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = request.getParameter("user");
        String password = request.getParameter("password");

        UserService userService = new UserService();
        if ((userService.login(username, password)) != null) {

            if (request.getParameter("remember") == null) {
                response.sendRedirect("home");
                session.setAttribute("name", username);
                username = null;

            } else {
                response.sendRedirect("home");
                session.setAttribute("name", username);
            }
        } else {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        }

    }

}
