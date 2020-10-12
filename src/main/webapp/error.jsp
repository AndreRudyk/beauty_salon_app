<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: besko
  Date: 10/10/2020
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Error 404 - Page Not Found!</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>

<body>
<div class="container">
    <img class="ops" src="<c:url value="/images/error/404.png"/>" alt="404 error image"/>
    <button class="btn btn-primary" type="button" style="background-color: #eb2f5a;color: #1e2833;">
        Home
    </button>
</div>
</body>

</html>