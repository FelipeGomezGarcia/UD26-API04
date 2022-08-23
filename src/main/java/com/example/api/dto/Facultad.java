package com.example.api.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultades")
public class Facultad {

	@Id
	@Column(name="codigo")
	private Long codigo;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Investigador> investigadores;
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Equipo> equipos;
	/**
	 * 
	 */
	public Facultad() {
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param investigadores
	 * @param equipos
	 */
	public Facultad(Long codigo, String nombre, List<Investigador> investigadores, List<Equipo> equipos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the investigadores
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	public List<Investigador> getInvestigadores() {
		return investigadores;
	}
	/**
	 * @param investigadores the investigadores to set
	 */
	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}
	/**
	 * @return the equipos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public List<Equipo> getEquipos() {
		return equipos;
	}
	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
}
