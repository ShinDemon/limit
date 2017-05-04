<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/17
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MainPage</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.5/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        .mainArea {
            margin-top: 50px;
        }

        div.view-tool {
            display: inline-block;
            visibility: hidden;
            width: 35px;
            height: 100px;
            position: fixed;
            top: 40%;
            bottom: 50%;
            right: 10px;
        }

        div.view-tool div {
            display: block;
            width: 35px;
            height: 35px;
            text-align: center;
            line-height: 33px;
            color: #ffffff;
            background-color: #cccccc;
            border: 1px solid #cccccc;
            cursor: pointer;
        }
    </style>

    <script type="application/javascript">
        $(document).ready(function() {
            $("div.mainArea").load("Animate.jsp");

            $(window).resize(function() {
                if($("#example-navbar-collapse").css("display") == "none") {
                    $(".navbar-right").css("display", "none").css("visibility", "hidden");
                } else if($("#example-navbar-collapse").css("display") == "block") {
                    $(".navbar-right").css("display", "block").css("visibility", "visible");
                }
            });

            $("ul.navbar-nav li a").click(function() {
                $(this).parents("ul.navbar-nav").children("li.active").each(function() {
                    $(this).removeClass("active");
                });
                $(this).parent("li").addClass("active");
            });

            $("ul.dropdown-menu li a").click(function() {
                $(this).parents("ul.dropdown-menu").children("li.active").each(function() {
                    $(this).removeClass("active");
                });
                $(this).parent("li").addClass("active");
                $(this).parents("li.dropdown").children("a.dropdown-toggle").children("span").text($(this).text());
                $(this).parents("li.dropdown").each(function() {
                    $(this).addClass("active");
                });
            });

            $(window).scroll(function() {
                if($(document).scrollTop() != 0) {
                    $("div.view-tool").css("visibility", "visible");
                } else {
                    $("div.view-tool").css("visibility", "hidden");
                }
            });

            $("i.fa-chevron-up").click(function() {
                $("body,html").animate({scrollTop:0}, 500);
            });

            $("i.fa-spinner").click(function() {
                $(this).parents("div.view-tool").css("display", "none");
            });

            $("i.fa-chevron-down").click(function() {
                $("body,html").animate({scrollTop:$(document).height()}, 500);
            });
        });

        function loadPage(parm) {
            var url = parm + ".jsp";
            $("div.mainArea").load(url);
        }
    </script>
</head>
<body>
<div>
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header navbar-left">
                <a class="navbar-brand" href="#">Shin</a>
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="navbar-header navbar-right">
                <a class="navbar-brand" href="#">Login in</a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#" onclick="loadPage('Animate')">Animate</a></li>
                    <li><a href="#">Comic</a></li>
                    <li><a href="#">Novel</a></li>
                    <li><a href="#">Music</a></li>
                    <li><a href="#">Pictures</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <span>TR</span> <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">TR</a></li>
                            <li><a href="#">TR Animate</a></li>
                            <li><a href="#">TR Comic</a></li>
                            <li><a href="#">TR Novel</a></li>
                            <li><a href="#">TR Music</a></li>
                            <li><a href="#">TR Picture</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Downloads</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<div class="mainArea">
</div>
<div class="view-tool">
    <div><i class="fa fa-chevron-up fa-2x"></i></div>
    <div><i class="fa fa-spinner fa-2x"></i></div>
    <div><i class="fa fa-chevron-down fa-2x"></i></div>
</div>
</body>
</html>
