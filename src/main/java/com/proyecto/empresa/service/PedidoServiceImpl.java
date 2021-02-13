package com.proyecto.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.empresa.dao.PedidoDao;
import com.proyecto.empresa.model.Pedido;

@Service("pedidoService")
@Transactional
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoDao _pedidoDao;
	
	@Override
	public void savePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		_pedidoDao.savePedido(pedido);
	}

	@Override
	public void deletePedidoById(Long idPedido) {
		// TODO Auto-generated method stub
		_pedidoDao.deletePedidoById(idPedido);
	}

	@Override
	public void updatePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		_pedidoDao.updatePedido(pedido);
	}

	@Override
	public List<Pedido> findAllPedido() {
		// TODO Auto-generated method stub
		return _pedidoDao.findAllPedido();
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
