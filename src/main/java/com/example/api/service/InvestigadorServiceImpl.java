package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IInvestigadorDAO;
import com.example.api.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigador> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador investigadorXDni(String dni) {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.findById(dni).get();
	}

	@Override
	public void eliminarInvestigador(String dni) {
		// TODO Auto-generated method stub
		iInvestigadorDAO.deleteById(dni);
	}
}
