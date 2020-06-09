<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Thêm mới khách hàng</title>
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
<form method="post">
    <div class="form-group">
        <label for="full_name">Họ và tên</label>
        <input class="form-control" type="text" id="full_name" name="full_name" value="Toàn Nguyễn">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input class="form-control" type="text" id="email" name="email" value="toan@icloud.com">
    </div>
    <div class="form-group">
        <label for="address">Địa chỉ</label>
        <input class="form-control" type="text" id="address" name="address" value="Huế">
    </div>
    <div class="form-group">
        <input class="btn btn-success form-control" type="submit" value="Thêm mới khách hàng">
    </div>
</form>
</body>
</html>
