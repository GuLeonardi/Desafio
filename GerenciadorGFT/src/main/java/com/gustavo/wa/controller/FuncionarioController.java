package com.gustavo.wa.controller;

import java.util.List;

import javax.swing.JComboBox;

import org.apache.catalina.Contained;
import org.hibernate.resource.beans.container.spi.AbstractCdiBeanContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gustavo.wa.model.Cargo;
import com.gustavo.wa.model.Funcionario;
import com.gustavo.wa.model.Gft;
import com.gustavo.wa.model.Tecnologia;
import com.gustavo.wa.model.Vaga;
import com.gustavo.wa.repository.FuncionarioRepository;
import com.gustavo.wa.repository.GftRepository;
import com.gustavo.wa.repository.TecnologiaRepository;
import com.gustavo.wa.repository.VagaRepository;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private GftRepository gftRepository;
	
	@Autowired
	private VagaRepository vagaRepository;
	@Autowired
	private TecnologiaRepository tecnologiaRepository;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroFuncionario");
		mv.addObject("todosCargos", Cargo.values());
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Funcionario funcionario) {	
		funcionarioRepository.save(funcionario);
		ModelAndView mv = new ModelAndView("CadastroFuncionario");
		mv.addObject("mensagem", "Funcionário salvo com sucesso!!!");
		return mv;
	}
	
	@ModelAttribute("todasGft")
	public List<Gft> carregaGft() {
		return gftRepository.findAll();
	}
	
	@ModelAttribute("todasVaga")
	public List<Vaga> carregaVaga() {
		return vagaRepository.findAll();
	}
	
	@ModelAttribute("todasTecnologia")
	public List<Tecnologia> carregaTecnologia() {
		return tecnologiaRepository.findAll();
	}
	
	@RequestMapping
	public ModelAndView pesquisar() {
		List<Funcionario> todosFuncionarios = funcionarioRepository.findAll();
		ModelAndView mv = new ModelAndView("PesquisaFuncionario");
		mv.addObject("funcionarios", todosFuncionarios);
		return mv;
	}
}
