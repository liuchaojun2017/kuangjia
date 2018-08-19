<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">

  table,table tr th, table tr td { border:1px solid #0094ff; }
  td{
  	height: 20px;
  	width: 50px;
  	text-align: center;
  }
</style>
</head>
<body>
<form action="${pageContext.request.contextPath }/item/edit.action" method="post">
	<table cellpadding="0" cellspacing="0" align="center">
		 <c:forEach items="${UserList}" var="usr" varStatus="s">
		 	<tr>
		 	<td>
		 	<input type="checkbox" name="ids" value="${usr.id}">
		 	</td>
		 	<td>${usr.id }</td>
		 	<td><input type="text" name="userlist[${s.index}].name" value="${usr.name}"/>
		 	</td>
		 	<td>${usr.age }</td>
		 	<td>${usr.money }</td></tr>
		 
		 </c:forEach>
		 <tr><td colspan="5"><input type="submit" value="修改"/></td></tr>
	</table>
 </form>
 <a href="${pageContext.request.contextPath}/item/edit.action?id=${name}">修改</a>
</body>
</html>