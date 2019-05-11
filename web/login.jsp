<html>
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

	<style>

		body{
			background-image: url("bodybg.jpg");
			background-size: 100%;
		}

		#field_set{
			border-radius: 8px;
			border: 1px solid;
			border-color: grey;
			width: 375px;
			height: 320px;
			margin: auto;
			margin-top: 55px;
			box-shadow: 25px;
			background-color:#ffcc99;
			padding-top: 10px;
			padding-left: 70px;
		}

		input[type=email],input[type=password]{
			padding-left: 10px;
			margin: 12px 0 18px 0;
			display: inline-block;
			width: 290px;
			height: 35px;
			border-bottom: 4px;
			border: none;	
		}
		input[type=email]:hover,input[type=password]:hover,input[type=button]:hover{
			background: #acd6ef;
            color: #262626;
		}

		#container{  
			margin: auto;
			margin-top: 50px;
			height: 450px;  
			width: 700px;
			border: 10px solid grey;
			border-radius: 10px;
			margin-top: 100px;
			background-image: url("bg.jpg");
			background-size: 700px 500px;
		}

		input[type=submit],input[type=button]{
			margin-left: 8px;
		    margin-top: 5px;
		    width: 270px;
		    height: 30px;
		    font-size: 14px;;
		    font-weight: bold;
		    background-color: dodgerblue;
		    border-radius: 30px;
		}

		input[type=submit]:hover,input[type=button]:hover{
			background-color:#ff4d94;
		}

		.heading{
			position: absolute;
			animation-name: anih;
			animation-duration: 2s;
			animation-fill-mode: forwards;
		}


		@keyframes anih{
			0%{
				top: -100px;
				left: 390px;
			}
			100%{
				left:390px;
         		 top:10px;
         		 color: #cc0000;
			}
		}

	</style>
</head>
<body>
	<div class="heading"><h1 align="center"><font face="comic Sans MS" size="500">Welcome to Pet World</font></h1>
	</div>
	<div id="container">

		<fieldset id="field_set">
			<legend id="leg"><h1 align="center"><font face="comic Sans MS" size="50">Login</font></h1></legend>	
			<form name="login_form" action="LoginServlet" onsubmit="return myVal()" method="post">
				<table>
					<tr>
						<th>
							<div><i class="fa fa-envelope icon"></i>
								<input type="email" id="em" placeholder="email" name="mail" >
							</div>
						</th>
					</tr>
					<tr>
						<th>
							<div>
								<i class="fa fa-key icon"></i>
								<input type="password" id="pas" placeholder="password" name="pass" >
							</div>
						</th>
					</tr>
					<tr>
						<th>
							<a href="#"><input type="submit" value="Login"></a>
						</th>
					</tr>	
					<tr>
						<th>
							<a href="signup.jsp"><input type="button" value="SignUp"></a>
						</th>
					</tr>				
				</table>
			</form>
		</fieldset>
	</div>
</body>
<script type="text/javascript" language="javascript">
	function myVal(){
		flag = true;
		var ele1 = document.forms["login_form"]["mail"].value;
		var ele2 = document.forms["login_form"]["pass"].value;
		if(ele1 == "")
        {
        	// alert("Enter email or password");
            document.getElementById("em").style.borderColor="red";
            flag = false;
        }
        if(ele2 == "")
        {
        	// alert("Enter email or password");
            document.getElementById("pas").style.borderColor="red";
            flag = false;
        }
        return flag;
	}
</script>
</html>
