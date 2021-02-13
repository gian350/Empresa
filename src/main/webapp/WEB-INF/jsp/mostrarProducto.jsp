<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  


<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <meta name="viewport" content="width = device-width user-scalable = no initial-scale = 1.0" >
 <title>Article List</title>
 
 <link rel="stylesheet" href="../../css/estilosMostrar.css">
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>
<body>

	<!-- Encabezado de la página -->
    <header id="banner" class="body">
      <!-- Título de la página -->
      <h1><a href="../">Mallorca S.A.</a></h1>
      <!-- Barra de menú -->
      <nav>
        <ul id="menu">
          <li><a href="../">Inicio</a></li>
          <li><a href="#">Clientes</a>
            <ul class="submenu">
              <li><a href="../v1/addCliente">Ingresar</a></li>
              <li><a href="../v1/updateCliente">Modificar</a></li>
              <li><a href="../v1/deleteCliente">Eliminar</a></li>
              <li><a href="../v1/clientes">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Cotizacion</a>
            <ul class="submenu">
              <li><a href="../v1/addCotizacion">Cotizar</a></li>
               <li><a href="../v1/cotizaciones">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Productos</a>
            <ul class="submenu">
              <li><a href="../v1/addProducto">Ingresar</a></li>
              <li><a href="../v1/updateProducto">Modificar</a></li>
              <li><a href="../v1/deleteProducto">Eliminar</a></li>
              <li class="active"><a href="#">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Pedidos</a>
            <ul class="submenu">
              <li><a href="../v1/addPedido">Ingresar</a></li>
              <li><a href="../v1/updatePedido">Modificar</a></li>
              <li><a href="../v1/deletePedido">Eliminar</a></li>
              <li><a href="../v1/pedidos">Lista</a></li>
            </ul> 
          </li>
        </ul>
      </nav>
    </header>

	 <section id="Seccion-Principal" class="body">
	  <h2 class="text-center">Lista de productos</h2>
	  <div id="cajatabla">
	  	<table class="table table-striped table-responsive">
		   <thead>
		    <th scope="row">idProducto</th>
		   
		    <th scope="row">nombre</th>
		    <th scope="row">categoria</th>
		    <th scope="row">proveedor</th>
		    <th scope="row">precioUnitario</th>
		    <th scope="row">procedencia</th>
		    <th scope="row">stock</th>
		    <th scope="row">descripcion</th>
		    
		   </thead>
		   <tbody>
		    <c:forEach items="${productoList }" var="producto" >
		     <tr>
		      <td>${producto.idProducto }</td>
		      <td>${producto.nombre }</td>
		      <td>${producto.categoria }</td>
		      <td>${producto.proveedor }</td>
		      <td>${producto.precioUnitario }</td>
		      <td>${producto.procedencia }</td>
		      <td>${producto.stock }</td>
		      <td>${producto.descripcion }</td>
		      		      
		     </tr>
		    </c:forEach>
		   </tbody>
		  </table>
	  </div>
	 </section>
 
 	<footer id="contentinfo" class="body">
      <!-- Contenido de acerca de nosotros-->
      <div id="contenedor-Footer">
        <div class="columna">
          <h1>Contacto</h1>
          <p>giancarlos350@gmail.com</p>
          <p>Cuadra 10 jose maria eguren</p>
          <p>974125631</p>
        </div>
        <div class="columna">
          <h1>Terminos</h1>
          <p>Conoce nuestros terminos y condiciones</p>
          <p>El servicio se encuentra dirigido exclusivamente a residentes en la República de Perú.</p>
        </div>
        <div class="columna">
          <h1>Redes Sociales</h1>
          <p>Comparte en nuestras redes sociales</p>

          <div class="redes">
            <img src="../../img/IconoFacebook.png">
            <label>Facebook</label>
          </div>

          <div class="redes">
            <img src="../../img/IconoTwiter.png">
            <label>Instagran</label>
          </div>

          <div class="redes">
            <img src="../../img/IconoInstragan.jpg">
            <label>Twiter</label>
          </div>

        </div>
        <div class="columna">
          <h1>Derechos</h1>
          <p>
            Rivera Ureña Gian Carlos
            <br/>
            Morales Tejeda David
            <br/>
            Pizarro Mendivil Geerson
            <br/>
            Salinas Liendo Eduardo
            <br/>
            andre sebastian moreno luna
          </p>

          <p>@Copyright 2020</p>
        </div>
      </div>

    </footer>
 
 
</body>
</html>