<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/logintype.action">
	姓名：<input type="text" name="username">
	<label for="pwd">
	密码：<input type="text" name="pwd" id="pwd">
	</label>
	<input type="submit" value="提交">
	
</form>

<button onclick="tiao(this)" name="show" > 点击show</button>
<button onclick="tiao(this)" name="see">点击see</button>

<script type="text/javascript">
function tiao(a){
	alert(a.getAttribute("name"));
	window.location.href="${pageContext.request.contextPath}/user_"+a.getAttribute("name")+".action";
}
</body>
</html>