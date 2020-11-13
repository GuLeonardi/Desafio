package com.gustavo.wa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gustavo.wa.model.Funcionario;
import com.gustavo.wa.model.Vaga;
import com.gustavo.wa.repository.FuncionarioRepository;
import com.gustavo.wa.repository.VagaRepository;


@Controller
@RequestMapping(value = "/alocacao")
public class AlocacaoController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private VagaRepository vagaRepository;
	
	@GetMapping
	public ModelAndView salvar(String alocfunc,Long alocvaga) {
		ModelAndView mv = new ModelAndView("Alocacao");
		System.out.println(alocvaga);
		System.out.println(alocfunc);
		return mv;
	}
	
	@ModelAttribute("todosFuncionarios")
	public List<Funcionario> carregaFuncionario() {
		return funcionarioRepository.findAll()
;	}
	
	@ModelAttribute("todasVaga")
	public List<Vaga> carregaVaga() {
		return vagaRepository.findAll();
	}
	
	@RequestMapping(value = "/alocacao", method = RequestMethod.POST)
    public ModelAndView pesquisar(Funcionario funcionario, Vaga vaga) {
        ModelAndView mv = new ModelAndView("Alocacao");
        List<Funcionario> todosFuncionarios = funcionarioRepository.findAll();
        System.out.println(funcionario.getMatricula());
        List<Vaga> todasVaga = vagaRepository.findAll();
        mv.addObject("alocfunc", todosFuncionarios);
        mv.addObject("alocvaga", todasVaga);
        return mv;
    }
	
}
