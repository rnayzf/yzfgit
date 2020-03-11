<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>jsp</title>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
<table border="1px">
    <tr>
        <td>科目编号</td>
        <td>科目名称</td>
        <td>科目备注</td>
    </tr>
    <c:forEach items="${subjects}" var="subjects">
        <tr>
            <td>${subjects.subjectsId}</td>
            <td>${subjects.subjectsName}</td>
            <td>${subjects.subjectsRem}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>