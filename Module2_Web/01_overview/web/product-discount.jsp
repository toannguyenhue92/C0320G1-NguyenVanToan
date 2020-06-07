<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="product-discount" method="post">
    <table>
        <tr>
            <td>
                <label>Tên sản phẩm</label>
            </td>
            <td>
                <label>
                    <input type="text" name="product_name" value="RedBull">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label>Giá niêm yết</label>
            </td>
            <td>
                <label>
                    <input type="text" name="price" value="10000">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label>Tỷ lệ chiết khấu</label>
            </td>
            <td>
                <input type="text" name="discount_percent" value="10">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Tính">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
