<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
	<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
	<title>PROFILE</title>
	<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Bootstrap core CSS -->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />">
	<!-- Custom fonts for this template -->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" />">
	<!-- Plugin CSS -->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/magnific-popup/magnific-popup.css" />">
	<!-- Custom styles for this template -->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/freelancer.min.css" />">
	<!-- Font Size Over -->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-size-over.css" />">
</head>
<body id="page-top">

	<!-- Navigation -->
	<jsp:include page="navigation.jsp" flush="true" />

    <!-- Header -->
    <f:form modelAttribute="userProfileForm" action="/DevelopLab/profile/update" method="POST">
		<header class="masthead bg-primary text-white text-center">
			<div class="container">
				<img class="img-fluid mb-5 d-block mx-auto" src="${imageIconPath}" alt="">

				<h1 class="text-uppercase mb-0">
					profile
				</h1>
				<hr class="star-light">
				<h2 class="font-weight-light mb-0">
					ID:${userId}
					<br>NAME: ${name}
				</h2>
			</div>
		</header>

	    <!-- Contact Section -->
		<section id="contact">
			<div class="container">
				<h2 class="text-center text-uppercase text-secondary mb-0　font-over">プロフィール編集</h2>
				<hr class="star-dark mb-5">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<div class="control-group">
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<label>名前</label>
								<input class="form-control" id="name" name="name" type="text" maxlength="25" value=""
									placeholder="名前(仮)" required="required" data-validation-required-message="Please enter your name.">
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="control-group">
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<f:select class="form-control" name="gender" path="gender" placeholder="性別" required="required">
									<f:option value="" label="性別" />
									<f:options items="${genderType}" itemValue="kye" itemLabel="value" />
								</f:select>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="control-group">
							<label>年齢</label>
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<f:input class="form-control" id="age" name="age" path="age" type="number" placeholder="年齢" required="required"
									value="${age}" data-validation-required-message="年齢." />
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="control-group">
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<label>誕生日</label>
								<f:input class="form-control" id="birthday" name="birthday" path="birthday" type="date" placeholder="誕生日" required="required"
									onchange="birthdayAge()" data-validation-required-message="誕生日" />
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="control-group">
							<label>属性</label>
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<f:select class="form-control" name="sex" path="sex" placeholder="属性" required="required">
									<f:option value="" label="属性" />
									<f:options items="${sexType}" itemValue="kye" itemLabel="value" />
								</f:select>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<!--
						<div class="control-group">
							<div
								class="form-group floating-label-form-group controls mb-0 pb-2">
								<label>Message</label>
								<textarea class="form-control" id="message" rows="5"
									placeholder="Message" required="required"
									data-validation-required-message="Please enter a message."></textarea>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						-->
						<br>
						<div id="success"></div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-xl"
								id="sendMessageButton">Update</button>
						</div>
					</div>
				</div>
			</div>
		</section>
	</f:form>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-to-top d-lg-none position-fixed ">
      <a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top">
        <i class="fa fa-chevron-up"></i>
      </a>
    </div>

    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/vendor/jquery/jquery.min.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>

    <!-- Plugin JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/vendor/jquery-easing/jquery.easing.min.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/vendor/magnific-popup/jquery.magnific-popup.min.js" />"></script>

    <!-- Contact Form JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/js/jqBootstrapValidation.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/contact_me.js" />"></script>

    <!-- Custom scripts for this template -->
    <script type="text/javascript" src="<c:url value="/resources/js/freelancer.min.js" />"></script>

	<script>
	function birthdayAge() {
		var birthday = document.getElementById("birthday").value;
		// Dateインスタンスに変換
		const birthDate = new Date(birthday);

		// 文字列に分解
		const y2 = birthDate.getFullYear().toString().padStart(4, '0');
		const m2 = (birthDate.getMonth() + 1).toString().padStart(2, '0');
		const d2 = birthDate.getDate().toString().padStart(2, '0');

		// 今日の日付
		const today = new Date();
		const y1 = today.getFullYear().toString().padStart(4, '0');
		const m1 = (today.getMonth() + 1).toString().padStart(2, '0');
		const d1 = today.getDate().toString().padStart(2, '0');

		// 引き算
		const age = Math.floor((Number(y1 + m1 + d1) - Number(y2 + m2 + d2)) / 10000);
		document.getElementById("age").value = age;
	}
	</script>
</body>
</html>
