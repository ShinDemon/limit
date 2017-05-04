<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/17
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Module10</title>
    <script src="jquery-2.1.4/jquery.min.js" type="application/javascript"></script>
    <script src="bootstrap-3.3.0-dist/js/bootstrap.min.js" type="application/javascript"></script>
    <link href="bootstrap-3.3.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script type="application/javascript">
        var json = '[{"first": 11, "second": 12, "third": 13, "forth": 14, "fifth": 15},{"first": 21, "second": 22,"third": 23,"forth": 24,"fifth": 25}, {"first": 31,"second": 32,"third": 33,"forth": 34,"fifth": 35},{"first": 41,"second": 42,"third": 43,"forth": 44,"fifth": 45},{"first": 51,"second": 52,"third": 53,"forth": 54,"fifth": 55}]';
        var rowNum;
        var columnNumer;
        var selectRow;

        $(document).ready(function() {
            loadData($("table.table"), json);

            $("tbody tr").click(function() {
                selectRow = $(this);
            });

            $("tbody tr").click(function() {
                rowNum = $(this).prevAll("tr").length;;
                //return $(this).prevAll("tr").length;
            });

            $("tbody tr td").click(function() {
                columnNumer = $(this).prevAll("td").length;
                //return $(this).prevAll("td").length;
            });
        });

        function loadData(table, jsonString) {
            var dataGroup = JSON.parse(jsonString);
            var key = [];
            table.find("th").each(function() {
                key.push($(this).attr("data-key"));
            });
            for(var i=0; i<dataGroup.length; i++) {
                var data = dataGroup[i];
                var appendString = "<tr>";
                for(var j=0; j<key.length; j++) {
                    appendString += "<td>" + data[key[j]] + "</td>";
                }
                appendString += "</tr>";
                table.children("tbody").append(appendString);
            }
        }
    </script>
</head>
<body>
    <table class="table table-hover">
        <caption>响应式表格布局</caption>
        <thead>
            <tr>
                <th data-key="first">FIRST</th>
                <th data-key="second">SECOND</th>
                <th data-key="third">THIRD</th>
                <th data-key="forth">FORTH</th>
                <th data-key="fifth">FIFTH</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</body>
</html>
