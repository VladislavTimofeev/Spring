<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Books</title>
</head>
<body>
<h1>Hello Books</h1>
<c:forEach items="${books}" var="book">
    <tr>
        <td>
                ${book.id}
        </td>
        <td>
                ${book.numberOfPage}
        </td>
        <td>
                ${book.title}
        </td>
        <td>
                ${book.releaseYear}
        </td>
    </tr>
</c:forEach>
</body>
</html>