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
<form action="sandwich/save" method="post">
    <input type="checkbox" id="lettuce" name="condiments" value="lettuce">
    <label for="lettuce">Lettuce</label>
    <input type="checkbox" id="tomato" name="condiments" value="tomato">
    <label for="tomato">Tomato</label>
    <input type="checkbox" id="mustard" name="condiments" value="mustard">
    <label for="mustard">Mustard</label>
    <input type="checkbox" id="sprouts" name="condiments" value="sprouts">
    <label for="sprouts">Sprouts</label>
    <input type="submit" value="Save">
</form>
</body>
</html>