<%@ page contentType="text/html;charset=GB2312" language="java" %>
<html>
<head>
    <title>ËÑË÷¿ò</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.5/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script type="application/javascript">
        $(document).ready(function() {
            $("ul.dropdown-menu li a").click(function() {
                $(this).parents("span.btn-group").children("button.dropdown-toggle").children("span:first-child").text($(this).text());
            });

            $("#searchButton").click(function() {
                
            });
            
            $("#resetButton").click(function() {
                $("#searchStr").val("");
            });
        });
    </script>
</head>
<body>
    <div class="input-group input-group-sm">
        <span class="btn-group btn-group-sm">
            <button id="searchButton" name="searchButton" type="button" class="btn btn-default" style="border-radius: 3px;">
                <span>&nbsp</span>
                <i class="fa fa-search"></i>
                <span>&nbsp</span>
            </button>
        </span>
        <input id="searchStr" name="searchStr" type="text" class="form-control" placeholder="input" style="width: 300px; !important; border-radius: 3px;">
        <span class="btn-group btn-group-sm">
            <button id="resetButton" name="resetButton" type="button" class="btn btn-default" style="border-radius: 3px;">
                <span>&nbsp</span>
                <i class="fa fa-remove"></i>
                <span>&nbsp</span>
            </button>
        </span>
        <span class="btn-group btn-group-sm">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <span>Danger</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a link="javascript:void(0)">click1</a></li>
                <li><a link="javascript:void(0)">click2</a></li>
                <li><a link="javascript:void(0)">click3</a></li>
                <li class="divider"></li>
                <li><a link="javascript:void(0)">click4</a></li>
                <li><a link="javascript:void(0)">click5</a></li>
            </ul>
        </span>
        <span class="btn-group btn-group-sm">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <span>year</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a link="javascript:void(0)">2012</a></li>
                <li><a link="javascript:void(0)">2013</a></li>
                <li><a link="javascript:void(0)">2014</a></li>
                <li class="divider"></li>
                <li><a link="javascript:void(0)">2015</a></li>
                <li><a link="javascript:void(0)">2016</a></li>
            </ul>
        </span>
    </div>
</body>
</html>
