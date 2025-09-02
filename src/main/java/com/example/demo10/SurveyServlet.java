package com.example.demo10;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;


public class SurveyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Mở form index.jsp
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName  = request.getParameter("lastName");
        String email     = request.getParameter("email");
        String dob       = request.getParameter("dob");
        String hear      = request.getParameter("hear");
        String[] announcements = request.getParameterValues("announcements");
        String contact   = request.getParameter("contact");

        // Validate required fields
        if(firstName == null || firstName.isBlank() ||
                lastName == null  || lastName.isBlank() ||
                email == null     || email.isBlank()) {

            request.setAttribute("error", "Hãy điền đầy đủ vào chỗ trống.");
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Tạo User object
        User user = new User(firstName, lastName, email, dob, hear, announcements, contact);

        // Đặt user vào request
        request.setAttribute("user", user);

        // Chuyển sang thanks.jsp
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/thanks.jsp");
        dispatcher.forward(request, response);
    }
}
