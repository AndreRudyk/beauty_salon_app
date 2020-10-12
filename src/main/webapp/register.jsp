<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>

<body>
<div class="register-photo" style="background-color: rgb(254,254,254);">
    <div class="form-container" style="width: 300px;">
        <form class="shadow-lg" method="post" style="width: 200px;">
            <h2 class="text-center"><strong>Create</strong> an account.</h2>
            <div class="form-group">
                <input class="form-control" type="email" name="email" placeholder="Email"
                       style="width: 500px;background-color: #ffffff;margin-bottom: 16px;"
                       pattern="^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$" required="">
                <input
                        class="form-control"
                        name="firstname" placeholder="Firstname"
                        style="width: 500px;background-color: #ffffff;margin-bottom: 16px;" pattern="\p{L}"
                        minlength="2"
                        required="">
                <input class="form-control" type="email" name="lastname" placeholder="Lastname"
                       style="width: 500px;background-color: #ffffff;margin-bottom: 16px;"
                       pattern="\p{L}" minlength="2" required="">
                <input class="form-control"
                       type="number" name="phonenumber"
                       placeholder="Phone number"
                       style="width: 500px;background-color: #ffffff;margin-bottom: 16px;"
                       pattern="((?:\+|00)[17](?: |\-)?|(?:\+|00)[1-9]\d{0,2}(?: |\-)?|(?:\+|00)1\-\d{3}(?: |\-)?)?(0\d|\([0-9]{3}\)|[1-9]{0,3})(?:((?: |\-)[0-9]{2}){4}|((?:[0-9]{2}){4})|((?: |\-)[0-9]{3}(?: |\-)[0-9]{4})|([0-9]{7}))"
                       required=""></div>
            <div
                    class="form-group">
                <input class="form-control" type="password" name="password"
                       placeholder="Password" style="background-color: #ffffff;"
                       pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"
                       minlength="8" required=""></div>
            <div class="form-group">
                <input class="form-control" type="password" name="password-repeat"
                       placeholder="Password (repeat)" style="background-color: #ffffff;"
                       minlength="8" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"
                       required=""></div>
            <div class="form-group">
                <button class="btn btn-primary btn-block" type="submit"
                        style="background-color: #f700b1;color: #1e2833;">Sign Up
                </button>
            </div>
            <a class="already" href="#" style="color: #f700b1;">You already have an account? Login here.</a></form>
    </div>
</div>
<script src="<c:url value="/js/jquery.min.js"/>"></script>
<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
</body>

</html>