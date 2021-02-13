package com.proyecto.empresa.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Pedido;

@Repository
@Transactional
public class PedidoDaoImpl extends AbstractSession implements PedidoDao{

	
	@Override
	public void savePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		getSession().persist(pedido);
	}

	@Override
	public void deletePedidoById(Long idPedido) {
		// TODO Auto-generated method stub
		Pedido pedido= findById(idPedido);
		if(pedido!=null) {
			getSession().delete(pedido);
		}
	}

	@Override
	public void updatePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		getSession().update(pedido);
	}

	@Override
	public List<Pedido> findAllPedido() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Pedido").list();
	}

	@Override
	public Pedido findById(Long idPedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido findByIdCotizacion(Long idCotizacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
