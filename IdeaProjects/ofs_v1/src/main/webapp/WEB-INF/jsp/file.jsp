<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<head meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
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
<form id="upload" enctype="multipart/form-data" method="post" action="/file/uploadFile">
    <input id = "uploadFile" type = "file" name = "uploadFile"/>
    <input type = "button" value = "文件上传" onclick = "doUpload()"/>
</form>
<p>图片：</p >
<img src="${filename}"/>
</body>
</html>