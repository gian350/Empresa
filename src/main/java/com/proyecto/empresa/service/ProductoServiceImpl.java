package com.proyecto.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.empresa.dao.ProductoDao;
import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Producto;

@Service("productoService")
@Transactional
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoDao _productoDao;
	
	@Override
	public void saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		_productoDao.saveProducto(producto);
	}
	
	@Override
	public void updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		_productoDao.updateProducto(producto);
	}
	
	@Override
	public void deleteProductoById(Long idProducto) {
		// TODO Auto-generated method stub
		_productoDao.deleteProductoById(idProducto);
	}


	@Override
	public List<Producto> findAllProducto() {
		// TODO Auto-generated method stub
		return _productoDao.findAllProducto();
	}

	@Override
	public Producto findById(Long idProducto) {
		// TODO Auto-generated method stub
		return _productoDao.findById(idProducto);
	}

	@Override
	public Producto findbyName(String nombre) {
		// TODO Auto-generated method stub
		return _productoDao.findbyName(nombre);
	}

	@Override
	public Cotizacion findProductoByIdAndName(Long idProducto, String nombre) {
		// TODO Auto-generated method stub
		return _productoDao.findProductoByIdAndName(idProducto, nombre);
	}

	@Override
	public Cotizacion findProductoByIdCotizacion(Long idCliente, Long idProducto) {
		// TODO Auto-generated method stub
		return _productoDao.findProductoByIdCotizacion(idCliente, idProducto);
	}



}
