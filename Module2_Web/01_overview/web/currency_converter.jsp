<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Currency converter</title>
</head>
<body>
<form method="get" action="convert">
    <table>
        <tr>
            <td>Rate:</td>
            <td><label>
                <input type="text" name="rate" placeholder="RATE" value="22000"/>
            </label></td>
        </tr>
        <tr>
            <td>USD:</td>
            <td><label>
                <input type="text" name="usd" placeholder="USD" value="0"/>
            </label></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" id="submit" value="Converter"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
