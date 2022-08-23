package com.example.api.service;

import java.util.List;

import com.example.api.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas();
	
	public Reserva guardarReserva(Reserva reserva);
	
	public Reserva reservaXId(Long id);
	
	public void eliminarReserva(Long id);
}
