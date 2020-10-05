<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <title>Untitled</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bitter:400,700">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/fonts/ionicons.min.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">




</head>

<body>
<div style="background-color: rgba(0,0,0,0.1);"></div>
<div>
    <div class="header-dark" style="height: 90px;padding-bottom: 70px;background-color: #282d32;">
        <nav class="navbar navbar-light navbar-expand-lg navigation-clean-button" style="padding-bottom: 0px;">
            <div class="container"><a class="navbar-brand" href="#">Company Name</a><small class="form-text text-muted" style="  margin-right: 35px;
  margin-left: 50px;
">Help text for a form field.</small><button data-toggle="collapse" data-target="#navcol-1" class="navbar-toggler"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navcol-1"
                     style="background-color: #282d32;">
                    <ul class="nav navbar-nav mr-auto">
                        <li role="presentation" class="nav-item"><a class="nav-link" href="#" style="color: #f700b1;font-size: 18px;">Services</a></li>
                        <li role="presentation" class="nav-item"><a class="nav-link" href="#" style="color: #f700b1;font-size: 18px;">Photos</a></li>
                    </ul><span class="navbar-text actions" style="font-size: 16px;"><a class="login" href="#" style="color: #f700b1;padding-left: 19.2px;">Log In</a><a class="btn btn-light action-button" role="button" href="#" style="color: rgb(3,3,3);background-color: #f700b1;">Sign Up</a></span>
                    <div
                            class="dropdown" style="margin-left: 9.1px;"><a data-toggle="dropdown" aria-expanded="false" class="dropdown-toggle" href="#" style="margin-left: 10px;color: #f700b1;font-size: 14px;">EN</a>
                        <div role="menu" class="dropdown-menu"><a role="presentation" class="dropdown-item" href="#">First Item</a><a role="presentation" class="dropdown-item" href="#">Second Item</a><a role="presentation" class="dropdown-item" href="#">Third Item</a></div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<div class="highlight-clean">
    <div class="container">
        <div class="intro">
            <h2 class="text-center">Highlight</h2>
            <p class="text-center">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet vitae. </p>
        </div>
    </div>
</div>
<div class="projects-horizontal">
    <div class="container">
        <div class="intro">
            <p class="text-center" style="color: rgb(0,0,0);font-size: 25px;filter: blur(0px) brightness(97%) invert(0%);">Services</p>
        </div>
        <div class="row projects">
            <div class="col-sm-6 item">
                <div class="row">
                    <div class="col-md-12 col-lg-5"><a href="#"><img class="img-fluid" src="desk.jpg" /></a></div>
                    <div class="col">
                        <h3 class="name">Project Name</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 item">
                <div class="row">
                    <div class="col-md-12 col-lg-5"><a href="#"><img class="img-fluid" src="building.jpg" /></a></div>
                    <div class="col">
                        <h3 class="name">Project Name</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 item">
                <div class="row">
                    <div class="col-md-12 col-lg-5"><a href="#"><img class="img-fluid" src="loft.jpg" /></a></div>
                    <div class="col">
                        <h3 class="name">Project Name</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 item">
                <div class="row">
                    <div class="col-md-12 col-lg-5"><a href="#"><img class="img-fluid" src="minibus.jpeg" /></a></div>
                    <div class="col">
                        <h3 class="name">Project Name</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="photo-gallery">
    <div class="container">
        <div class="intro">
            <p class="text-center">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet vitae. </p>
        </div>
        <div class="row photos">
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="desk.jpg"><img class="img-fluid" src="desk.jpg" /></a></div>
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="building.jpg"><img class="img-fluid" src="building.jpg" /></a></div>
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="loft.jpg"><img class="img-fluid" src="loft.jpg" /></a></div>
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="building.jpg"><img class="img-fluid" src="building.jpg" /></a></div>
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="loft.jpg"><img class="img-fluid" src="loft.jpg" /></a></div>
            <div class="col-sm-6 col-md-4 col-lg-3 item"><a data-lightbox="photos" href="desk.jpg"><img class="img-fluid" src="desk.jpg" /></a></div>
        </div>
    </div>
</div>
<div class="brands"><a href="#"><img src="instacart.png" /><img src="kickstarter.png" /><img src="lyft.png" /><img src="shopify.png" /><img src="pinterest.png" /><img src="twitter.png" /></a></div>
<div class="team-clean">
    <div class="container">
        <div class="intro">
            <h2 class="text-center">Team </h2>
            <p class="text-center">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet vitae. </p>
        </div>
        <div class="row people">
            <div class="col-md-6 col-lg-4 item"><img class="rounded-circle" src="1.jpg" />
                <h3 class="name">Ben Johnson</h3>
                <p class="title">Musician</p>
                <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>
            </div>
            <div class="col-md-6 col-lg-4 item"><img class="rounded-circle" src="2.jpg" />
                <h3 class="name">Emily Clark</h3>
                <p class="title">Artist</p>
                <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>
            </div>
            <div class="col-md-6 col-lg-4 item"><img class="rounded-circle" src="3.jpg" />
                <h3 class="name">Carl Kent</h3>
                <p class="title">Stylist</p>
                <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida. Aliquam varius finibus est, et interdum justo suscipit id. Etiam dictum feugiat tellus, a semper massa. </p>
                <div class="social"><a href="#"><i class="fa fa-facebook-official"></i></a><a href="#"><i class="fa fa-twitter"></i></a><a href="#"><i class="fa fa-instagram"></i></a></div>
            </div>
        </div>
    </div>
</div>
<div class="footer-dark">
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3 item">
                    <h3>Services</h3>
                    <ul>
                        <li><a href="#">Web design</a></li>
                        <li><a href="#">Development</a></li>
                        <li><a href="#">Hosting</a></li>
                    </ul>
                </div>
                <div class="col-sm-6 col-md-3 item">
                    <h3>Contacts</h3>
                    <ul>
                        <li><a href="#">phone number</a></li>
                        <li><a href="#">e-mail</a></li>
                    </ul>
                </div>
                <div class="col-md-6 item text"><img src="images/logos/estetico_logo.jpg" alt="logo" style="margin-left: 150px;" /></div>
                <div class="col item social"><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a></div>
            </div>
            <p class="copyright">Company Name © 2017</p>
        </div>
    </footer>
</div>


<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
</body>

</html>