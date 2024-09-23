package com.sesi.aula04.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.sesi.aula04.model.Usuario;


@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRpository usuarioRepository;
}
	@GetMapping("/usuarios")
	public String ListarUsuario(Model modelo) {
		modelo.
		
		
		return "usuarios";
	
	}
	
	
	
}
