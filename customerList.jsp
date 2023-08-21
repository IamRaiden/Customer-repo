<!-- Inside customerList.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
    <h1>Customer List</h1>
    <!-- Your existing code to display the customer list table -->
    <table border="1">
        <tr>
            <!-- Table headers -->
        </tr>
        <%-- Use JSP EL (Expression Language) to iterate over the customerList attribute --%>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <!-- Table data for each customer -->
            </tr>
        </c:forEach>
    </table>

    <!-- Link to addCustomer.jsp -->
    <a href="addCustomer.jsp">Add Customer</a>

    <!-- JavaScript function for deleting customers (as shown in the previous responses) -->
    <script>
        // JavaScript function to delete customer (if you've already implemented this)
    </script>
</body>
</html>
