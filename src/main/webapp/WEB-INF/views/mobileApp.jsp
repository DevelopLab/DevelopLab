<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
<title>Mobile App</title>
	<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
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
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/icon-img.css" />">
</head>
<body id="page-top">

	<!-- Navigation -->
	<jsp:include page="navigation.jsp" flush="true" />

	<header class="masthead bg-primary text-white text-center font-over">
		<div class="container">
			<img class="img-fluid mb-5 d-block mx-auto"
				src="<c:url value="/resources/images/ios-and-android.png" />" alt="">
			<h1 class="text-uppercase mb-0　font-over">
				Mobile App
			</h1>
			<hr class="star-light">
			<div class="font-weight-light">
				モバイルアプリケーション。
				<br>スマートホンやタブレット型端末向けのアプリケーションソフト。
				<br>iOSまたはアンドロイドなどの実行環境に対応したソフトがあり、
				<br>アップやグーグルプレーなどのコンテンツ配信サービスを利用せず
				<br>webサイトからダウンロードして可能となっています。
				<br>
			</div>
		</div>
	</header>

	<!-- IOS セットアップ -->
	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0 font-over">iosアプリをインストールする場合は、 <br>以下のセットアップが必須です。</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<a class="mx-auto portfolio-item btn-primary btn btn-lg" href="#iosUdid">
						端末のセットアップ
					</a>
				</div>
			</div>
		</div>
	</section>
	<div class="portfolio-modal mfp-hide" id="iosUdid">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss" href="#">
				<i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/ios_logo.jpg" />" alt="">
						<h2 class="text-secondary text-uppercase mb-0">IOS セットアップ</h2>
						<p class="mb-5　font-over">
							IOSアプリをインストールする場合は、下記のセットアップが必要です。
							<br>①端末に証明書をインストール。
							<br>②端末のUDIDの登録依頼をする。
							<br>※登録が完了するまでは、アプリのインストールができません。
						</p>
						<hr class="star-dark mb-5">
			            <a class="btn btn-primary btn-lg rounded-pill" href="https://1drv.ms/u/s!AohCchebwT-bhMZUaR6moqVdqrkaTw">
							①証明書をインストール
			            </a>
			            <f:form action="/DevelopLab/mobileApp/iosUdid" method="POST">
							<div class="form-group floating-label-form-group controls mb-0 pb-2">
								<label>UDID</label>
								<input class="form-control"  id="udid" name="udid" maxlength="100" value=""
									placeholder="端末のUDIDを入力してください。" required="required" data-validation-required-message="Please enter your udid.">
								<p class="help-block text-danger"></p>
							<button type="submit" class="btn btn-primary btn-xl">②UDID登録依頼</button>
				            </div>
			            </f:form>
          			</div>
          		</div>
			</div>
		</div>
    </div>
    <!--  -->
	<c:forEach var="app" items="${mobileAppList}">
		<section class="portfolio" id="portfolio">
			<div class="container">
				<h2 class="text-center text-uppercase text-secondary mb-0">${app.getAppName()}</h2>
				<hr class="star-dark mb-5">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<a class="portfolio-item d-block mx-auto" href="#${app.getAppId()}">
							<img id="icon-img" class="img-fluid mb-5 d-block mx-auto" src="${app.getAppIcon()}" alt="WebGl">
						</a>
					</div>
				</div>
			</div>
		</section>
		<div class="portfolio-modal mfp-hide" id="${app.getAppId()}">
			<div class="portfolio-modal-dialog bg-white">
				<a class="close-button d-none d-md-block portfolio-modal-dismiss" href="#">
					<i class="fa fa-3x fa-times"></i>
				</a>
				<div class="container text-center">
					<div class="row">
						<div class="col-lg-8 mx-auto">
							<h2 class="text-secondary text-uppercase mb-0">${app.getAppName()}</h2>
							<hr class="star-dark mb-5">
							<img class="img-fluid mb-5"
								src="${app.getAppIcon()}" alt="${app.getAppId()}">
							<p class="mb-5　font-over">
								${app.getComment()}
							</p>
							<c:if test="${app.getIosAppUrl() != null}">
					            <a href="${app.getIosAppUrl()}">
					              <img src="<c:url value="/resources/images/appstore_badge.png" />" alt="App Store (仮)" width="155" height="53" />
					            </a>
				            </c:if>
				            <c:if test="${app.getAndroidAppUrl() != null}">
					            <a href="${app.getAndroidAppUrl()}">
					              <img src="<c:url value="/resources/images/android-store.png" />" alt="Google Store (仮)" width="155" height="50" />
					            </a>
				            </c:if>
				            <h4 class="text-secondary text-uppercase mb-0">
				            	<br>※アプリのダウンロードに関して、パスワード管理でしているため、パスワードは管理者へお問い合わせ下さい。
				            	<br>※IOSアプリのインストールについては、端末のセットアップをしていないとインストールできません。
				            </h4>
	          			</div>
	          		</div>
				</div>
			</div>
	    </div>
    </c:forEach>
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
</body>
</html>
