package com.proyecto.empresa.service;

import java.util.List;

import com.proyecto.empresa.model.Pedido;

public interface PedidoService {
	void savePedido(Pedido pedido);
	
	void deletePedidoById(Long idPedido);
	
	void updatePedido(Pedido pedido);
	
	List<Pedido>findAllPedido();
	
	Pedido findById(Long idPedido);
	
	Pedido findByIdCotizacion(Long idCotizacion);
}
