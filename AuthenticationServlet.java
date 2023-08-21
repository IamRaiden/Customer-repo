package com.servlets;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String loginId = request.getParameter("login_id");
        String password = request.getParameter("password");

        // Replace this with an actual API call to authenticate the user
        // For this example, we assume the credentials are correct
        if ("test@sunbasedata.com".equals(loginId) && "Test@123".equals(password)) {
            request.getSession().setAttribute("authenticated", true);
            response.sendRedirect("CustomerServlet");
        } else {
            response.sendRedirect("index.jsp?error=true");
        }
    }
}
