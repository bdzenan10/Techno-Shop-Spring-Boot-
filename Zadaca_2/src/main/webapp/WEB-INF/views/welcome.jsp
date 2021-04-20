<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<style>
  a {font: bold 11px Arial;
  text-decoration: none;
  color: #000000;
  background-color: #EEEEEE;
 
  padding:10px;
  border-top: 1px solid #CCCCCC;
  border-right: 1px solid #333333;
  border-bottom: 1px solid #333333;
  border-left: 1px solid #CCCCCC;
 font-size:18px;
 width:300px;
  height: 0px;
  margin:270px;}
  
 </style>
<meta http-equiv="Content-Type" content="text/html; charset= utf-8">
<link rel="stylesheet" 
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<title> Techno Shop</title>

</head>
<body>
  <section>
    <div class="jumbotron">
      <div class="container">
        <h1>   ${greeting} </h1>
        <p>   ${tagline} </p>
      </div>
    </div>
  </section>
<section class="link">
	<a href="products" class="button">Katalog</a>
   
	 <img src="<c:url value="/resource/images/cover.png"></c:url>" alt="image"  style =  "width:100%"/>
	 
</section>
  <footer class="jumbotron">
  <p>Techno Shop Zenica</p>
  <p>technoze@gmail.com <br> Tel: 032-456-789</p>
</footer>
</body>
</html>
