<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form id="loginForm">
        <label for="loginId">Login ID:</label>
        <input type="text" id="loginId" name="login_id" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <button type="button" onclick="authenticate()">Login</button>
    </form>

    <script>
        function authenticate() {
            const loginId = document.getElementById("loginId").value;
            const password = document.getElementById("password").value;

            // Replace this with an actual API call to authenticate the user
            // For this example, we assume the credentials are correct
            if (loginId === "test@sunbasedata.com" && password === "Test@123") {
                window.location.href = "customerList.jsp";
            } else {
                alert("Invalid credentials. Please try again.");
            }
        }
    </script>
</body>
</html>
