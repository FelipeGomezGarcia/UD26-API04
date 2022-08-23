package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IFacultadDAO;
import com.example.api.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	IFacultadDAO iFacultadDAO;
	
	@Override
	public List<Facultad> listarFacultades() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public void eliminarFacultad(Long codigo) {
		// TODO Auto-generated method stub
		iFacultadDAO.deleteById(codigo);
	}

}
