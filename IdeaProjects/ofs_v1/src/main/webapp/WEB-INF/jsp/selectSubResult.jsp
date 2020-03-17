<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>查询</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
<table width="50%" border=1>
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