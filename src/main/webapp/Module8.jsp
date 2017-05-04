<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module8</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        article {
            height: 5000px;
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
    </script>
</head>
<body>
<article>
</article>
<div class="view-tool">
    <div><i class="fa fa-chevron-up fa-2x"></i></div>
    <div><i class="fa fa-spinner fa-2x"></i></div>
    <div><i class="fa fa-chevron-down fa-2x"></i></div>
</div>
</body>
</html>
