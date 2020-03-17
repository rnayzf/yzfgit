<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>修改</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
<table border="1px">
    <tr>
        <td>科目编号</td>
        <td>科目名称</td>
        <td>科目备注</td>
    </tr>
        <tr>
            <td><input type="text" disabled="disabled" id="subjectsId" value="${subjects.subjectsId}"/></td>
            <td><input type="text" id="subjectsName" value="${subjects.subjectsName}"/></td>
            <td><input type="text" id="subjectsRem" value="${subjects.subjectsRem}"/></td>
            <td><input type="submit" value="确认修改" onclick="updateSubjects()"/></td>
<%--            <td><input type="submit" value="确认修改" onclick='updateSubjects("subjects")'/></td>--%>
        </tr>
</table>
<script type="text/javascript">
    function updateSubjects() {
        var subjectsId = document.getElementById("subjectsId").value;
        var subjectsName = document.getElementById("subjectsName").value;
        var subjectsRem = document.getElementById("subjectsRem").value;
        var para = {"subjectsId":subjectsId, "subjectsName": subjectsName, "subjectsRem": subjectsRem};

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