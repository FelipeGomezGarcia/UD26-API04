package com.example.api.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="investigadores")
public class Investigador {

	@Id
	@Column(name="dni")
	private String dni;
	@Column(name="nomApels")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="facultad")
	private Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Reserva> reservas;

	/**
	 * 
	 */
	public Investigador() {
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param facultad
	 * @param reservas
	 */
	public Investigador(String dni, String nombre, Facultad facultad, List<Reserva> reservas) {
		this.dni = dni;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reservas = reservas;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the reservas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reservas")
	public List<Reserva> getReservas() {
		return reservas;
	}

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Investigador [dni=" + dni + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}
	
}
