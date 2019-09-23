<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
  <link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Admin Vote Form</title>
  <meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/admin/admin-base-style.css" />">
</head>
<body>
	<f:form modelAttribute="voteForm" name="voteForm" action="/DevelopLab/admin/vote/register" method="POST">
		<div class="title">
			<h1>投票マスターデータ登録</h1>
		</div>
		<div class="form" id="form">

			<c:if test="${message != null}">
				${message}
				<br>
			</c:if>
			<div class="field">
				<label>タイトル</label>
				<f:input class="input" id="title" name="title" type="text" placeholder="タイトル"
					autocomplete="off" required="required" path="title" />
				<f:errors path="title" cssClass="error-messages"/>
			</div>
			<div class="field">
				<label>内容</label>
				<f:input class="input" id="comment" name="comment" type="text"
					placeholder="内容" path="comment" />
			</div>
			<div class="field">
				<label>イメージ画像URL</label>
				<f:input class="input" id="imageIcon" name="imageIcon" type="text"
					placeholder="イメージ画像URL" path="imageIcon" />
			</div>
			<div class="field">
				<label>締め切り日時</label>
				<f:input class="input" id="deadlineDate" name="deadlineDate" type="datetime-local"
					placeholder="締め切り日時" required="required" path="deadlineDate" />
			</div>
			<div class="field">
				<label>開始日時</label>
				<f:input class="input" id="startDate" name="startDate" type="datetime-local"
					placeholder="開始日時" required="required" path="startDate" />
			</div>
			<div class="field">
				<label>終了日時</label>
				<f:input class="input" id="endDate" name="endDate" type="datetime-local"
					placeholder="終了日時" required="required" path="endDate" />
			</div>
			<button class="button" id="submit">
				LOGIN
				<div class="side-top-bottom"></div>
				<div class="side-left-right"></div>
			</button>
			<small>Admin Home Form</small>
		</div>
	</f:form>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/admin/login.js" />"></script>
</body>
</html>
