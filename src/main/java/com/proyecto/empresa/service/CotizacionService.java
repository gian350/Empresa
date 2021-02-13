package com.proyecto.empresa.service;

import java.util.List;

import com.proyecto.empresa.model.Cotizacion;

public interface CotizacionService {
	
	void saveCotizacion(Cotizacion cotizacion);
	
	void deleteCotizacionById(Long idCotizacion);
	
	void updateCotizacion(Cotizacion cotizacion);
	
	List<Cotizacion>findAllCotizacion();
	
	Cotizacion findById(Long idCotizacion);
	
	List<Cotizacion> findByIdCliente(Long idCliente);
}
