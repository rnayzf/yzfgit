<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>查询</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<h3>welcome to OFS_V1.0....</h3>
    ****************模糊查询***********<br/>
<form action="/subjectsWeb/selSubjects" method="get">
    请输入您要查询的科目名称：<input type="text" name="name"/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>