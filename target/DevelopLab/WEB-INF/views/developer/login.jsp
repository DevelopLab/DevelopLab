<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="ja"> <!--<![endif]-->
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
  <title>Developer Login Form</title>
  <meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
  <h1>Developer Login Form</h1>
  <f:form modelAttribute="loginForm" name="loginForm" action="/DevelopLab/developer/login" method="POST" class="login">
    <p>
      <label for="login">ID:</label>
      <input type="text" name="id" id="id" value="">
    </p>

    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" value="">
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.html">Forgot your password?</a></p>
  </f:form>

  <section class="about">
    <p class="about-links">
      <a href="/DevelopLab/login" target="_parent">ユーザログイン画面へ</a>
      <!-- <a href="http://www.cssflow.com/snippets/dark-login-form.zip" target="_parent">Download</a> -->
    </p>
    <p class="about-author">
      &copy; 2018&ndash;11-24 <a href="" target="_blank"></a>
      <!-- <a href="http://www.cssflow.com/mit-license" target="_blank">MIT License</a><br>  -->
      <!-- Original PSD by <a href="http://365psd.com/day/2-234/" target="_blank">Rich McNabb</a> -->
  </section>
</body>
</html>
