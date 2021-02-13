package com.proyecto.empresa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.proyecto.empresa.model.Cliente;
import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Producto;
import com.proyecto.empresa.service.ClienteService;
import com.proyecto.empresa.service.ProductoService;

@Controller
@RequestMapping(value="/v1")
public class ProductoController {
	
	@Autowired
	private ProductoService _productoService;
	
	//GET
	@RequestMapping(value="/productos", method=RequestMethod.GET)
	public ModelAndView list() {

		ModelAndView model = new ModelAndView("mostrarProducto");
		List<Producto> productoList = _productoService.findAllProducto();
		model.addObject("productoList", productoList);
			  
		return model;
	}
	
	@RequestMapping(value="/addProducto", method=RequestMethod.GET)
	 public ModelAndView addProducto() {
	  ModelAndView model = new ModelAndView();
	  
	  Producto product = new Producto();
	  model.addObject("addProducto", product);
	  model.setViewName("ingresarProducto");
	  
	  return model;
	 }
	
	
	
	@RequestMapping(value="/saveProducto", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("addProducto") Producto product) {
		_productoService.saveProducto(product);
	  
	  return new ModelAndView("redirect:/v1/productos");
	 }
	
	@RequestMapping(value="/updateProducto", method=RequestMethod.GET)
	 public ModelAndView updateProducto() {
	  ModelAndView model = new ModelAndView();
	  
	  Producto product = new Producto();
	  model.addObject("updateProducto", product);
	  model.setViewName("modificarProducto");
	  
	  return model;
	 }
	
	
	@RequestMapping(value="/deleteProducto", method=RequestMethod.GET)
	 public ModelAndView deleteProducto() {
	  ModelAndView model = new ModelAndView();
	  
	  Producto product = new Producto();
	  model.addObject("deleteProducto", product);
	  model.setViewName("eliminarProducto");
	  
	  return model;
	 }
	/*
	//GET
	@RequestMapping(value="/productos", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Producto>> getProducto(@RequestParam(value = "idProducto",required = false) Long idProducto, @RequestParam(value = "idCotizacion",required = false) Long idCotizacion ) {
		
		List<Producto> productos = new ArrayList<>();
		//ejecutamos una validacion
		
		/*if (idCotizacion != null) {
			productos = _productoService.findByIdCotizacion(idCotizacion);
			if (productos.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	        }
	        
		}/*./
		
		if (idProducto != null) {
			Producto producto = _productoService.findById(idProducto);
	        if (producto == null) {
	            return new ResponseEntity(HttpStatus.NOT_FOUND);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        productos.add(producto);
	        
		}
		
		
		if (idCotizacion == null) {
			productos = _productoService.findAllProducto();
	        if (productos.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        
		}
		
		return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);

	}*/
	
	/*
	//POST
	@RequestMapping(value="/productos", method = RequestMethod.POST, headers = "Accept=application/json")
	//Response Entity es la forma mas simple para manejar informacion en json
	//RequestBody una solicitud
	public ResponseEntity<?> createProducto(@RequestBody Producto producto, UriComponentsBuilder ucBuilder){
		// validamos el objeto que traigo tenga datos
		/*if (cotizacion.getCantidad().equals(null) ) {
			//si esta vacio nos devolvera esto
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
			
		// si es diferente d enulo guardaremos 

		_productoService.saveProducto(producto);

		HttpHeaders headers = new HttpHeaders();
		//devolver una url del recurso que acabamos de insertar para luego consultarlo 
		headers.setLocation(
				ucBuilder.path("/v1/productos/{id}")
				.buildAndExpand(producto.getIdProducto())
				.toUri()
				);
		//devolvemos el recurso (una URL) y un http status que se creo 
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}*/
}
