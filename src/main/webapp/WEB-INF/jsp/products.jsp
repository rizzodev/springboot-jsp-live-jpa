<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <div>
        <c:forEach items="${products}" var="product">
            <div>${product.id}</div>
            <a href="/products/${product.id}">${product.name}</a>
            <br>
        </c:forEach>
    </div>
</body>
</html>
