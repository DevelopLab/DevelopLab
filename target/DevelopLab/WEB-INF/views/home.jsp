<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
<title>HOME</title>
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
<body id="page-top">
	<!-- Navigation -->
	<jsp:include page="navigation.jsp" flush="true" />

	<!-- Header -->
	<f:form modelAttribute="homeForm" action="/DevelopLab/home" method="GET">
		<header class="masthead bg-primary text-white text-center">
			<div class="container">
				<img class="img-fluid mb-5 d-block mx-auto" src="${imageIconPath}" alt="">
				<h1 class="text-uppercase mb-0">Home</h1>
				<hr class="star-light">
				<h2 class="font-weight-light mb-0">
					ID:${userId} <br>NAME: ${name}
				</h2>
			</div>
		</header>
	</f:form>

	<!-- モバイル-アプリケーション-開発ラボ -->
	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0">モバイル-アプリケーション-開発ラボ</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<a class="portfolio-item d-block mx-auto" href="#mobileApp">
						<img class="img-fluid mb-5 d-block mx-auto" src="<c:url value="/resources/images/ios-and-android.png" />" alt="MobileApp">
					</a>
				</div>
			</div>
		</div>
	</section>

	<!-- WEB-アプリケーション-開発ラボ -->
	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0">WEB-アプリケーション-開発ラボ</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<a class="portfolio-item d-block mx-auto" href="#webGL">
						<img class="img-fluid mb-5 d-block mx-auto" src="<c:url value="/resources/images/web-gl.png" />" alt="WebGl">
					</a>
				</div>
			</div>
		</div>
	</section>

	<!-- Book-App -->
	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0">Book-App</h2>
			<hr class="star-dark mb-5">

			<div class="row">
				<div class="col-lg-8 mx-auto">
					<a class="portfolio-item d-block mx-auto" href="#Book">
						<img class="img-fluid mb-5 d-block mx-auto" src="<c:url value="/resources/images/book.png" />" alt="Book">
					</a>
				</div>
			</div>
		</div>
	</section>

	<!-- About Section -->
	<section class="bg-primary text-white mb-0">
		<div class="container">
			<h2 class="text-center text-uppercase text-white">管理者からのお願い。</h2>
			<p class="lead text-uppercase text-center　font-over">
				Webアプリケーションのご利用ありがとうございます。 <br>ご利用にあたってのお願い事項として以下のお約束をお願い致します。
			</p>
			<hr class="star-light mb-5">
			<div class="row">
				<div class="col-lg-10 mr-auto">
					<p class="lead　font-over">
						①ご利用者以外の方でのログインは、お控え下さい。 <br>もし利用者以外の方でご利用される場合、一言管理者にご相談お願い致します。
						<br>※基本相談していただければ、OKです。
					</p>
				</div>
			</div>
		</div>
	</section>

	<!-- Contact Section -->
	<section id="contact">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0　font-over">管理者へのお問い合わせ</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<f:form modelAttribute="sendMessageForm"
						action="/DevelopLab/home/sendMessage" method="post">
						<div class="control-group">
							<div
								class="form-group floating-label-form-group controls mb-0 pb-2">
								<label>Message</label>
								<textarea class="form-control" id="message" name="message"
									rows="5" placeholder="Message" required="required"
									data-validation-required-message="Please enter a message."></textarea>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<br>
						<div id="success"></div>
						<div class="form-group loading">
							<button id="ajax" class="btn btn-primary btn-xl">Send</button>
						</div>
					</f:form>
				</div>
			</div>
		</div>
	</section>

	<!-- Portfolio Modal webGL -->
	<div class="portfolio-modal mfp-hide" id="webGL">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss"
				href="#"> <i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
						<hr class="star-dark mb-5">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/web-gl.png" />" alt="webGL">
						<p class="mb-5　font-over">WebGL (Web Graphics Library)
							<br>は、互換性があるウェブブラウザーでプラグインを使用せずにインタラクティブな 3D グラフィックスや 2D
							<br>グラフィックスをレンダリングするための JavaScript API です。HTML5 canvas 要素へ OpenGL ES
							<br>2.0 に密接に従った API を導入することにより、WebGL を実現します。</p>
						<a class="btn btn-primary btn-lg rounded-pill"
							href="/DevelopLab/webGL"> Open Project</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Portfolio Modal MobileApp -->
	<div class="portfolio-modal mfp-hide" id="mobileApp">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss"
				href="#"> <i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
						<hr class="star-dark mb-5">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/ios-and-android.png" />"
							alt="MobileApp">
						<p class="mb-5　font-over">モバイルアプリケーション。
							<br>スマートホンやタブレット型端末向けのアプリケーションソフト。
							<br>iOSまたはアンドロイドなどの実行環境に対応したソフトがあり、
							<br>アップストアやグーグルプレーなどのコンテンツ配信サービスを通じて
							<br>ダウンロードして利用する。
						</p>
						<a class="btn btn-primary btn-lg rounded-pill" href="/DevelopLab/mobileApp"> Open Project</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Portfolio BookApp -->
	<div class="portfolio-modal mfp-hide" id="Book">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss"
				href="#"> <i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
						<hr class="star-dark mb-5">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/book.png" />" alt="Book">
						<p class="mb-5　font-over">
							電子書籍（でんししょせき）とは、紙とインクを利用した印刷物ではなく、電磁的に記録された情報のうち、従来の書籍（雑誌を含む)を置き換える目的で作成されたコンテンツをいう。
							そのため目次、ページ送り、しおり、奥付など書籍としての体裁を整えたものが多い。再生には電子機器のディスプレイのほか、スピーカーが必要な場合もある。
							電子書籍はソフトウェアであるコンテンツだけを指すが、ハードウェアである再生用の端末機器（電子ブックリーダー）も重要な要素である。
							電子ブック、デジタル書籍、デジタルブック、Eブック、オンライン書籍とも呼ばれる。</p>
						<a class="btn btn-primary btn-lg rounded-pill"
							href="/DevelopLab/book"> Open Project</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-to-top d-lg-none position-fixed ">
		<a class="js-scroll-trigger d-block text-center text-white rounded"
			href="#page-top"> <i class="fa fa-chevron-up"></i>
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

	<!-- Notice -->
	<script type="text/javascript" src="<c:url value="/resources/js/notice.js" />"></script>
</body>
</html>
