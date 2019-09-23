<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
	<head>
		<title>第一回アプリアイコン投票完了</title>
		<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
		<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="<c:url value="/resources/assets/css/main.css"/>" />
		<noscript>
			<link rel="stylesheet" href="<c:url value="/resources/assets/css/noscript.css"/>" />
		</noscript>
	</head>
	<body class="is-preload">
		<!-- Header -->
			<header id="header">
				<div class="content">
					<h1>第一回アプリアイコン投票完了</h1>
					<p>投票して頂きありがとうございますヾ(*´∀｀*)ﾉ<br />
					ご投票頂いた方も恐らく喜んでおります。！！<br />
					投票結果発表時間：${deadline1}</p>
					上記の時間になりますと投票画面にて投票結果発が確認できます。！！<br />
				<br/>
				<a class="btn btn-primary btn-lg rounded-pill" href="/DevelopLab/vote">
					----- 投票画面に戻る -----
				</a>
				<br/>
				</div>
			</header>
		<!-- Scripts -->
			<script src="<c:url value="/resources/assets/js/jquery.min.js" />"></script>
			<script src="<c:url value="/resources/assets/js/jquery.scrolly.min.js"/>"></script>
			<script src="<c:url value="/resources/assets/js/browser.min.js"/>"></script>
			<script src="<c:url value="/resources/assets/js/breakpoints.min.js"/>"></script>
			<script src="<c:url value="/resources/assets/js/util.js"/>"></script>
			<script src="<c:url value="/resources/assets/js/main.js"/>"></script>
			<script src="<c:url value="/resources/assets/js/vote.js"/>"></script>
	</body>
</html>