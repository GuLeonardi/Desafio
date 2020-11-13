package com.gustavo.wa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/historico")
@Controller
public class HistoricoController {

	@GetMapping
	public String salvar() {
		return "Historico";
	}
}
