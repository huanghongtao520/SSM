<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍展示</title>
</head>
<body>
<form action="/book/queryOneBook" method="post">
    <label>通过ID查询书籍：</label><input type="text" name="bookID">
    <input type="submit" value="查询">
</form>
<table class="tablelist">
        <thead>
        <tr>
            <th>图书编号</th>
            <th>图书名称</th>
            <th>图书数量</th>
            <th>图书详情</th>
            <th style="font-weight: bold">操作</th>
        </tr>
        </thead>
        <tbody>
        <!--使用c 标签需要引入taglib prefix="c" 等-->
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td><a href="/book/deleteBook/${book.bookID}">删除</a> </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<h3>添加图书</h3>
<div >
    <form action="/book/addBook" method="post">
        <label>图书编号：</label><input type="text" name="bookID"><br>
        <label>图书名称：</label><input type="text" name="bookName"><br>
        <label>图书数量：</label><input type="text" name="bookCounts"><br>
        <label>图书详情：</label><input type="text" name="detail"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
