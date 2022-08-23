package com.example.api.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date comienzo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	@ManyToOne
	@JoinColumn(name="dni")
	private Investigador investigador;
	
	@ManyToOne
	@JoinColumn(name="numSerie")
	private Equipo equipo;

	/**
	 * 
	 */
	public Reserva() {
	}

	/**
	 * @param id
	 * @param comienzo
	 * @param fin
	 * @param investigador
	 * @param equipo
	 */
	public Reserva(Long id, Date comienzo, Date fin, Investigador investigador, Equipo equipo) {
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the comienzo
	 */
	public Date getComienzo() {
		return comienzo;
	}

	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @return the investigador
	 */
	public Investigador getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", investigador=" + investigador
				+ ", equipo=" + equipo + "]";
	}
	
}
