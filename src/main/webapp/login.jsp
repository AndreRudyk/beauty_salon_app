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
<div class="register-photo" style="background-color: #ffffff;">
    <div class="form-container" style="width: 500px;">
        <form class="shadow-lg" method="post" style="width: 00px;">
            <h2 class="text-center" style="color: #1e2833;"><strong>Sign In</strong></h2>
            <div class="form-group"><input class="form-control" type="email" name="email" placeholder="Email" style="background-color: #ffffff;" pattern="^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$" required=""></div>
            <div class="form-group"><input class="form-control" type="password" name="password" placeholder="Password" style="color: #ffffff;background-color: #ffffff;" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$" minlength="8" required=""></div>
            <div class="form-group"><button class="btn btn-primary btn-block" type="submit" style="background-color: #f700b1;color: #1e2833;">Sign Up</button></div><a class="already" href="#" style="color: #f700b1;">Forgot your password? Click here.&nbsp;</a></form>
    </div>
</div>
<script src="<c:url value="/js/jquery.min.js"/>"></script>
<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
<!--<script src="assets/js/login-full-page-bs4.js"></script>-->
</body>

</html>