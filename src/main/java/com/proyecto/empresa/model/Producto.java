package com.proyecto.empresa.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
	@Id
	@Column(name="idProducto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="categoria")
	private Long categoria;
	
	@Column(name="proveedor")
	private String proveedor;
	
	@Column(name="precioUnitario")
	private Float precioUnitario;
	
	@Column(name="procedencia")
	private String procedencia;
	
	@Column(name="stock")
	private Long stock;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany
	@JoinColumn(name="idProducto")
	@JsonIgnore
	private Set<Cotizacion> cotizacion;
	
	

	public Producto( String nombre, Long categoria, String proveedor, Float precioUnitario, String procedencia,
			Long stock, String descripcion) {
		super();
		
		this.nombre = nombre;
		this.categoria = categoria;
		this.proveedor = proveedor;
		this.precioUnitario = precioUnitario;
		this.procedencia = procedencia;
		this.stock = stock;
		this.descripcion = descripcion;
		
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Cotizacion> getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Set<Cotizacion> cotizacion) {
		this.cotizacion = cotizacion;
	}


	
	
}
