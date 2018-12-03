<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
<title>Web GL</title>
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
</head>
<body id="page-top">

	<!-- Navigation -->
	<jsp:include page="navigation.jsp" flush="true" />

	<header class="masthead bg-primary text-white text-center">
		<div class="container">
			<img class="img-fluid mb-5 d-block mx-auto"
				src="<c:url value="/resources/images/web-gl.png" />" alt="">
			<h1 class="text-uppercase mb-0　font-over">
				Web GL <br> (Web Graphics Library)
			</h1>
			<hr class="star-light">
			<h2 class="font-weight-light mb-0　font-over">WebGL (Web Graphics Library)
				は、互換性があるウェブブラウザーでプラグインを使用せずにインタラクティブな 3D グラフィックスや 2D
				グラフィックスをレンダリングするための JavaScript API です。HTML5 canvas 要素へ OpenGL ES 2.0
				に密接に従った API を導入することにより、WebGL を実現します。</h2>
		</div>
	</header>

    <!--
	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0">Unity ちゃん AI</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-md-6 col-lg-4">
					<a class="portfolio-item d-block mx-auto" href="#webGL">
						<div class="portfolio-item-caption d-flex position-absolute h-100 w-100">
							<div class="portfolio-item-caption-content my-auto w-100 text-center text-white">
								<i class="fa fa-search-plus fa-3x"> WebGL </i>
							</div>
						</div>
						<img class="img-fluid" src="<c:url value="/resources/images/unity-chan.png" />" alt="WebGl">
					</a>
				</div>
			</div>
		</div>
	</section>

	<div class="portfolio-modal mfp-hide" id="webGL">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss" href="#">
				<i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<h2 class="text-secondary text-uppercase mb-0">Unity ちゃん AI</h2>
						<hr class="star-dark mb-5">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/unity-chan.png" />" alt="webGL">
						<p class="mb-5　font-over">
							UnityちゃんAIは、Unity(IDE)を使用して作成したお喋りチャットbotです。
							<br>現在は、まだ作成途中の段階ですが、ユーザの好みに合わせて会話をAI学習し
							<br>自分の好みのAIに変化します。（予定…）
							<br>
							<br>Unityについて
							<br>Unityとは、統合開発環境を内蔵し、複数の機材に対応するゲームエンジンである。
							<br>ユニティ・テクノロジーズが開発した。日本法人はユニティテクノロジーズジャパン合同会社。
							<br>ウェブプラグイン、デスクトッププラットフォーム、ゲーム機、携帯機器向けのコンピュータゲームを開発するために用いる。
							<br>100万人以上の開発者が利用している。(WIKI先生によると)
						</p>
              <a class="btn btn-primary btn-lg rounded-pill" href="/DevelopLab/amaterasu">
                START GAME</a>
            </div>
          </div>
        </div>
      </div>
    </div>
-->
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
