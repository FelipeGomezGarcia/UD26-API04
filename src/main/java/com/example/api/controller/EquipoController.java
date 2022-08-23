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

import com.example.api.dto.Equipo;
import com.example.api.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipo> listarEquipos(){
		return equipoServiceImpl.listarEquipos();
	}
	
	@GetMapping("/equipos/{numSerie}")
	public Equipo equipoXNumSerie(@PathVariable(name="numSerie")String numSerie) {
		return equipoServiceImpl.equipoXNumSerie(numSerie);
	}
	
	@PostMapping("/equipos")
	public Equipo guardarEquipo (@RequestBody Equipo equipo) {
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	@PutMapping("/equipos/{numSerie}")
	public Equipo actualizarEquipo(@PathVariable(name="numSerie")String numSerie,@RequestBody Equipo equipo) {
		Equipo equipoActualizado = equipoServiceImpl.equipoXNumSerie(numSerie);
		equipoActualizado.setNombre(equipo.getNombre());
		equipoActualizado.setFacultad(equipo.getFacultad());
		
		return equipoServiceImpl.guardarEquipo(equipoActualizado);
	}
	
	@DeleteMapping("/equipos/{numSerie}")
	public void eliminarEquipo(@PathVariable(name="numSerie")String numSerie) {
		equipoServiceImpl.eliminarEquipo(numSerie);
	}
}
