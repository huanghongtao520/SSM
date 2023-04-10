<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
</head>
<body>
<table class="tablelist">
        <thead>
        <tr>
            <th>图书编号</th>
            <th>图书名称</th>
            <th>图书数量</th>
            <th>图书详情</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                </tr>
            </c:forEach>
        </tbody>
</table>
</body>
</html>
