<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
	<head>
		<title>投票結果</title>
		<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
		<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="<c:url value="/resources/css/paper-blizzard.css"/>" />
	</head>
	<body class="is-preload">
		<c:if test="${result}">
			<h1><a href="/DevelopLab/vote">投票画面に戻る</a></h1>
		</c:if>
		<h1><a href="/DevelopLab/home">ホームに戻る</a></h1>
		<canvas id="canvas">
		</canvas>
		<c:if test="${result}">
			<h1>
				<br>${title}
				<br>結果発表ヽ(´▽｀)/
				<br>★★★★★　当選者　★★★★★
				<c:forEach var="resultVoteInfo" items="${resultVoteInfoList}" varStatus="status">
					<br>${status.count}位:${resultVoteInfo.getVoteInfo().getUserName()}
					<br>投票数:${resultVoteInfo.getVoteInfoUserList().size()}
					<br>
					<br>☆☆☆☆　投票者一覧　☆☆☆☆
					<br>
					<c:forEach var="resultVoteInfoUser" items="${resultVoteInfo.getVoteInfoUserList()}" varStatus="status">
						<br>${resultVoteInfoUser.getUserName()}
					</c:forEach>
					<br>
					<br>★★★★★★★★★★★★★★★
				</c:forEach>
			</h1>
		</c:if>
		<c:if test="${!result}">
			<h1>
				<br>投票イベントは終了しました。
				<br>次の投票イベントをお待ち下さい。
<br>┻┳|        |┳┻
<br>┳┻|_∧ 　∧_|┻┳
<br>┻┳|･ω･) 　 (•ω•|┳┻
<br>┳┻|⊂ﾉ 　 　(つ|┻┳
<br>┻┳|∪　 　 　 し|┳┻
				<br>
			</h1>
		</c:if>
		<!-- Scripts -->
		<script type="text/javascript" src="<c:url value="/resources/vendor/jquery/jquery.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/paper-blizzard.js"/>"></script>
	</body>
</html>