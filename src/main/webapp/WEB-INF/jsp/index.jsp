<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width = device-width user-scalable = no initial-scale = 1.0" >
    <title>Propiedades de Color, Fondo y Degradado</title>
    <link rel="stylesheet" href="css/estilos.css">
     <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 	<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 	<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>  </head>

  <body>
    <!-- Encabezado de la página -->
    <header id="banner" class="body">
      <!-- Título de la página -->
      <h1><a href="#">Mallorca S.A.</a></h1>
      <!-- Barra de menú -->
      <nav>
        <ul id="menu">
          <li class="active"><a href="#">Inicio</a></li>
          <li><a href="#">Clientes</a>
            <ul class="submenu">
              <li><a href="v1/addCliente">Ingresar</a></li>
              <li><a href="v1/updateCliente">Modificar</a></li>
              <li><a href="v1/deleteCliente">Eliminar</a></li>
              <li><a href="v1/clientes">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Cotizacion</a>
            <ul class="submenu">
              <li><a href="v1/addCotizacion">Cotizar</a></li>
              <li><a href="v1/cotizaciones">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Productos</a>
            <ul class="submenu">
              <li><a href="v1/addProducto">Ingresar</a></li>
              <li><a href="v1/updateProducto">Modificar</a></li>
              <li><a href="v1/deleteProducto">Eliminar</a></li>
              <li><a href="v1/productos">Lista</a></li>
            </ul> 
          </li>
          <li><a href="#">Pedidos</a>
            <ul class="submenu">
              <li><a href="v1/addPedido">Ingresar</a></li>
              <li><a href="v1/updatePedido">Modificar</a></li>
              <li><a href="v1/deletePedido">Eliminar</a></li>
              <li><a href="v1/pedidos">Lista</a></li>
            </ul> 
          </li>
        </ul>
      </nav>
    </header>

    <!-- Campo para poner el contenido de elementos relacionados con el contenido principal, se
         representan con la etiqueta aside-->
    <aside id="featured" class="body">
      <article>
        <h2>"La mejor papa del Peru"</h2>
        <h3><a href="#">Múltiples Imágenes de fondo.</a></h3>
      </article>
    </aside>

    <!-- Contenido de la página -->
    <section id="content" class="body">
      <!-- Lista de Publicaciones -->
      <ol id="posts-list">

        <li>
          <article class="hentry">
            <header>
              <h2 class="entry-title"><a href="#" rel="bookmark" title="Link a este título">Papa Amarilla</a></h2>
            </header>
            <!-- Información de la publicación-->
            <footer class="post-info">
              <figure>
                <img src="img/Papa_Amarilla.png" alt="Taz">
              </figure>
            </footer>
            <!-- Contenido textual del Contenido del artículo. -->
            <div class="entry-content">
              <p>Se encuentran entre las más populares de la región andina, especialmente en Perú, lugar donde se ubica el origen de este tubérculo tan especial. La papa amarilla suele ser la elegida a la hora de preparar recetas típicas muy conocidas, como la “causa limeña” y la “papa a la huancaína”.</p>
            </div>
          </article>
        </li>

        <li>
          <article class="hentry">
            <header>
              <h2 class="entry-title"><a href="#" rel="bookmark" title="Link a este título">Papa Yungay</a></h2>
            </header>
            <!-- Información de la publicación-->
            <footer class="post-info">
              <figure>
                <img src="img/Papa_Yungay.jpg" alt="Taz" >
              </figure>
            </footer>
            <!-- Contenido textual del Contenido del artículo. -->
            <div class="entry-content">
              <p>Yungay es una de las variedades obtenidas por el famoso agrónomo e investigador peruano Carlos Ochoa. Este tubérculo fue el resultado de diferentes cruces entre papas nativas y variedades exóticas traídas desde Europa, Estados Unidos y la isla chilena Chiloé.</p>
            </div>
          </article>
        </li>
      </ol>
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
