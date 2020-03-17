<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>jsp</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
<table border="1px">
    <tr>
        <td>科目编号</td>
        <td>科目名称</td>
        <td>科目备注</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${subjects}" var="subjects">
        <tr>
            <td>${subjects.subjectsId}</td>
            <td>${subjects.subjectsName}</td>
            <td>${subjects.subjectsRem}</td>
            <td>
                <a style="text-decoration: underline" onclick="updateSubjects(${subjects.subjectsId})">修改</a>&nbsp;|&nbsp;
                <a style="text-decoration: underline" onclick="deleteSubjects(${subjects.subjectsId})">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
subjectsName:<input type="text" name="subjectsName" id="subjectsName"/>
subjectsRem:<input type="text" name="subjectsRem" id="subjectsRem"/>
<input type="button" value="新增" onclick="addSubjects();">
<script type="text/javascript">
    function addSubjects() {
        var subjectsName = $("#subjectsName").val();
        var subjectsRem = $("#subjectsRem").val();
        var para = {"subjectsName": subjectsName, "subjectsRem": subjectsRem};

        $.ajax({
            type: 'post',
            url: '/subjects/addByJson',
            contentType: 'application/json;charset=utf-8',
            dataType: 'json',
            data: JSON.stringify(para),
            success: function (result) {
                alert("成功新增： " + result + "行");
            }
        })
    }
</script>
<script type="text/javascript">
    function deleteSubjects(subjectsId) {
        $.ajax({
            type: 'post',
            url: '/subjects/deleteSubjects?subjectsId=' + subjectsId,
            contentType: 'application/json;charset=utf-8',
            dataType: 'text',
            success: function (result) {
                alert("成功删除： " + result + "行");
            }
        })
    }
</script>
<script type="text/javascript">
    function updateSubjects(subjectsId) {
        var subjectsName = $("#subjectsName").val();
        var subjectsRem = $("#subjectsRem").val();
        var para = {"subjectId":subjectsId, "subjectsName": subjectsName, "subjectsRem": subjectsRem};

        $.ajax({
            type: 'post',
            url: '/subjects/updByJson',
            contentType: 'application/json;charset=utf-8',
            dataType: 'json',
            data: JSON.stringify(para),
            success: function (result) {
                alert("成功修改： " + result + "行");
            }
        })
    }
</script>
</body>
</html>