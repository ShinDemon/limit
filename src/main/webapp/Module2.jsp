<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/8
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module2</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        div.label-group {
            display: inline-block;
            letter-spacing: -0.5em;
            margin-left: 2px;
            margin-right: 2px;
        }

        span.label-btn {
            background-color: #ffffff;
            border: 1px solid #508fff;
            color: #508fff;
            cursor: pointer;
            display: inline-block;
            font-size: 10px;
            height: 25px;
            letter-spacing: normal;
            line-height: 23px;
            margin-left: 0px;
            margin-right: 0px;
            padding-left: 5px;
            padding-right: 5px;
            text-align: center;
        }
    </style>
    <script type="application/javascript">
        $(document).ready(function() {
            $("span.label-btn").mouseover(function() {
                $(this).css("background-color", "#ffe4C4");
            });

            $("span.label-btn").mouseleave(function() {
                $(this).css("background-color", "#ffffff");
            });
        });
    </script>
</head>
<body>
<div class="label-group">
    <span class="label-btn">all</span>
    <span class="label-btn">part</span>
    <span class="label-btn">none</span>
</div>

<div class="label-group">
    <span class="label-btn label-btn-active">all2</span>
    <span class="label-btn">part2</span>
    <span class="label-btn">none2</span>
</div>
</body>
</html>
