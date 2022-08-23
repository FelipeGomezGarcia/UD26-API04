package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.Reserva;
import com.example.api.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return reservaServiceImpl.listarReservas();
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva reservaXCodigo(@PathVariable(name="id")Long id) {
		return reservaServiceImpl.reservaXId(id);
	}
	
	@PostMapping("/reservas")
	public Reserva guardarFacultad (@RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id")Long id,@RequestBody Reserva reserva) {
		Reserva reservaActualizada = reservaServiceImpl.reservaXId(id);
		reservaActualizada.setEquipo(reserva.getEquipo());
		reservaActualizada.setInvestigador(reserva.getInvestigador());
		reservaActualizada.setComienzo(reserva.getComienzo());
		reservaActualizada.setFin(reserva.getFin());
		
		return reservaServiceImpl.guardarReserva(reservaActualizada);
	}
	
	@DeleteMapping("/reservas/{id}")
	public void eliminarReserva(@PathVariable(name="id")Long id) {
		reservaServiceImpl.eliminarReserva(id);
	}
}
