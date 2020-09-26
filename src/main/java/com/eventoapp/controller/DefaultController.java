package com.eventoapp.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan(basePackages = { "com.evento" })
@Controller
public class DefaultController {

	@GetMapping({ "index" })
	public String home() {
		return "/index";
	}

	@GetMapping({ "cad_user" })
	public String user() {
		return "/cad_user";
	}

	@GetMapping({ "cad_equipamentos" })
	public String equipamentos() {
		return "/cad_equipamentos";
	}

	@GetMapping({ "entrega" })
	public String entrega() {
		return "/entrega";
	}

	@GetMapping({ "consulta" })
	public String consulta() {
		return "/consulta";
	}

	@GetMapping({ "emprestimo" })
	public String emprestimo() {
		return "/emprestimo";
	}

	@GetMapping({ "devolucao" })
	public String devolucao() {
		return "/devolucao";
	}

}
