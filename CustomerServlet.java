package com.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    // ...

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String cmd = request.getParameter("cmd");

        if ("create".equals(cmd)) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String street = request.getParameter("street");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            // Create a new Customer object with the provided details
            Customer newCustomer = new Customer(firstName, lastName, street, address, city, state, email, phone);

            // Replace this with an actual API call to create the customer
            // For this example, we add the new customer to the dummy customer list
            addCustomer(newCustomer);

            // Redirect back to the customer list page after successful creation
            response.sendRedirect("CustomerServlet");
        } else if ("delete".equals(cmd)) {
            // Handle customer deletion (as shown in the previous response)

        } else if ("update".equals(cmd)) {
            // Handle customer update (as shown in the previous response)

        } else {
            // Invalid command
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    private List<Customer> getDummyCustomerList() {
        // Create a list of dummy customers
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Jane", "Doe", "Elvnu Street", "H no 2", "Delhi", "Delhi", "sam@gmail.com", "12345678"));
        customerList.add(new Customer("John", "Smith", "Main Street", "Apt 123", "New York", "NY", "john@example.com", "98765432"));
        // Add more dummy customers as needed
        return customerList;
    }
    private void addCustomer(Customer customer) {
        // Replace this with an actual API call to add the customer to your data storage (e.g., database)
        // For this example, we add the customer to the dummy customer list
        List<Customer> customerList = getDummyCustomerList();
        customerList.add(customer);
    }

    // ...
}


//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet("/CustomerServlet")
//public class CustomerServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Replace this with an actual API call to fetch the customer list
//        // For this example, we use a dummy list
//        List<Customer> customerList = getDummyCustomerList();
//
//        // Set the customerList as an attribute to pass to the JSP page
//        request.setAttribute("customerList", customerList);
//
//        try {
//            // Forward the request to customerList.jsp to display the list
//            request.getRequestDispatcher("customerList.jsp").forward(request, response);
//        } catch (javax.servlet.ServletException | IOException e) {
//            // Handle the exception (if needed)
//            e.printStackTrace();
//        }
//    }
//
//    private List<Customer> getDummyCustomerList() {
//        List<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer("Jane", "Doe", "Elvnu Street", "H no 2", "Delhi", "Delhi", "sam@gmail.com", "12345678"));
//        // Add more dummy customers here or replace with actual data from your API
//        return customerList;
//    }
//}
