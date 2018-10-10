<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/cmm/include/taglibs.jsp"%>
<!DOCTYPE html>
<html>
		<meta charset="UTF-8">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
				
<head>

		<script type="text/javascript">
		$(document).ready(function() {
			
			// 저장
			$("button[data-role=submit]").click(function() {
				$("form[name=boardForm]").submit();
				return false;
			});
			
			
			
			
			
			////////////////사진 미리보기 
			var upload = document.getElementsByTagName('input')[0],
		    holder = document.getElementById('holder'),
		    state = document.getElementById('status');

			/* if (typeof window.FileReader === 'undefined') {
			  state.className = 'fail';
			} else {
			  state.className = 'success';
			  state.innerHTML = 'File API & FileReader available';
			} */
			 
			upload.onchange = function (e) {
			  e.preventDefault();
	
			  var file = upload.files[0],
			      reader = new FileReader();
			  reader.onload = function (event) {
			    var img = new Image();
			    img.src = event.target.result;
			    if (img.width > 700) { // holder width
			      img.width = 700;
			    }
			    if (img.height > 300) { // holder height
				      img.width = 300;
				}
			    holder.innerHTML = '';
			    holder.appendChild(img);
			  };
			  reader.readAsDataURL(file);
	
			  return false;
			};
			////////////////
			
			var upload2 = document.getElementsByTagName('input')[1],
		    holder2 = document.getElementById('holder2'),
		    state2 = document.getElementById('status2');

			upload2.onchange = function (e) {
			  e.preventDefault();
	
			  var file = upload2.files[0],
			      reader = new FileReader();
			  reader.onload = function (event) {
			    var img = new Image();
			    img.src = event.target.result;
			    if (img.width > 700) { // holder width
			      img.width = 700;
			    }
			    if (img.height > 300) { // holder height
				      img.width = 300;
				}
			    holder2.innerHTML = '';
			    holder2.appendChild(img);
			  };
			  reader.readAsDataURL(file);
	
			  return false;
			};
			
			
		});
		
		</script>
		
</head>
		

<body>
	<form id="boardForm" name="boardForm" method="post" action="/writeAction">
	    <!-- Navigation -->
	    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	      <div class="container">
	        <a class="navbar-brand" href="#">사진 일기장</a>
	        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
	          <span class="navbar-toggler-icon"></span>
	        </button>
	        <div class="collapse navbar-collapse" id="navbarResponsive">
	          <ul class="navbar-nav ml-auto">
	            <li class="nav-item active">
	              <a class="nav-link" href="#">Home
	                <span class="sr-only">(current)</span>
	              </a>
	            </li>
	            <li class="nav-item">
	              <a class="nav-link" data-role="new" href="#">글쓰기</a>
	            </li>
	            <li class="nav-item">
	              <a class="nav-link" href="#">개인정보</a>
	            </li>
	            <li class="nav-item">
	              <a class="nav-link" href="#">로그아웃</a>
	            </li>
	          </ul>
	        </div>
	      </div>
	    </nav>
	
	    <!-- Page Content -->
	    <div class="container">
	
	      <!-- Page Heading -->
	      <h1 class="my-4">글쓰기</h1>
	
	      <!-- Project One -->
	      <div class="row">
	        <div id="holder" class="col-md-7">
	        </div>
	        <div id="holder2" class="col-md-7">
	          <article>
				  <p id="status"></p>
				  <p><input type=file></p>
				 <!--  <div id="holder"></div> -->
			  </article>
			  <article>
				  <p id="status2"></p>
				  <p><input type=file></p>
				 <!--  <div id="holder"></div> -->
			  </article>
	        </div>
	        
	        <div class="col-md-5">
		          <div class="col-xs-12 col-sm-12 col-md-12">
						<div class="form-group">
							<label for="title">글 제목</label>
							<input type="text" id="title" name="title" class="form-control" required data-rule-maxByte="300"/>
						</div>
				  </div>
		          <div class="col-xs-12 col-sm-12 col-md-12">
						<div class="form-group">
						  <label for="content">내용:</label>
						  <textarea class="form-control" rows="5" id="content"></textarea>
						</div>
						<div class="row">
							<div class="col-xs-12 col-sm-12 col-md-12 text-center">
								<button type="button" data-role="submit"><i aria-hidden="true"></i> 저장</button>
								<button type="button" data-role="cancel"><i aria-hidden="true"></i> 취소</button>
							</div>
						</div>
				  </div>
	          </div>
	      </div>
	      <!-- /.row -->
			
	    </div>
	    <!-- /.container -->
	
	    <!-- Footer -->
	    <footer class="py-5 bg-dark">
	      <div class="container">
	        <p class="m-0 text-center text-white">Copyright &copy; GYU 2018</p>
	      </div>
	      <!-- /.container -->
	    </footer>
	
	
	</form>
</body>



</html>