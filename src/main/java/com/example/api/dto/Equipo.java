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
@Table(name="equipos")
public class Equipo {

	@Id
	@Column(name="numSerie")
	private String numSerie;
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="facultad")
	private Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="numSerie")
	private List<Reserva> reservas;

	/**
	 * 
	 */
	public Equipo() {
	}

	/**
	 * @param numSerie
	 * @param nombre
	 * @param facultad
	 * @param reservas
	 */
	public Equipo(String numSerie, String nombre, Facultad facultad, List<Reserva> reservas) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reservas = reservas;
	}

	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
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
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}
	
	
}
