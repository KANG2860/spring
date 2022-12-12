<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> index 페이지입니다 </P>
<a href="/project/newView">newView페이지로 이동</a><br><br>
<a href=<c:url value="/newView"/>>newView페이지로 이동</a><br><br>

<img src="/project/resources/image/apple.png">
<img src=<c:url value="/resources/image/apple.png"/>>
</body>
</html>
