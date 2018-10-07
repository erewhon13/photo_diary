<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/cmm/include/loginscript.jsp"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script> -->
		<!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet"> -->

		<link href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">

		<script type="text/javascript">
		 $(document).ready(function() {
	        $("a[data-role=signUp]").click(function(){
	        	
	            var popOption = "width=400, height=600, scrollbars=yes, status=no;";
	            var url = "/login/signUp";
	            window.open(url, "회원가입", popOption);
	        });
		 });
		</script>

</head>

<body>
	<script src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>

		<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(/resources/custom/images/bg-01.jpg);">
					<span class="login100-form-title-1">
						PHOTO DAIRY
					</span>
				</div>

				<form class="login100-form validate-form">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">ID</span>
						<input class="input100" type="text" name="username" placeholder="Enter id">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="pass" placeholder="Enter password">
						<span class="focus-input100"></span>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								ID저장
							</label>
						</div>

						<div>
							<a href="#" data-role="signUp" class="txt1">
								회원가입
							</a>
						</div>
						
						
						<div>
							<a href="#" class="txt1">
								비밀번호 찾기
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>


</html>