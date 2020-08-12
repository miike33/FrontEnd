package com.fran.springboot.backend.eventos.entidades;
// Generated 22-nov-2019 13:34:24 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Evento generated by hbm2java
 */
@Entity
@Table(name = "evento", schema = "public")
public class Evento001 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private Date fecha;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public Evento001() {
	}

	public Evento001(int id, String nombre, String descripcion, BigDecimal precio, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fecha = fecha;
	}

	public Evento001(int id, String nombre, String descripcion, BigDecimal precio, Date fecha, Set<Usuario> usuarios) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fecha = fecha;
		this.usuarios = usuarios;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 150)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false, length = 2000)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "precio", nullable = false, precision = 8)
	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_asiste_evento", schema = "public", joinColumns = {
			@JoinColumn(name = "evento", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "usuario", nullable = false, updatable = false) })
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}