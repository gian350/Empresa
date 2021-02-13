package com.proyecto.empresa.dao;

import java.util.List;

import com.proyecto.empresa.model.Pedido;

public interface PedidoDao {
	void savePedido(Pedido pedido);
	
	void deletePedidoById(Long idPedido);
	
	void updatePedido(Pedido pedido);
	
	List<Pedido>findAllPedido();
	
	Pedido findById(Long idPedido);
	
	Pedido findByIdCotizacion(Long idCotizacion);
}
