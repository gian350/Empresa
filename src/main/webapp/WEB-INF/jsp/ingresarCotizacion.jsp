<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width = device-width user-scalable = no initial-scale = 1.0" >
	<title>ingresar Cliente</title>
	<link rel="stylesheet" href="../../css/estilosIngresar.css">
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
              <li class="active"><a href="#">Cotizar</a></li>
              <li><a href="../v1/cotizaciones">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Productos</a>
            <ul class="submenu">
              <li><a href="../v1/addProducto">Ingresar</a></li>
              <li><a href="../v1/updateProducto">Modificar</a></li>
              <li><a href="../v1/deleteProducto">Eliminar</a></li>
              <li><a href="../v1/productos">Lista</a></li>
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
    	
    		
    	<h2 class="text-center" id="bloquetitulo">Registrar Cotizacion</h2>
    	<div  id="bloquePrincipal">
    	
    		<div  id="bloqueIzq">
    			<form:form modelAttribute="addCotizacion" method="post" action="../v1/saveCotizacion" Class="form" >
				   <div id="cajatabla">
				   
				   		<div class="form-group">
						    <label for="cliente.idCliente" class="control-label">Codigo de cliente</label>
						    <form:input type="number" path="cliente.idCliente" Class="form-control" id="cliente.idCliente" />
					   	</div>
					   	
					   	<div class="form-group">
						    <label for="cantidad" class="control-label">Cantidad</label>
						    <form:input type="number" path="cantidad" Class="form-control" id="cantidad" />
					   	</div>
					   	
					   
					   	<div class="form-group">
						    <label for="fechaLimite" class="control-label">Fecha Limite</label>
						    <form:input type="text" path="fechaLimite" Class="form-control" id="fechaLimite" />
					   	</div>
					   	
					   	<div class="form-group">
						    <label for="fechaEntrega" class="control-label">Fecha Entrega</label>
						    <form:input type="text" path="fechaEntrega" Class="form-control" id="fechaEntrega" />
					   	</div>
					   
					   	<div class="form-group">
						    <label for="tipoEntrega" class="control-label">Tipo de entrega</label>
						    <form:input type="text" path="tipoEntrega" Class="form-control" id="tipoEntrega"/>
					   	</div>
					   
					   	
					   	<div class="form-group">
						    <label for="descuento" class="control-label">Descuento</label>
						    <form:input type="number" path="descuento" Class="form-control" id="descuento" />
					   	</div>
					   	
					   	<div class="form-group">
						    <label for="totalPagar" class="control-label">Total a pagar</label>
						    <form:input type="number" path="totalPagar" Class="form-control" id="totalPagar" />
					   	</div>
					   	
					   	<div class="form-group">
						    <label for="Producto" class="control-label">Codigo de producto</label>
						    <form:input type="number" path="producto.idProducto" Class="form-control" id="Producto" />
					   	</div>
					   
					   	
					   	<div id="cajaboton">
						   	<div class="form-group"> <!-- Submit Button -->
					        	<button type="submit" class="btn btn-primary">Aceptar</button>
					   	 	</div>  
					   	</div>
					   	
				   		
				   </div>
				   
			  	</form:form>
    		</div>
    		<div  id="bloqueDer">
    			<figure id="bloqueImagen">
                	<img id = "imagen" src="../img/ingresarCotizacion.png" alt="Contratar">
              	</figure>
    		</div>
    	</div>
    	
    
    </section>
   

    <!-- Contenido del pie de pagina con información del autor-->
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
            <img src="../img/IconoFacebook.png">
            <label>Facebook</label>
          </div>

          <div class="redes">
            <img src="../img/IconoTwiter.png">
            <label>Instagran</label>
          </div>

          <div class="redes">
            <img src="../img/IconoInstragan.jpg">
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