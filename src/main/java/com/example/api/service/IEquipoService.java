package com.example.api.service;

import java.util.List;

import com.example.api.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> listarEquipos();
	
	public Equipo guardarEquipo(Equipo equipo);
	
	public Equipo equipoXNumSerie(String numSerie);
	
	public void eliminarEquipo(String numSerie);
}
