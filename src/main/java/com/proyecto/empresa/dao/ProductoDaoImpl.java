package com.proyecto.empresa.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;


import com.proyecto.empresa.model.Cliente;
import com.proyecto.empresa.model.Cotizacion;
import com.proyecto.empresa.model.Producto;

@Repository
@Transactional
public class ProductoDaoImpl extends AbstractSession implements ProductoDao{


	
	@Override
	public void saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		getSession().persist(producto);
	}

	@Override
	public void deleteProductoById(Long idProducto) {
		// TODO Auto-generated method stub
		Producto producto= findById(idProducto);
		if(producto!=null) {
			getSession().delete(producto);
		}
	}

	@Override
	public void updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		getSession().update(producto);
	}

	@Override
	public List<Producto> findAllProducto() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Producto").list();
	}

	@Override
	public Producto findById(Long idProducto) {
		// TODO Auto-generated method stub
		return (Producto) getSession().get(Producto.class, idProducto);
	}



	@Override
	public Cotizacion findProductoByIdAndName(Long idProducto, String nombre) {
		// TODO Auto-generated method stub
		List<Object[]> objects = getSession().createQuery(
				"from Cotizacion tsm join tsm.producto sm "
				+ "where sm.idProducto = :idProducto and tsm.nombre = :nombre")
				.setParameter("idProducto", idProducto)
				.setParameter("nombre", nombre).list();
		
		if (objects.size() > 0) {
			for (Object[] objects2 : objects) {
				for (Object object : objects2) {
					if (object instanceof Cotizacion) {
						return (Cotizacion) object;
					}
				}
			}
		}
		
		return null;
	}

	@Override
	public Cotizacion findProductoByIdCotizacion(Long idCliente, Long idProducto) {
		// TODO Auto-generated method stub
		List<Object[]> objs = getSession().createQuery(
				"from Cotizacion tsm join tsm.producto sm "
				+ "join tsm.cliente t where sm.idProducto = :idProducto "
				+ "and t.idCliente = :idCliente")
				.setParameter("idProducto", idProducto)
				.setParameter("idCliente", idCliente).list();
		
		if (objs.size()>0) {
			for (Object[] objects : objs) {
				for (Object object : objects) {
					if (object instanceof Cotizacion) {
						return (Cotizacion) object;
					}
				}
			}
		}
		return null;
	}

	@Override
	public Producto findbyName(String nombre) {
		// TODO Auto-generated method stub
		return (Producto) getSession().createQuery("from Producto where nombre = :nombre").setParameter("nombre",nombre).uniqueResult();
	}

}
