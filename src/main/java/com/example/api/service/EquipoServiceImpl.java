package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IEquipoDAO;
import com.example.api.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipoXNumSerie(String numSerie) {
		// TODO Auto-generated method stub
		return iEquipoDAO.findById(numSerie).get();
	}

	@Override
	public void eliminarEquipo(String numSerie) {
		// TODO Auto-generated method stub
		iEquipoDAO.deleteById(numSerie);
	}
}
