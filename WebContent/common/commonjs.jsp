<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/validate/jquery.validate.js"></script>
	<script src="${pageContext.request.contextPath}/common/tools.js"></script>
	<script src="${pageContext.request.contextPath}/common/pagejs.js"></script>
	 <script src="${pageContext.request.contextPath}/assets/js/content.min.js?v=1.0.0"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/validate/jquery.validate.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/validate/messages_zh.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/demo/form-validate-demo.min.js"></script>
	 <script type="text/javascript">
		var path = "<%=path%>";
	 </script>
</head>

</html>