<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="ja">
<head>
<link rel="shortcut icon" href="<c:url value="/resources/images/faviconIco.png" />" >
<title>Book App</title>
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
				src="<c:url value="/resources/images/book.png" />" alt="">
			<h1 class="text-uppercase mb-0　font-over">
				Book App
			</h1>
			<hr class="star-light">
			<h2 class="font-weight-light mb-0　font-over">
				電子書籍（でんししょせき）とは、紙とインクを利用した印刷物ではなく、電磁的に記録された情報のうち、従来の書籍（雑誌を含む)を置き換える目的で作成されたコンテンツをいう。
				そのため目次、ページ送り、しおり、奥付など書籍としての体裁を整えたものが多い。再生には電子機器のディスプレイのほか、スピーカーが必要な場合もある。
				電子書籍はソフトウェアであるコンテンツだけを指すが、ハードウェアである再生用の端末機器（電子ブックリーダー）も重要な要素である。
				電子ブック、デジタル書籍、デジタルブック、Eブック、オンライン書籍とも呼ばれる。
			</h2>
		</div>
	</header>

	<section class="portfolio" id="portfolio">
		<div class="container">
			<h2 class="text-center text-uppercase text-secondary mb-0">BOOK APP</h2>
			<hr class="star-dark mb-5">
			<div class="row">
				<div class="col-md-6 col-lg-4">
					<a class="portfolio-item d-block mx-auto" href="#webGL">
						<div class="portfolio-item-caption d-flex position-absolute h-100 w-100">
							<div class="portfolio-item-caption-content my-auto w-100 text-center text-white">
								<i class="fa fa-search-plus fa-3x"> 電子書籍 </i>
							</div>
						</div>
						<img class="img-fluid" src="<c:url value="/resources/images/book.png" />" alt="Book">
					</a>
				</div>
			</div>
		</div>
	</section>

	<!-- Portfolio Modal webGL -->
	<div class="portfolio-modal mfp-hide" id="webGL">
		<div class="portfolio-modal-dialog bg-white">
			<a class="close-button d-none d-md-block portfolio-modal-dismiss" href="#">
				<i class="fa fa-3x fa-times"></i>
			</a>
			<div class="container text-center">
				<div class="row">
					<div class="col-lg-8 mx-auto">
						<h2 class="text-secondary text-uppercase mb-0">電子書籍</h2>
						<hr class="star-dark mb-5">
						<img class="img-fluid mb-5"
							src="<c:url value="/resources/images/book.png" />" alt="Book">
						<p class="mb-5　font-over">
							電子書籍のコンテンツの多くは、既に出版された印刷書籍の情報を、デジタルな文字情報や必要ならばさし絵をデジタル画像情報へ変換して電子ファイルにすることで、印刷、製本、流通の経費削減や省スペースを図ったものである。
							<br>コンテンツは有料と無料のものがあり、その多くが無線／有線のネットワークからダウンロード完了後に読むことになる。
							<br>紙の書籍では不可能な、ハイパーリンク・動画・音声・振動（バイブレーション）などを併用したコンテンツも存在する。
							<br>読者が無線や有線によってインターネットに接続すれば、書籍の購入が即時に行えて本棚に場所を占めずにすみ、出版社に相当するコンテンツ・プロバイダ側でも在庫確保と資産コスト、絶版による販売機会の喪失が避けられる。
							<br>環境の観点からは、紙・在庫・流通・店舗などの負荷軽減の側面と、電力消費や機器の陳腐化や廃棄などの負荷発生の側面がある。また著作権や課金などの課題が存在する。
						</p>
			            <a class="btn btn-primary btn-lg rounded-pill" href="https://1drv.ms/f/s!AohCchebwT-bhMYHt0c0IgLahfRUvw">
			              I read a book
			            </a>
			            <h4 class="text-secondary text-uppercase mb-0">
			            	<br>※アプリのダウンロードに関して、パスワード管理でしているため、パスワードは管理者へお問い合わせ下さい。
			            </h4>
            </div>
          </div>
        </div>
      </div>
    </div>

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
