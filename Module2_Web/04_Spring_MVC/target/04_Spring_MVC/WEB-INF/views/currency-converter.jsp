<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<form action="calculate" method="post">
    <label for="rate">Tỉ giá</label>
    <input type="number" name="rate" id="rate" value="22000">
    <label for="usd">USD</label>
    <input type="number" name="usd" id="usd" value="100">
    <input type="submit" value="Tính toán">
</form>
</body>
</html>
