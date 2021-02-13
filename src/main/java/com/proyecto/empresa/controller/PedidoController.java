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

import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Pedido;
import com.proyecto.empresa.model.Producto;
import com.proyecto.empresa.service.PedidoService;

@Controller
@RequestMapping(value="/v1")
public class PedidoController {
	@Autowired
	private PedidoService _pedidoService;
	
	
	//GET
		@RequestMapping(value="/pedidos", method=RequestMethod.GET)
		public ModelAndView list() {

			ModelAndView model = new ModelAndView("mostrarPedido");
			List<Pedido> pedidoList = _pedidoService.findAllPedido();
			model.addObject("pedidoList", pedidoList);
				  
			return model;
		}
	
	
	 @RequestMapping(value="/addPedido", method=RequestMethod.GET)
	 public ModelAndView addPedido() {
		  ModelAndView model = new ModelAndView();
		  
		  Pedido pedid = new Pedido();
		  model.addObject("addPedido", pedid);
		  model.setViewName("ingresarPedido");
		  
		  return model;
	 }
	
	
	
	@RequestMapping(value="/savePedido", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("addPedido") Pedido pedid) {
		_pedidoService.savePedido(pedid);
	  
	  return new ModelAndView("redirect:/v1/pedidos");
	 }
	
	@RequestMapping(value="/deletePedido", method=RequestMethod.GET)
	 public ModelAndView deletePedido() {
		  ModelAndView model = new ModelAndView();
		  
		  Pedido pedid = new Pedido();
		  model.addObject("deletePedido", pedid);
		  model.setViewName("eliminarPedido");
		  
		  return model;
	 }
	
	@RequestMapping(value="/updatePedido", method=RequestMethod.GET)
	 public ModelAndView updatePedido() {
		  ModelAndView model = new ModelAndView();
		  
		  Pedido pedid = new Pedido();
		  model.addObject("updatePedido", pedid);
		  model.setViewName("modificarPedido");
		  
		  return model;
	 }
	
	
	
	
	
	/*
	//GET
	@RequestMapping(value="/pedidos", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Pedido>> getPedido(@RequestParam(value = "idPedido",required = false) Long idPedido, @RequestParam(value = "idCotizacion",required = false) Long idCotizacion ) {
		
		List<Pedido> pedidos = new ArrayList<>();
		//ejecutamos una validacion
		
		
		if (idPedido != null) {
			Pedido pedido = _pedidoService.findById(idPedido);
	        if (pedido == null) {
	            return new ResponseEntity(HttpStatus.NOT_FOUND);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        pedidos.add(pedido);
	        
		}
		
		
		if (idCotizacion == null) {
			pedidos = _pedidoService.findAllPedido();
	        if (pedidos.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        
		}
		
		return new ResponseEntity<List<Pedido>>(pedidos, HttpStatus.OK);

	}*/
	
	/*
	//POST
	@RequestMapping(value="/pedidos", method = RequestMethod.POST, headers = "Accept=application/json")
	//Response Entity es la forma mas simple para manejar informacion en json
	//RequestBody una solicitud
	public ResponseEntity<?> createPedido(@RequestBody Pedido pedido, UriComponentsBuilder ucBuilder){
		// validamos el objeto que traigo tenga datos
		/*if (cotizacion.getCantidad().equals(null) ) {
			//si esta vacio nos devolvera esto
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
			
		// si es diferente d enulo guardaremos 
		_pedidoService.savePedido(pedido);
		HttpHeaders headers = new HttpHeaders();
		//devolver una url del recurso que acabamos de insertar para luego consultarlo 
		headers.setLocation(
				ucBuilder.path("/v1/pedidos/{id}")
				.buildAndExpand(pedido.getIdPedido())
				.toUri()
				);
		//devolvemos el recurso (una URL) y un http status que se creo 
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}*/
}
