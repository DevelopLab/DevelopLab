<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
	<head>
		<title>投票画面</title>
		<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
		<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="<c:url value="/resources/assets/css/main.css"/>" />
		<noscript>
			<link rel="stylesheet" href="<c:url value="/resources/assets/css/noscript.css"/>" />
		</noscript>
	</head>
	<body class="is-preload">
		<c:if test="${voteInfo}">
		<!-- Header -->
			<header id="header">
				<div class="content">
					<h1>${title}</h1>
					<p>${comment}<br />
					下記投票者欄に名前を入力して投票してください！！<br />
					投票締め切り時間：${deadline}<br />
					※上記の時間になりますと投票結果が確認できます。！！
					</p>
				</div>
			</header>

		<!-- One -->
			<section id="one" class="wrapper style2 special">
				<header class="inner align-center">
					<h2>投票者</h2>
					<input type="text" id="user_name_field" maxlength="25" required="required" placeholder="投票者名" class="align-center" />
				</header>
			</section>
		<!-- Two -->
			<section id="two" class="wrapper">
				<div class="inner alt">
					<c:forEach var="item" items="${voteInfoList}">
						<section class="spotlight">
							<div class="image"><img src="${item.getImageIcon()}" alt="" /></div>
							<div class="content">
								<p><c:out value="${item.getVoteComment()}" /></p>
								<h3><input type="button" value="投票" onClick="voteSubmit(${item.getVoteNumber()});" /></h3>
							</div>
						</section>
					</c:forEach>
				</div>
			</section>
			<!-- Three -->
			<form id="vote_submit" action="/DevelopLab/vote/register" method="post">
				<input type="hidden" id="vote_id" name="vote_id" value="1"/>
				<input type="hidden" id="vote_number" name="vote_number" value=""/>
				<input type="hidden" id="user_name" name="user_name" value=""/>
				<input type="hidden" id="user_agent" name="user_agent" value=""/>
			</form>
		<!-- Footer -->
			<footer id="footer"></footer>
		</c:if>

		<c:if test="${!voteInfo}">
			<!-- Header -->
			<header id="header">
				<div class="content">
					<h1>${title}</h1>
					<p>投票終了しました。！！！<br />
					以下のボタンから投票結果を確認できます！！</p>
					<h3><input type="button" value="結果を確認" onClick="voteResultSubmit();" /></h3>
				</div>
			</header>
		<!-- Two -->
			<section id="two" class="wrapper">
				<div class="inner alt">
					<c:forEach var="item" items="${voteInfoList}">
						<section class="spotlight">
							<div class="image"><img src="${item.getImageIcon()}" alt="" /></div>
							<div class="content">
								<p><c:out value="${item.getUserName()}" /></p>
							</div>
						</section>
					</c:forEach>
				</div>
			</section>
		<!-- Three -->
			<form id="vote_result_submit" action="/DevelopLab/vote/result" method="post"></form>
		</c:if>

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