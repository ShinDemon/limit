<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/8
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module5</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        .main-block {
            display: inline-block;
            height: 200px;
        }

        .image-block {
            text-align: center;
        }

        .image-block div.photo-frame {
            display: inline-block;
            width: 350px;
            height: 150px;
            overflow: hidden;
            margin-top: 15px;
            margin-bottom: 0px;
        }

        .image-block div.photo-frame img {
            position: relative;
            top: -30px;
        }

        .imageDescription {
            display: inline-block;
            width: 350px;
            margin-top: 0px;
            text-align: left;
        }

        .message-block {
            text-align: center;
        }

        .message-title {
            display: inline-block;
            width: 100%;
            margin-top: 15px;
            margin-left: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <div class="col-lg-2 col-md-1 col-sm-0"></div>
    <div class="col-lg-8 col-md-10 col-sm-12 main-block">
        <div class="main-block">
            <div class="col-lg-7 col-sm-7 col-md-7">
                <div class="image-block">
                    <div class="photo-frame thumbnail">
                        <img src="view2.jpg">
                    </div>
                    <div class="imageDescription">
                        <a src="javascript:void(0);">ha?</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-5 col-sm-5 col-md-5">
                <div class="message-block">
                    <div class="message-title">
                        <i class="fa fa-volume-down"></i>
                        <i class="fa fa-picture-o"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-lg-2 col-md-1 col-sm-0"></div>
</body>
</html>
