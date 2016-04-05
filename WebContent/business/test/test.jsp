<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="test.js"></script>
</head>
<body>
	<form id="a">
		<input id="a_id" name="a_id" value="">
		<input id="a_name" name="a_name" value="">
		<input id="submit"  type="button" value="正则测试" onclick="test()">
		<input id="submit"  type="button" value="ajax异常捕获异常" onclick="ajaxexception()">
		<input id="submit"  type="button" value="error" onclick="error()">
	</form>
</body>
</html>