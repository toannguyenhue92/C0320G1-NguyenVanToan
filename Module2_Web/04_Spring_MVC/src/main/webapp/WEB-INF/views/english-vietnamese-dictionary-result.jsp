<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Từ điển Anh-Việt</title>
</head>
<body>
<c:if test="${result==null}">
    <p>Không tìm thấy!</p>
</c:if>
<c:if test="${result!=null}">
    <p>${result}</p>
</c:if>
</body>
</html>
