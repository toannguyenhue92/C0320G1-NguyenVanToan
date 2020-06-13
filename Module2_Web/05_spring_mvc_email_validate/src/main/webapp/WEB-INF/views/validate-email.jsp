<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Kiểm tra email</title>
</head>
<body>
<c:choose>
    <c:when test="${result == true}">
        <p>Email hợp lệ</p>
    </c:when>
    <c:when test="${result == false}">
        <p>Email không hợp lệ</p>
    </c:when>
</c:choose>
</body>
</html>