package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, String>{

}
