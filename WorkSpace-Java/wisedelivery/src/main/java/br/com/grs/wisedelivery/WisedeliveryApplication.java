package br.com.grs.wisedelivery;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.grs.wisedelivery.dominio.restaurante.CategoriaItem;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.dominio.restaurante.RestauranteCategoria;
import br.com.grs.wisedelivery.repository.CategoriaItemRepository;
import br.com.grs.wisedelivery.repository.RestauranteCategoriaRepository;
import br.com.grs.wisedelivery.repository.RestauranteRepository;
import br.com.grs.wisedelivery.utils.ServiceUtils;


@SpringBootApplication
public class WisedeliveryApplication implements CommandLineRunner {

	@Autowired
	private RestauranteCategoriaRepository restauranteCategoriaRepository;

	@Autowired
	private CategoriaItemRepository categoriaItemRepository;

	@Autowired
	private RestauranteRepository restauranteRepository;

	@Autowired
	private ServiceUtils utils;

	public static void main(String[] args) {
		SpringApplication.run(WisedeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		var cat1 = RestauranteCategoria.builder()
			.nome("Churrasco")
			.imagem("null")
			.build();

		var cat2 = RestauranteCategoria.builder()
			.nome("Massas")
			.imagem("null")
			.build();

		var cat3 = RestauranteCategoria.builder()
			.nome("Asiática")
			.imagem("null")
			.build();

		var cat4 = RestauranteCategoria.builder()
			.nome("Mexicana")
			.imagem("null")
			.build();


		restauranteCategoriaRepository.saveAll(List.of(cat1, cat2, cat3, cat4));

		utils.consultaCep("09791520");

		var catItem1 = CategoriaItem.builder()
			.nome("Bebidas")
			.imagem("null")
			.build();

		var catItem2 = CategoriaItem.builder()
			.nome("Refeição")
			.imagem("null")
			.build();

		var catItem3 = CategoriaItem.builder()
			.nome("Lanches")
			.imagem("null")
			.build();

		var catItem4 = CategoriaItem.builder()
			.nome("Sobremesa")
			.imagem("null")
			.build();

			categoriaItemRepository.saveAll(List.of(catItem1, catItem2, catItem3, catItem4));

			Restaurante rest = new Restaurante();
			rest.setNome("StarBucks");
			rest.setEmail("starbucks@teste.com");
			rest.setCnpj("11122233312345");
			rest.setTelefone("1140004000");
			rest.setSenha("1234");

			rest.setCategorias(Set.of(cat1, cat2));

			restauranteRepository.save(rest);
	}
}
