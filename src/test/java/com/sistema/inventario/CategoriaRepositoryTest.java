package com.sistema.inventario;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.producto.categoria.modelo.Categoria;
import com.producto.categoria.modelo.ProductoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CategoriaRepositoryTest {
	
	@Autowired
	private ProductoRepository repositorio;
	
	@Test
	public void testCrearCategoria() {
		System.out.println("loco  feo");
		Categoria categoriaGuardada = repositorio.save(new Categoria("electronicos"));
		assertThat(categoriaGuardada.getId()).isGreaterThan(0);
	}
	
	

}







