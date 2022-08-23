package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo, String>{

}
