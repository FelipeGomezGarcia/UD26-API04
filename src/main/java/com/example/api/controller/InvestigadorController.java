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

import com.example.api.dto.Investigador;
import com.example.api.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadores(){
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	@GetMapping("/investigadores/{dni}")
	public Investigador investigadorXDni(@PathVariable(name="dni")String dni) {
		return investigadorServiceImpl.investigadorXDni(dni);
	}
	
	@PostMapping("/investigadores")
	public Investigador guardarInvestigador (@RequestBody Investigador investigador) {
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	@PutMapping("/investigadores/{dni}")
	public Investigador actualizarInvestigador(@PathVariable(name="dni")String dni,@RequestBody Investigador investigador) {
		Investigador investigadorActualizado = investigadorServiceImpl.investigadorXDni(dni);
		investigadorActualizado.setNombre(investigador.getNombre());
		investigadorActualizado.setFacultad(investigador.getFacultad());
		
		return investigadorServiceImpl.guardarInvestigador(investigadorActualizado);
	}
	
	@DeleteMapping("/investigadores/{dni}")
	public void eliminarEquipo(@PathVariable(name="dni")String dni) {
		investigadorServiceImpl.eliminarInvestigador(dni);
	}
}
