<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/8
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module4</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        .hideImgDiv {
            display: none;
            position: absolute;
            right: 10px;
            bottom: 10px;
        }

        .hideImgDiv .hideImage {
            margin-bottom: 0px;
        }

        .hideImgDiv .hideImage img {
            height: 400px;
        }

        .hideImgDiv .hideText {
            background-color: #0f0f0f;
            border-radius: 4px;
            display: block;
            height: 25px;
            margin-top: 5px;
            text-align: center;
            color: #ffffff;
            width: 100%;
        }
    </style>
    <script type="application/javascript">
        $(document).ready(function() {
            $("#failedBtn").mouseover(function() {
                $("#hideTxt").text("js");
                $("#hideImg").attr("src", "view2.jpg");
                $("#hideImgDiv").show();
            });

            $("#failedBtn").mouseleave(function() {
                $("#hideImgDiv").hide();
                $("#hideImg").attr("src", "#");
                $("#hideTxt").text("");
            });
        });
    </script>
</head>
<body>
<div id="failedBtn" style="display: inline-block; height: 30px; width: 100px; border: 2px solid #eea236; cursor: pointer;"></div>
<div id="hideImgDiv" class="hideImgDiv">
    <div class="hideImage thumbnail"><img id="hideImg" src="#" /></div>
    <div class="hideText"><span id="hideTxt"></span></div>
</div>
</body>
</html>
