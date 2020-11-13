package com.gustavo.wa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gustavo.wa.model.Tecnologia;
import com.gustavo.wa.model.Vaga;
import com.gustavo.wa.repository.TecnologiaRepository;
import com.gustavo.wa.repository.VagaRepository;

@Controller
@RequestMapping("/vaga")
public class VagaController {
	
	@Autowired 
	VagaRepository vagaRepository;
	
	@Autowired
	TecnologiaRepository tecnologiaRepository;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroVaga";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Vaga vaga) {
		vagaRepository.save(vaga);
		ModelAndView mv = new ModelAndView("CadastroVaga");
		mv.addObject("mensagem", "Vaga salva com sucesso!!!");
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisa() {
		List<Vaga> todosVaga = vagaRepository.findAll();
		ModelAndView mv = new ModelAndView("PesquisaVaga");
		mv.addObject("vagas", todosVaga);
		return mv;
	}
	
	@ModelAttribute("todasTecnologia")
	public List<Tecnologia> carregaTecnologia() {
		return tecnologiaRepository.findAll();
	}
}
