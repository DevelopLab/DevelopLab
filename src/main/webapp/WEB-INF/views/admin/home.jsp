<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
  <link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Admin Home Form</title>
  <meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/admin/login.css" />">
</head>
<body>
	<f:form modelAttribute="loginForm" name="loginForm" action="/DevelopLab/admin/login" method="POST">
		<div class="form" id="form">
			<div class="field email">
				<div class="icon"></div>
				<input class="input" id="id" name="id" type="text" placeholder="ID"
					autocomplete="off" />
			</div>
			<div class="field password">
				<div class="icon"></div>
				<input class="input" id="password" name="password" type="password"
					placeholder="PASSWORD" />
			</div>
			<button class="button" id="submit">
				LOGIN
				<div class="side-top-bottom"></div>
				<div class="side-left-right"></div>
			</button>
			<small>Admin Login Form</small>
		</div>
	</f:form>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/admin/login.js" />"></script>
</body>
</html>
