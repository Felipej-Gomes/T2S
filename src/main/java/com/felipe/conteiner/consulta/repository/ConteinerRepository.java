package com.felipe.conteiner.consulta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.conteiner.consulta.model.Conteiner;

@Repository
public interface ConteinerRepository extends JpaRepository<Conteiner, Long> {
	//public List<Conteiner>findAllByClienteContainIgnoreCase(String cliente);
}
