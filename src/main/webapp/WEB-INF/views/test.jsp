<!doctype html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" items="${messages}">
    <c:out value="${i.id}"/> and <c:out value="${i.message}"/> <br>
</c:forEach>
<c:out value="${text}"/>
<br>
<img src="/static/image/bambi.jpeg"/>
</body>
</html>
