<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
<meta http-equiv="Content-Script-Type"
	content="text/javascript; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />">
<!-- Custom fonts for this template -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" />">
<!-- Plugin CSS -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/vendor/magnific-popup/magnific-popup.css" />">
<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/freelancer.min.css" />">
<!-- Font Size Over -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/font-size-over.css" />">
<!-- Loader -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/loader.css" />">
<!-- Notice -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/notice.css" />">
</head>
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase" id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top">Develop Lab</a>
			<button
				class="navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded"
				type="button" data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fa fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
						href="/DevelopLab/home">HOME</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
						href="/DevelopLab/profile">PROFILE</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
						href="/DevelopLab/logout">LOGOUT</a></li>
					<c:if test="${userAuthority != 'USER'}">
						<li class="nav-item mx-0 mx-lg-1 newicon"><a
							class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
							href="/DevelopLab/developer/login">DEVELOPER LOGIN</a></li>
					</c:if>
					<c:if test="${userAuthority == 'ADMIN'}">
						<li class="nav-item mx-0 mx-lg-1 adminicon"><a
							class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
							href="/DevelopLab/admin/login">ADMIN LOGIN</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</nav>
</html>