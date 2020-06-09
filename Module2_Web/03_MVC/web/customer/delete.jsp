<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Xóa khách hàng</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
        body {
            padding: 20px;
            max-width: 300px;
            margin: auto;
        }
    </style>
</head>
<body>
<div>
    <c:set var="customer" value="${requestScope.customer}"/>
    <p>Bạn muốn xóa khách hàng <c:out value="${customer.name}"/>?</p>
    <p>Email: <c:out value="${customer.email}"/></p>
    <p>Địa chỉ: <c:out value="${customer.address}"/></p>
</div>
<form method="post">
    <input type="text" name="id" value="${customer.id}" hidden>
    <input class="btn btn-danger form-control" type="submit" value="Xóa khách hàng">
</form>
</body>
</html>
