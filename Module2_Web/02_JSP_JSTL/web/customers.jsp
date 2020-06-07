<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Customer info</title>
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
    </style>
</head>
<body>

<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach items="${requestScope.customers}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.birthday}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><img src="<c:out value="${customer.avatar}"/>" alt="avatar" height="80px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
