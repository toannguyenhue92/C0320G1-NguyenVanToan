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
<form method="post" action="validate">
    <label for="email" hidden>Email</label>
    <input type="text" id="email" name="email" placeholder="Địa chỉ email">
    <input type="submit" value="Kiểm tra">
</form>
<p><a href="world-clock">Xem giờ thế giới</a></p>
<p><a href="employee/show-form">Thêm nhân viên mới</a></p>
<p><a href="sandwich">Sandwich</a></p>
</body>
</html>