<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>文件处理</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript">
        function doUpload() {
            var upl = document.getElementById("upload");
            upl.submit();
        }

        function doDownload() {
            var upl = document.getElementById("download");
            upl.submit();
        }
    </script>
</head>
<body>

<form id="upload" enctype="multipart/form-data" method="post" action="/employee/uploadFile">
    <input id = "uploadFile" type="file" name="uploadFile"/>
    <input type="button" value="文件上传" onclick="doUpload()"/>
</form>

<div>
    <a href="/employee/getEmployee?pageNum=1">员工列表</a>
</div>

<table border="1px">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${PageInfo.list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>
                <a  onclick="">删除</a> &nbsp;|&nbsp;
                <a  onclick="">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
<div>
    当前第${PageInfo.pageNum}页，总共${PageInfo.pages}页，总共${PageInfo.total}条记录
</div>
<div>
    <a href="/employee/getEmployee?pageNum=1">首页</a>
    <c:if test="${PageInfo.pageNum != 1 }">
        <a href="/employee/getEmployee?pageNum=${PageInfo.pageNum-1}">上一页</a>
    </c:if>
    <c:if test="${PageInfo.pageNum != PageInfo.pages }">
        <a href="/employee/getEmployee?pageNum=${PageInfo.pageNum+1}">下一页</a>
    </c:if>
    <a href="/employee/getEmployee?pageNum=${PageInfo.pages}">尾页</a>
</div>
</body>
</html>