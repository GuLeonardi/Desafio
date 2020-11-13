package com.gustavo.wa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(value = "/wa")
public class WaController {

	@GetMapping
	public String salvar() {
		return "Wa";
	}
}
