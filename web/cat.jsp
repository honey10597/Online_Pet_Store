<%-- 
    Document   : cat
    Created on : 14 Apr, 2019, 9:36:50 PM
    Author     : Honey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin: 0;
            }
            .main{
                opacity: 1;
                align-content: center;
                justify-content: center;
                display: flex;
            }
            .d1,.d2,.d3{
                border-radius: 8px;
                padding: 100px;
                margin: 30px;
            }
            .d1{
                background-image: url("cat1.jpg");
                background-size: 280px 280px;
            }
            .d2{
                
                background-image: url("cat2.jpg");
                background-size: 280px 280px;
            }
            .d3{
                
                background-image: url("cat3.jpg");
                background-size: 280px 280px;
            }
            
            .d1:hover,.d2:hover,.d3:hover{
                transition-duration: 0.5s;
                transform: translate(0px, -10px);
            }
            
    button:hover{
                background-color: #537895;
                color: white;
    }            
         button{
                border: 2px solid #50c9c3;
                background-color: white;
                color: black;
                border-radius: 6px;
                padding: 10px 20px;
                text-decoration: none;
                font-size: 16px;
                -webkit-transition-duration: 0.4s; 
                transition-duration: 0.4s;
                cursor: pointer;
            }
            
            
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
        </style>
    </head>
    <body>

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
    
        <div class="main">
            <div class="d1"><a href="buynow.jsp"><button value="create">Buy Now</button></a></div>
            <div class="d2"><a href="buynow.jsp"><button value="update">Buy Now</button></a></div>
            <div class="d3"><a href="buynow.jsp"><button value="delete">Buy Now</button></a></div>
        </div>
    </body>
</html>
