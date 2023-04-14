package com.producto.categoria.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("/productos")
	public String listarCategorias(Model modelo) {
		List<Categoria> listaCategorias = productoRepository.findAll();
		modelo.addAttribute("listaCategorias", listaCategorias);
		return "categorias";
		
	}

}







