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
import com.proyecto.empresa.service.ClienteService;
import com.proyecto.empresa.service.CotizacionService;

@Controller
@RequestMapping(value="/v1")
public class CotizacionController {
	
	@Autowired
	private CotizacionService _cotizacionService;
	
	@Autowired
	
	//GET
	 @RequestMapping(value="/cotizaciones", method=RequestMethod.GET)
	 public ModelAndView getCotizacion() {

	  ModelAndView model = new ModelAndView("mostrarCotizacion");
	  List<Cotizacion> cotizacionList = _cotizacionService.findAllCotizacion();
	  model.addObject("cotizacionList", cotizacionList);
	  
	  return model;
	 }
	 
	
	/*
	//GET
	@RequestMapping(value="/cotizaciones", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Cotizacion>> getCotizacion(@RequestParam(value = "idCotizacion",required = false) Long idCotizacion , @RequestParam(value = "idCLiente",required = false) Long idCliente) {
		
		List<Cotizacion> cotizacions = new ArrayList<>();
		//ejecutamos una validacion
		
		if (idCliente != null) {
			cotizacions = _cotizacionService.findByIdCliente(idCliente);
			if (cotizacions.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	        }
	        
		}
		
		if (idCotizacion != null) {
			Cotizacion cotizacion = _cotizacionService.findById(idCotizacion);
	        if (cotizacion == null) {
	            return new ResponseEntity(HttpStatus.NOT_FOUND);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        cotizacions.add(cotizacion);
	        
		}
		
		
		if (idCliente == null) {
			cotizacions = _cotizacionService.findAllCotizacion();
	        if (cotizacions.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        
		}
		
		return new ResponseEntity<List<Cotizacion>>(cotizacions, HttpStatus.OK);

	}*/
	
	 
	 @RequestMapping(value="/addCotizacion", method=RequestMethod.GET)
		 public ModelAndView addCotizacion() {
		  ModelAndView model = new ModelAndView();
		  
		  Cotizacion coti = new Cotizacion();
		  model.addObject("addCotizacion", coti);
		  model.setViewName("ingresarCotizacion");
		  
		  return model;
	}
		
		
		
		@RequestMapping(value="/saveCotizacion", method=RequestMethod.POST)
		 public ModelAndView save(@ModelAttribute("addCotizacion") Cotizacion cotizacion) {
			_cotizacionService.saveCotizacion(cotizacion);
		  
		  return new ModelAndView("redirect:/v1/cotizaciones");
		 }
		 
		 
}
