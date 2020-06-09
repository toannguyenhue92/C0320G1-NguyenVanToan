<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Customer List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
        table {
            border-collapse: collapse;
            border: 1px solid black;
        }

        td {
            padding: 15px;
            text-align: left;
            border: 1px solid black;
        }

        th {
            padding: 15px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
            border: 1px solid black;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        body {
            padding: 20px;
        }
    </style>
</head>
<body>
<p>
    <a class="btn btn-primary" role="button" href="?action=create">Thêm khách hàng mới</a>
</p>
<c:if test="${requestScope.message !=null}">
    <p><c:out value="${requestScope.message}"/></p>
</c:if>
<table>
    <tr>
        <th>Tên khách hàng</th>
        <th>Email</th>
        <th>Địa chỉ</th>
        <th>Chỉnh sửa thông tin</th>
        <th>Xóa khách hàng</th>
    </tr>
    <c:forEach items="${requestScope.customers}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.email}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><a href="?action=edit&id=${customer.id}">Cập nhật</a></td>
            <td><a href="?action=delete&id=${customer.id}">Xóa</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
