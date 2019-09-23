<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
	<title>LOGIN</title>
	<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
	<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login-top.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css" />">
</head>
<body>
<body>
	<div class="wrapper">
	    <div class="container">
	        <h1>Develop Lab</h1>

	        <f:form modelAttribute="loginForm" name="loginForm" action="/DevelopLab/login" method="POST">
	            <input id="id" name="id" type="text" placeholder="Id Input">
	            <input id="password" name="password" type="password" placeholder="Password Input">
	            <button type="submit" id="login-button">Login</button>
	        </f:form>
	    </div>

	    <ul class="bg-bubbles">
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	        <li></li>
	    </ul>
	</div>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.js" />"></script>

	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.label_better.js" />"></script>
	<script>
	 $("#login-button").click(function(event) {
        event.preventDefault();
     	$('form').fadeOut(500);
     	$('.wrapper').addClass('form-success');
        //submit()でフォームの内容を送信
        document.loginForm.submit();
	});
	</script>
</body>
</html>
