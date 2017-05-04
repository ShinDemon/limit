<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module9</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.5/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script type="application/javascript">
        $(document).ready(function() {
            $(window).resize(function() {
                if($("#example-navbar-collapse").css("display")=="none") {
                    $(".navbar-right").css("display", "none");
                    $(".navbar-right").css("visibility", "hidden");
                } else if($("#example-navbar-collapse").css("display")=="block") {
                    $(".navbar-right").css("display", "block");
                    $(".navbar-right").css("visibility", "visible");
                }
            });

            $(".dropdown-menu li a").click(function() {
                $(this).parents("ul.dropdown-menu").children("li.active").each(function() {
                    $(this).removeClass("active");
                });
                $(this).parent("li").addClass("active");
                $(this).parents(".dropdown").children("a.dropdown-toggle").children("span").text($(this).text());
            });
        });
    </script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header navbar-left">
            <a class="navbar-brand" href="#">菜鸟教程</a>
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="navbar-header navbar-right">
            <a class="navbar-brand" href="#">Link</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">iOS</a></li>
                <li><a href="#">SVN</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <span>Java</span> <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="active"><a href="#">Java</a></li>
                        <li><a href="#">jmeter</a></li>
                        <li><a href="#">EJB</a></li>
                        <li><a href="#">Jasper Report</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分离的链接</a></li>
                        <li class="divider"></li>
                        <li><a href="#">另一个分离的链接</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
