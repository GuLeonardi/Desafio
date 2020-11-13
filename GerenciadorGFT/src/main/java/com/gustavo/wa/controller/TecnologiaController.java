package com.gustavo.wa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gustavo.wa.model.Tecnologia;
import com.gustavo.wa.repository.TecnologiaRepository;

@Controller
@RequestMapping(value = "/tecnologia")
public class TecnologiaController {

	@Autowired
	private TecnologiaRepository tecnologiaRepository;
	
	@GetMapping
	public String popular() {
		Tecnologia tec = new Tecnologia(1L, "Java");
		Tecnologia tec1 = new Tecnologia(2L, "PHP");
		Tecnologia tec2 = new Tecnologia(3L, "C++");
		tecnologiaRepository.save(tec);
		tecnologiaRepository.save(tec1);
		tecnologiaRepository.save(tec2);
		return "TecnologiaPopular";
		
	}
}
