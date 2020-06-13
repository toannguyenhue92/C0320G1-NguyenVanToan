<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trang chủ</title>
</head>
<body>
<h3>Thông tin nhân viên</h3>
<table>
    <tr>
        <td>Họ và tên</td>
        <td>${employee.name}</td>
    </tr>
    <tr>
        <td>ID nhân viên</td>
        <td>${employee.id}</td>
    </tr>
    <tr>
        <td>Số điện thoại</td>
        <td>${employee.contactNumber}</td>
    </tr>
</table>
</body>
</html>