<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<%
    double rate = Double.parseDouble(request.getParameter("rate"));
    double usd = Double.parseDouble(request.getParameter("usd"));
    double vnd = usd * rate;
%>
<h1>
    Rate: <%=rate%>
</h1>
<h1>
    USD: <%=usd%>
</h1>
<h1>
    VND: <%=vnd%>
</h1>
</body>
</html>
