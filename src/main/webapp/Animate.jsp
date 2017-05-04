<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/20
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AnimatePage</title>
    <style>
        /**
         * 搜索框
         */
        .search-group-div {
            margin-top: 20px;
            margin-bottom: 10px;
        }

        .btn-group button, .input-group input {
            border-radius: 3px;
        }

        /**
         * 大标签
         */
        .big-label-group-div {
            margin-top: 15px;
            margin-bottom: 5px;
        }

        div.tag-group {
            display: inline-block;
            letter-spacing: -0.5em;
            margin-left: 2px;
            margin-right: 2px;
        }

        span.tag-btn {
            background-color: #ffffff;
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

        .tag-btn-1x {
            color: #428bca;
        }

        .tag-btn-2x {
            color: #8b008b;
        }

        span.tag-btn-active {
            border: 2px solid;
            border-radius: 10px;
        }
    </style>
    <script type="application/javascript">
        $(document).ready(function () {
            /****************************
             * 搜索框
             **********************************/
            $("ul.dropdown-menu li a").click(function () {
                $(this).parents("span.btn-group").children("button.dropdown-toggle").children("span:first-child").text($(this).text());
                $(this).parents("ul.dropdown-menu").children("li.active").each(function() {
                    $(this).removeClass("active");
                });
                $(this).parent("li").addClass("active");
            });

            $("#resetButton").click(function () {
                $("#searchStr").val("");
            });

            //TODO
            $("#searchButton").click(function () {

            });

            /****************************
             * 大标签
             **********************************/
            $("span.tag-btn").click(function() {
                $(this).parent(".tag-group").children(".tag-btn-active").each(function() {
                    $(this).removeClass("tag-btn-active");
                });
                $(this).addClass("tag-btn-active");
            });
        });
    </script>
</head>
<body>
<div class="col-lg-2 col-md-1 col-sm-0"></div>
<div class="col-lg-8 col-md-10 col-sm-12">
    <div class="search-group-div">
        <div class="input-group">
            <span class="btn-group">
                <button id="searchButton" name="searchButton" type="button" class="btn btn-default">
                    <span>&nbsp</span>
                    <i class="fa fa-search"></i>
                    <span>&nbsp</span>
                </button>
            </span>
            <input id="searchStr" name="searchStr" type="text" class="form-control" placeholder="input" style="width: 300px; !important;" >
            <span class="btn-group">
                <button id="resetButton" name="resetButton" type="button" class="btn btn-default">
                <span>&nbsp</span>
                <i class="fa fa-remove"></i>
                <span>&nbsp</span>
            </button>
        </span>
            <span class="btn-group">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <span>All</span>
                <span>&nbsp&nbsp&nbsp</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li class="active"><a link="javascript:void(0)">All</a></li>
                <li><a link="javascript:void(0)">Original</a></li>
                <li><a link="javascript:void(0)">TR</a></li>
                <li><a link="javascript:void(0)">OVA/OAD</a></li>
                <li><a link="javascript:void(0)">Movie</a></li>
            </ul>
        </span>
            <span class="btn-group">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <span>Year</span>
                <span>&nbsp&nbsp&nbsp</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li class="active"><a link=t"javascript:void(0)">2017</a></li>
                <li><a link="javascript:void(0)">2016</a></li>
                <li><a link="javascript:void(0)">2015</a></li>
                <li><a link="javascript:void(0)">2014</a></li>
                <li><a link="javascript:void(0)">2013</a></li>
                <li><a link="javascript:void(0)">2012</a></li>
            </ul>
        </span>
        </div>
    </div>
    <div class="big-label-group-div">
        <div class="tag-group tag-btn-1x">
            <span class="tag-btn tag-btn-active">all</span>
            <span class="tag-btn">part</span>
            <span class="tag-btn">none</span>
        </div>
    </div>

    <div class="big-label-group-div">
        <div class="tag-group tag-btn-2x">
            <span class="tag-btn tag-btn-active">all</span>
            <span class="tag-btn">part</span>
            <span class="tag-btn">none</span>
        </div>
    </div>

    <div class="small-label-group-div">

    </div>
</div>
<div class="col-lg-2 col-md-1 col-sm-0"></div>
</body>
</html>
