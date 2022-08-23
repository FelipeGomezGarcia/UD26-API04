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

import com.example.api.dto.Facultad;
import com.example.api.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacutades(){
		return facultadServiceImpl.listarFacultades();
	}
	
	@GetMapping("/facultades/{codigo}")
	public Facultad facultadXCodigo(@PathVariable(name="codigo")Long codigo) {
		return facultadServiceImpl.facultadXCodigo(codigo);
	}
	
	@PostMapping("/facultades")
	public Facultad guardarFacultad (@RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	@PutMapping("/facultades/{codigo}")
	public Facultad actualizarFacultad(@PathVariable(name="codigo")Long codigo,@RequestBody Facultad facultad) {
		Facultad facultadActualizada = facultadServiceImpl.facultadXCodigo(codigo);
		facultadActualizada.setNombre(facultad.getNombre());
		
		return facultadServiceImpl.guardarFacultad(facultadActualizada);
	}
	
	@DeleteMapping("/facultades/{codigo}")
	public void eliminarFacultad(@PathVariable(name="codigo")Long codigo) {
		facultadServiceImpl.eliminarFacultad(codigo);
	}
}
