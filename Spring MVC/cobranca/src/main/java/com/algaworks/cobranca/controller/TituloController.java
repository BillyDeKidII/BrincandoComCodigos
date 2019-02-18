package com.algaworks.cobranca.controller;

import com.algaworks.cobranca.model.Titulo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@RequestMapping("/novo")
	public String novo()
	{
		return "CadastroTitulo";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo Titulo)
	{
		System.out.println(">>> " + Titulo.getDescricao());
		return "CadastroTitulo";
	}

}
 