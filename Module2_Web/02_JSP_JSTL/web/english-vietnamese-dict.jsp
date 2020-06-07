<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>English-Vietnamese Dictionary</title>
</head>
<body>
<%
    Map<String,String> dictionary = new HashMap<>();
    dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Quyển vở");
    dictionary.put("computer", "Máy tính");
    String search = request.getParameter("search");
    String result = dictionary.get(search);
    if (result != null) {
        out.println("English: " + search);
        out.println(", Tiếng Việt: " + result);
    } else {
        out.println("Không tìm thấy!");
    }
%>
</body>
</html>
