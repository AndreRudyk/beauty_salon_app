<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>

<body>
<div class="register-photo" style="background-color: #282d32;height: 907px;">
    <div class="form-container">
        <div class="image-holder"></div>
        <form method="post" style="height: 700px;">
            <h2 class="text-center"><strong>Create</strong> an account.</h2>
            <div class="form-group"><input class="form-control" type="email" name="email" placeholder="Email"
                                           pattern="^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$" minlength="5" required=""></div>
            <div class="form-group"><input class="form-control" type="password" name="password" placeholder="Password"
                                           minlength="8" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$"></div>
            <div class="form-group"><input class="form-control" type="password" name="password-repeat"
                                           placeholder="Password (repeat)" minlength="8"
                                           pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$"></div>
            <input class="form-control" type="text" name="firstname" placeholder="Firstname"
                   minlength="2" required="">
            <input class="form-control" type="text" style="margin-top: 15px;"
                   name="lastname" placeholder="Lastname" required=""
                   minlength="2">
            <input class="form-control" type="tel"
                   style="margin-top: 15px;" required=""
                   name="phone number"
                   placeholder="Phone number"
                   pattern="^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[\s\./0-9]*$">
            <button class="btn btn-primary btn-block" type="submit">Sign Up</button>
            <a class="already" href="#" style="margin-top: 20px;">You already have an account? Login here.</a></form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>

</html>