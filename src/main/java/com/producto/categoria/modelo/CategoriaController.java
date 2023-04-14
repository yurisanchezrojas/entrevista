package com.producto.categoria.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

}
