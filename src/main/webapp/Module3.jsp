<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/8
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module3</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        div.tag-group {
            display: inline-block;
            letter-spacing: -0.5em;
            margin-left: 2px;
            margin-right: 2px;
        }

        span.tag-btn {
            background-color: #ffffff;
            color: #508fff;
            cursor: pointer;
            display: inline-block;
            font-size: 18px;
            height: 45px;
            letter-spacing: normal;
            line-height: 43px;
            margin-left: 0px;
            margin-right: 0px;
            padding-left: 10px;
            padding-right: 10px;
            text-align: center;
        }

        span.tag-btn-active {
            border: 2px solid #508fff;
            border-radius: 10px;
        }
    </style>
    <script type="application/javascript">
        $(document).ready(function() {
            $("span.tag-btn").click(function() {
                $("span.tag-btn-active").removeClass("tag-btn-active");
                $(this).addClass("tag-btn-active");
            });

            $("span.tag-btn").mouseover(function() {
                $(this).css("background-color", "#ffe4C4");
            });

            $("span.tag-btn").mouseleave(function() {
                $(this).css("background-color", "#ffffff");
            });
        });
    </script>
</head>
<body>
<div class="tag-group">
    <span class="tag-btn tag-btn-active">all</span>
    <span class="tag-btn">part</span>
    <span class="tag-btn">none</span>
</div>
</body>
</html>
