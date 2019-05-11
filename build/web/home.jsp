<%-- 
    Document   : home
    Created on : 11 Apr, 2019, 3:21:38 PM
    Author     : Honey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<style>
		
		.demo{
			display: flex;
			background-color: ORANGE;   
                        margin: 10px;
                        padding: 10px;
		}

		.demo a{
			color: #f1f1f1;
			text-decoration: none;
			padding: 12px 14px;
		}

		.demo a:hover{
			background-color: black;  
		}
                #logout{
                    
                    float:  right;
                    margin-top: 35px;
                }
                #name{
                    float: right;
                }
                #slide{
                    height: 450px;
                    width: 97%;
                    margin: 20px;
                    border: 5px solid black;
                }
                .mySlides {
                    display:none;
                    height: 400px;
                    width: 1100px;
                }
                #shop{
                    display: flex;
                    justify-content: center;
                    align-content: center;
/*                    padding: 20px;
                    margin: 20px;*/
                    transition: transform 1s;
                }
                #shop1{
                    margin: 10px;
                    padding: 140px;
                    height: 140px;
                    width: 100px;
                    border: 2px solid black;
                    /*border-color: gray;*/
                }
                .shop_img{
                    display: flex;
                    justify-content: center;
                    align-content: center;
                    height: 300px;
                    width: 350px;
                    padding: 20px;
                    
                }
                .shop_img:hover{
                    -ms-transform: scale(1.1); /* IE 9 */
                    -webkit-transform: scale(1.1); /* Safari 3-8 */
                    transform: scale(1.1); 
                }
	</style>
</head>
<% if(session.getAttribute("Name")!=null)
{
    %>
<div id="name">
Welcome

<%= 
    session.getAttribute("Name")
%>
<%}%>

</div>
<div>
   <img src="logo.png">
   
        <%
            if(session.getAttribute("Name")!=null)
            {
        %>
        <a href="Logout"><button class="btn btn-danger" id="logout" class="btn btn-danger navbar-btn">LOGOUT</button></a>
        <%
            }else{
        %>
        <a href="login.jsp"><button class="btn btn-danger" id="logout" class="btn btn-danger navbar-btn">LOGIN</button></a>
        <%
            }
        %>
</div>
<body>
	<div class="demo">
		<a href="home.jsp">HOME</a>
		<a href="#">DOG ACCESSORIES</a>
		<a href="#">NAME YOUR DOG</a>
		<a href="#">ABOUT US</a>
		<a href="#">CONTACT US</a>
	</div>
    <div id="slide">
        <div class="w3-content w3-section" style="max-width:500px">
            <img class="mySlides" src="slide1.jpg" >
            <img class="mySlides" src="slide2.jpg" >
            <img class="mySlides" src="slide3.jpg" >
            <img class="mySlides" src="slide4.jpg" >
            <img class="mySlides" src="slide5.jpg" >
        </div>
    </div>
    

    
    <div id="shop">
        <a href="cat.jsp"><img class="shop_img" src="cat1.jpg"></a>
        <a href="dog.jsp"> <img class="shop_img" src="dog1.jpg"></a>
        <a href="bird.jsp"><img class="shop_img" src="birds1.jpg"></a>
    </div>
    
</body>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

</html>