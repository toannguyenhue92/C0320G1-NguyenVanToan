<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Thay đổi thông tin khách hàng</title>
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
<p>
    <a class="btn btn-primary form-control" role="button" href="home">Trờ về danh sách khách hàng</a>
</p>
<c:set value="${requestScope.customer}" var="customer"/>
<form method="post">
    <div class="form-group">
        <label for="full_name">Họ và tên</label>
        <input class="form-control" type="text" id="full_name" name="full_name" value="${customer.name}">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input class="form-control" type="text" id="email" name="email" value="${customer.email}">
    </div>
    <div class="form-group">
        <label for="address">Địa chỉ</label>
        <input class="form-control" type="text" id="address" name="address" value="${customer.address}">
    </div>
    <div class="form-group">
        <input class="btn btn-success form-control" type="submit" value="Cập nhật">
    </div>
</form>
</body>
</html>
