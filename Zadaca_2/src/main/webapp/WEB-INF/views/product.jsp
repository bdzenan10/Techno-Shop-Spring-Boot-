<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-
1">
<link rel="stylesheet"

  
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
  <section>
    <div class="jumbotron">
      <div class="container">
        <h1>${product.name}</h1>
      </div>
    </div>
  </section>
  <section class="container">
    <div class="row">
    <div class="col-md-5">
  <img src="<c:url value="/resource/images/${product.productId}.png">
</c:url>" alt="image"  style =  "width:100%"/>
</div>
    
      <div class="col-md-5">
        <h3>${product.name}</h3>
        <p>${product.description}</p>
        <p>
          <strong>Kod : </strong><span class="label label- warning">${product.productId}</span>
        </p>
        <p> 
          <strong>Proizvodjac:</strong> : ${product.manufacturer}
        </p>
        <p>
          <strong>Kategorija</strong> : ${product.category}
        </p>
        <p>
          <strong>Dostupno: </strong> : 
${product.unitsInStock} komada
        </p>
        <h4>${product.unitPrice} KM</h4>
        <p>
          <a  href="#" class="btn btn-warning btn-large"> <span
            class="glyphicon-shopping-cart glyphicon"><a  href="<spring:url value="/products" />" class="btn btn-default">
   <span class="glyphicon-hand-left glyphicon"></span> Nazad
</a>
            </span> 
          </a>
        </p>
      </div>
    </div>
  </section>
</body>
</html>
