package com.proyecto.empresa.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pedido")
public class Pedido implements Serializable{
	
	@Id
	@Column(name="idPedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPedido;
	
	@Column(name="estado")
	private String estado;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idCotizacion", unique = true, nullable = false)
	private Cotizacion cotizacion;
	

	public Pedido( Cotizacion cotizacion, String estado) {
		super();
		this.cotizacion = cotizacion;
		this.estado = estado;	
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cotizacion getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	
}
