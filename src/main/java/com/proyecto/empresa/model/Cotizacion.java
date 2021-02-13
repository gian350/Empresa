package com.proyecto.empresa.model;

import java.io.Serializable;

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

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="cotizacion")
public class Cotizacion implements Serializable{
	
	@Id
	@Column(name="idCotizacion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCotizacion;
	
	@Column(name="cantidad")
	private Long cantidad;
	
	@Column(name="fechaLimite")
	private Date fechaLimite;
	
	@Column(name="fechaEntrega")
	private Date fechaEntrega;
	
	@Column(name="tipoEntrega")
	private String tipoEntrega;
	
	@Column(name="totalPagar")
	private Float totalPagar;
	
	@Column(name="descuento")
	private Float descuento;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idCliente")
	@JsonIgnore
	private Cliente cliente; 
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	

	public Cotizacion(Cliente cliente, Producto producto, Long cantidad, Date fechaLimite, Date fechaEntrega, String tipoEntrega, Float totalPagar,
			Float descuento) {
		super();
		this.cliente = cliente;
		this.producto= producto;
		this.cantidad = cantidad;
		this.fechaLimite = fechaLimite;
		this.fechaEntrega = fechaEntrega;
		this.tipoEntrega = tipoEntrega;
		this.totalPagar = totalPagar;
		this.descuento = descuento;
		
	}

	public Cotizacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCotizacion() {
		return idCotizacion;
	}

	public void setIdCotizacion(Long idCotizacion) {
		this.idCotizacion = idCotizacion;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public Float getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(Float totalPagar) {
		this.totalPagar = totalPagar;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	
}
