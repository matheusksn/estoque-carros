package com.alga.carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga.carros.model.Modelo;
import com.alga.carros.repository.ModeloRepository;


@RestController
@RequestMapping("/modelo")
public class ModeloController {

	@Autowired
	private ModeloRepository modeloRepository;

	@GetMapping
	public List<Modelo> listar() {
		return modeloRepository.findAll();

	}
	@PostMapping // salvar um parametro
	public Modelo salvar(@RequestBody Modelo modelo) { 

		Modelo novoModelo = modeloRepository.save(modelo);
		return novoModelo;

	}

}
