package com.proyecto.empresa.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.proyecto.empresa.util.CustomErrorType;


@Controller
@RequestMapping(value="/v1")
public class ClienteController {
	
	@Autowired
	private ClienteService _clienteService;
	// llama a la unica implementacion de la interfaz ClienteService y lo inyecta en _clienteService
	@Autowired
	private ProductoService _productoService;
	// llama a la unica implementacion de la interfaz ProductoService y lo inyecta en _productoService
	
	//GET
		@RequestMapping(value="/clientes", method=RequestMethod.GET)
		public ModelAndView list() {

			ModelAndView model = new ModelAndView("mostrarCliente");
			List<Cliente> clienteList = _clienteService.findAllCliente();
			model.addObject("clienteList", clienteList);
				  
			return model;
		}
		
		@RequestMapping(value="/addCliente", method=RequestMethod.GET)
		 public ModelAndView addCliente() {
		  ModelAndView model = new ModelAndView();
		  
			  Cliente customer = new Cliente();
			  model.addObject("addCliente", customer);
			  model.setViewName("ingresarCliente");
			  
			  return model;
		 }
		 
		 
		 @RequestMapping(value="/saveCliente", method=RequestMethod.POST)
		 public ModelAndView save(@ModelAttribute("addCliente") Cliente customer) {
			 _clienteService.saveCliente(customer);
		  
		  return new ModelAndView("redirect:/v1/clientes");
		 }
		 
		 
		 @RequestMapping(value="/updateCliente", method=RequestMethod.GET)
		 public ModelAndView updateCliente() {
		  ModelAndView model = new ModelAndView();
		  
			  Cliente customer = new Cliente();
			  model.addObject("updateCliente", customer);
			  model.setViewName("modificarCliente");
			  
			  return model;
		 }
		 
		 
		 @RequestMapping(value="/deleteCliente", method=RequestMethod.GET)
		 public ModelAndView deleteCliente() {
		  ModelAndView model = new ModelAndView();
		  
			  Cliente customer = new Cliente();
			  model.addObject("deleteCliente", customer);
			  model.setViewName("eliminarCliente");
			  
			  return model;
		 }
		 
		 
		 
		//GET
		@RequestMapping(value="/clientes/{id}", method=RequestMethod.PATCH)
			public ModelAndView getClienteById(@PathVariable("id") Long idCliente,@RequestBody Cliente cliente) {
				
				ModelAndView model = new ModelAndView("modificarCliente");
				
				Cliente customer = _clienteService.findById(idCliente);
				
				customer.setRazonSocial(cliente.getRazonSocial());
				customer.setTelefono(cliente.getTelefono());
				customer.setDireccion(cliente.getDireccion());
				customer.setCorreo(cliente.getCorreo());
				
				_clienteService.updateCliente(customer);
				
				model.addObject("updateCliente", customer);
				  
				return model;
			}
		 
			
		 
		 
		 /*
		 @RequestMapping(value="/updateCliente", method=RequestMethod.GET)
		 public ModelAndView updateCliente() {
		  ModelAndView model = new ModelAndView();
		  
		  Cliente customer = new Cliente();
		  model.addObject("updateCliente", customer);
		  model.setViewName("modificarCliente");
		  
		  return model;
		 }*/
		 

	/*
		 @RequestMapping(value="/addCotizacion", method=RequestMethod.GET)
		 public ModelAndView addCotizacion() {
		  ModelAndView model = new ModelAndView();
		  
		  Cotizacion cotiz = new Cotizacion();

		  model.addObject("addCotizacion", cotiz);
		  
		  model.setViewName("ingresarCotizacion");
		  
		  return model;
		 }
		 
		*/ 
	
	/*//GET
	@RequestMapping(value="/clientes", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Cliente>> getClientes(@RequestParam(value="name", required=false) String razonSocial) {
		
		List<Cliente> clientes = new ArrayList<>();
		//ejecutamos una validacion
		
		if(razonSocial == null) {
			clientes = _clienteService.findAllCliente();
			if (clientes.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
		} else {
			Cliente cliente = _clienteService.findByName(razonSocial);
			if(cliente == null) {
				return new ResponseEntity(HttpStatus.NOT_FOUND);
			}
			
			clientes.add(cliente);
			return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
		}

	}*/
	
	/*
	//POST
	@RequestMapping(value="/clientes", method = RequestMethod.POST, headers = "Accept=application/json")
	//Response Entity es la forma mas simple para manejar informacion en json
	//RequestBody una solicitud
	public ResponseEntity<?> createCliente(@RequestBody Cliente cliente, UriComponentsBuilder uriComponentsBuilder){
		// validamos el objeto que traigo tenga datos
		if (cliente.getRazonSocial().equals(null) || cliente.getRazonSocial().isEmpty()) {
			//si esta vacio nos devolvera esto
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		if (_clienteService.findByName(cliente.getRazonSocial()) != null) {
			//si esto nos devuelve un objeto diferente a nulo significa que existe ejemplo twiter y avatar 4
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			
		}
		
		// si es diferente d enulo guardaremos el socialMedia
		_clienteService.saveCliente(cliente);
		Cliente cliente2 = _clienteService.findByName(cliente.getRazonSocial());
		HttpHeaders headers = new HttpHeaders();
		//devolver una url del recurso que acabamos de insertar para luego consultarlo 
		headers.setLocation(
				uriComponentsBuilder.path("/v1/cotizaciones/{id}")
				.buildAndExpand(cliente2.getIdCliente())
				.toUri()
				);
		//devolvemos el recurso (una URL) y un http status que se creo 
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}*/
	
		 
		 
	
}
