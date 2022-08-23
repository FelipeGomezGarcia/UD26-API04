package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Long>{

}
