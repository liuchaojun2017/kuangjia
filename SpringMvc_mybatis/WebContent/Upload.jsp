<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<script type="text/javascript">
    var par='{"id":1,"name":"张三","age":15,"money":15}';
	$(function(){
		alert("进入");
		$("#df").click(function(){
			
		console.log(par);
		alert("点击方式");
			
		
		$.ajax({
			    type:"POST",
		        url:"${pageContext.request.contextPath }/item/jdf.action",
		        contentType: "application/json; charset=utf-8",
		        data:par,
		        async:false,
		        dataType: "json",
		        success: function (data) {
		        	console.log(data);
		        	alert(data.name);
		            if (data !=null) {
		                alert("请求已提交！我们会尽快与您取得联系");
		                $("#df").css({"background-color":"yellow","width":"200px"}).html(data.id);
		            }
		        },
		        error: function (data) {
		            $("#request-process-patent").html("提交数据失败！");
		        }
		})
		
		
		})
		
	})
</script>
	<form action="${pageContext.request.contextPath }/item/upload.action" method="post" enctype="multipart/form-data">
		<input type="file" name="picture">
		<input type="submit" value="提交">
	</form>
	<div id="df" style="background: red;width: 100px;height: 100px"></div>
	
</body>
</html>