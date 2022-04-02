package com.alga.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alga.carros.model.Modelo;


@Repository
public interface ModeloRepository extends JpaRepository<Modelo,Long>{

}
