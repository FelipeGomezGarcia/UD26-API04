package com.example.api.service;

import java.util.List;

import com.example.api.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> listarInvestigadores();
	
	public Investigador guardarInvestigador(Investigador investigador);
	
	public Investigador investigadorXDni(String dni);
	
	public void eliminarInvestigador(String dni);
}
