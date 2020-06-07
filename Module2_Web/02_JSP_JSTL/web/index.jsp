<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JSP and JSTL</title>
</head>
<body>
<form method="get" action="currency_converter.jsp">
    <table>
        <tr>
            <td colspan="2">
                <h3>Chuyển đổi tiền tệ</h3>
            </td>
        </tr>
        <tr>
            <td>Rate</td>
            <td>
                <input type="number" name="rate" value="22000"/>
            </td>
        </tr>
        <tr>
            <td>USD</td>
            <td>
                <input type="number" name="usd" value="0"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" id="submit" value="Chuyển đổi"/>
            </td>
        </tr>
    </table>
</form>
<br>
<form action="english-vietnamese-dict.jsp" method="get">
    <table>
        <tr>
            <td colspan="2">
                <h3>Từ điển English-Vietnamese</h3>
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" name="search" placeholder="Nhập từ muốn tìm">
            </td>
            <td>
                <input type="submit" value="Tìm kiếm">
            </td>
        </tr>
    </table>
</form>
<br>
<form action="calculate" method="get">
    <table>
        <tr>
            <td colspan="2">
                <h3>Máy tính đơn giản</h3>
            </td>
        </tr>
        <tr>
            <td>Số hạng 1</td>
            <td>
                <input type="number" name="first_operand">
            </td>
        </tr>
        <tr>
            <td>Phép tính</td>
            <td>
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Số hạng 2</td>
            <td>
                <input type="number" name="second_operand">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Tính toán">
            </td>
        </tr>
    </table>
</form>
<br>
<a href="customers">Hiển thị thông tin khách hàng</a>
</body>
</html>
