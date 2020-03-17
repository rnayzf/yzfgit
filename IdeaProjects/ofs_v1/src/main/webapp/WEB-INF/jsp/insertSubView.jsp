<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>添加</title>
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
            <td><input type="text" id="subjectsId" value=""/></td>
            <td><input type="text" id="subjectsName" value=""/></td>
            <td><input type="text" id="subjectsRem" value=""/></td>
            <td><input type="submit" value="提交" onclick="insertSubjects()"/></td>
        </tr>
</table>
<script type="text/javascript">
    function insertSubjects() {
        var subjectsId = document.getElementById("subjectsId").value;
        var subjectsName = document.getElementById("subjectsName").value;
        var subjectsRem = document.getElementById("subjectsRem").value;
        var para = {"subjectsId":subjectsId, "subjectsName": subjectsName, "subjectsRem": subjectsRem};

        $.ajax({
            type: 'post',
            url: '/subjects/addByJson',
            contentType: 'application/json;charset=utf-8',
            dataType: 'json',
            data: JSON.stringify(para),
            success: function (result) {
                alert("成功新增： " + result + "行");
                window.location.reload();
            },
            error: function(){
                alert("新增失败,记录已存在")
            }
        })
    }
</script>
</body>
</html>