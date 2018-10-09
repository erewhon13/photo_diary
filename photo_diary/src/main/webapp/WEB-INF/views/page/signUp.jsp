<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/cmm/include/taglibs.jsp"%>
<%@ include file="/WEB-INF/views/cmm/include/css.jsp"%>
<%@ include file="/WEB-INF/views/cmm/include/js.jsp"%>

<!-- 회원가입 panel용 css,icon -->
<link href="//cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<html>
<head>
	<script type="text/javascript">
	
		$(document).ready(function(){

			//가입하기 버튼
			$("button[data-role=signUp]").click(function(){
				
				/* if($("input[name=email]").val().trim() == ""){
					//toastr.error("이메일을 입력해주세요.");
					alert("이메일을 입력해주세요.");
					return false;
				}
				
				if($("input[name=username]").val().trim() == ""){
					//toastr.error("닉네임을 입력해주세요.");
					alert("닉네임을 입력해주세요.");
					return false;
				}
				
				if($("input[name=password]").val().trim() == ""){
					//toastr.error("비밀번호를 입력해주세요.");
					alert("비밀번호를 입력해주세요.");
					return false;
				}
				
				if($("input[name=cpassword]").val().trim() == ""){
					//toastr.error("비밀번호를 확인해주세요.");
					alert("비밀번호를 확인해주세요.");
					return false;
				} */
				
				$("form[name=loginform]").submit();
			/* 	$.confirm({
    			    theme: 'supervan',
    			    title: '회원가입',
    			    content: '가입 하시겠습니까?',
    			    confirmButton: '확인',
    			    cancelButton: '취소',
    			    confirm: function(){
    			    	$("form[name=loginform]").submit();
    			    },
    			    cancel: function(){}
    			}); */
				
			
			});
			
			//취소 버튼
			$("button[data-role=cancel]").click(function(){
				window.close();
			});
			
		});
	</script>
</head>
	<body>
		<div id="login-page" class="row">
		  <div class="col s12 z-depth-4 card-panel">
		    <form class="login-form" id="loginform" name="loginform" method="post" action="/login/signUp">
			      <div class="row">
			        <div class="input-field col s12 center">
			          <h5>회원가입</h5>
			        <!--   <p class="center">당신의 오늘 하루는 어땠나요?</p> -->
			        </div>
			      </div>
			
		          <div class="row margin">
			        <div class="input-field col s12">
			          <i class="material-icons prefix">email</i>
			          <input id="email" name="email" type="text" style="cursor: auto;" placeholder="이메일"/>
			        </div>
			      </div>
			
			      <div class="row margin">
			        <div class="input-field col s12">
			          <i class="material-icons prefix">account_circle</i>
			          <input id="nickname" name="nickname" type="text" placeholder="닉네임"/>
			        </div>
			      </div>
			
			      <div class="row margin">
			        <div class="input-field col s12">
			          <i class="material-icons prefix">vpn_key</i>
			          <input id="pwd" name="pwd" type="password" placeholder="비밀번호" />
			        </div>
			      </div>
			
			      <div class="row margin">
			        <div class="input-field col s12">
			          <i class="material-icons prefix">vpn_key</i>
			          <input id="cpwd" name="cpwd" type="password" placeholder="비밀번호 확인" />
			        </div>
			      </div>
			
			      <div class="row">
			        <div class="input-field col s12">
			          <button type="button" data-role="signUp" class="btn waves-effect waves-light col s12">가입하기</button>
			        </div>
			        <div class="input-field col s12">
			          <button type="button" data-role="cancel" class="btn waves-effect waves-light col s12">취소</button>
			        </div>
			      </div>
		    </form>
		  </div>
		</div>
	</body>
</html>