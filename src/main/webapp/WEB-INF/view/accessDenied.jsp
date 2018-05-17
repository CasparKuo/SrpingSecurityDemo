<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AccessDenied Page</title>
    </head>
    <body>
        Dear <strong>${user}</strong>, You are not authorized to access this page
        <a href="<c:url value="/logout" />">Logout</a>
    </body>
</html>