package com.proyecto.empresa.dao;

import java.util.List;


import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Producto;

public interface ProductoDao {
	
	void saveProducto(Producto producto);
	
	void deleteProductoById(Long idProducto);
	
	void updateProducto(Producto producto);
	
	List<Producto>findAllProducto();
	
	Producto findById(Long idProducto);
	
	Producto findbyName(String nombre);
	
	
	Cotizacion findProductoByIdAndName(Long idProducto, String nombre);

	Cotizacion findProductoByIdCotizacion(Long idCliente, Long idProducto);
}
