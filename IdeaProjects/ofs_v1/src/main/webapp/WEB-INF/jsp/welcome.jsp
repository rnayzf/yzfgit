<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>jsp</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
<p1>OFS信息管理系统</p1>&nbsp;&nbsp;
<a href="/subjectsWeb/insertSubjects">添加科目信息</a>
<a href="/subjectsWeb/selectSubjects">查询科目信息</a>
<table width="50%" border=1>
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
                <a style="cursor:pointer" href="/subjectsWeb/updateSubjects/${subjects.subjectsId}">修改</a>&nbsp;|&nbsp;
                <a style="cursor:pointer;text-decoration: underline" onclick="deleteSubjects(${subjects.subjectsId})">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    function deleteSubjects(subjectsId) {
        $.ajax({
            type: 'post',
            url: '/subjects/deleteSubjects?subjectsId=' + subjectsId,
            contentType: 'application/json;charset=utf-8',
            dataType: 'text',
            success: function (result) {
                alert("成功删除： " + result + "行");
                window.location.reload();
            },
            error: function () {
                alert("删除失败");
                window.location.reload();
            }
        })
    }
</script>
</body>
</html>