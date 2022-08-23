package com.example.api.service;

import java.util.List;

import com.example.api.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultades();
	
	public Facultad guardarFacultad(Facultad facultad);
	
	public Facultad facultadXCodigo(Long codigo);
	
	public void eliminarFacultad(Long codigo);
}
