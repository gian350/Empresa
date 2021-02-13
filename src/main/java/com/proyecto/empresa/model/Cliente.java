package com.proyecto.empresa.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	
	@Id
	@Column(name="idCliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name="ruc")
	private Long ruc;
	
	@Column(name="razonSocial")
	private String razonSocial;
	
	@Column(name="telefono")
	private Long telefono;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="correo")
	private String correo;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="idCliente")
	private Set<Cotizacion> cotizacion;
	
	

	public Cliente(Long ruc, String razonSocial, Long telefono, String direccion, String correo) {
		super();
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getRuc() {
		return ruc;
	}

	public void setRuc(Long ruc) {
		this.ruc = ruc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Set<Cotizacion> getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Set<Cotizacion> cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	
}
