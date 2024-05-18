package com.github.acnaweb.mvc_rh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.acnaweb.mvc_rh.model.Departamento;
import com.github.acnaweb.mvc_rh.model.Funcionario;
import com.github.acnaweb.mvc_rh.repository.DepartamentoRepository;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	@GetMapping()
	public String list(Model model) {
		List<Departamento> departamentos = departamentoRepository.findAll();
		model.addAttribute("departamentos", departamentos);
		return "departamento/list";
	}

	@GetMapping("cargos")
	public String cargosByDepartamento() {
		return "departamento/list_cargos";
	}

	@GetMapping("form")
	public String form() {
		return "departamento/form";
	}
	
	@GetMapping("add")
	public String create(Model model) {
		model.addAttribute("departamento",  new Departamento());	
		return "departamento/form";
	}
}
