package br.com.grs.wisedelivery;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.grs.wisedelivery.dominio.restaurante.CategoriaItem;
import br.com.grs.wisedelivery.dominio.restaurante.ItemCardapio;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.dominio.restaurante.RestauranteCategoria;
import br.com.grs.wisedelivery.repository.CategoriaItemRepository;
import br.com.grs.wisedelivery.repository.ItemCardapioRepository;
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
	private ItemCardapioRepository itemCardapioRepository;

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
			rest.setEmail("teste@teste.com");
			rest.setCnpj("11122233312345");
			rest.setTelefone("1140004000");
			rest.setSenha("1234");
			rest.setCategorias(Set.of(cat1, cat2));

			Restaurante rest2 = new Restaurante();
			rest2.setNome("Podrão lanches e pastel");
			rest2.setEmail("podrao@teste.com");
			rest2.setCnpj("33322211112345");
			rest2.setTelefone("1140404040");
			rest2.setSenha("1234");
			rest2.setCategorias(Set.of(cat3, cat4));

			restauranteRepository.saveAll(List.of(rest,rest2));


			criarESalvarItensdeCardapio(rest, List.of(catItem1,catItem2));
			criarESalvarItensdeCardapio(rest2, List.of(catItem3,catItem4));
	}

	private void criarESalvarItensdeCardapio(Restaurante restaurante, List<CategoriaItem> categorias){

		var item1 = ItemCardapio.builder()
			.nome("Bolinhos de queijo")
			.descricao("Bolinhos de queijo super rechados")
			.preco(BigDecimal.valueOf(25.00))
			.destaque(Boolean.TRUE)
			.restaurante(restaurante)
			.categorias(categorias)
			.build();

		var item2 = ItemCardapio.builder()
			.nome("Hot-Dog")
			.descricao("Hot-Dog com duas salsichas")
			.preco(BigDecimal.valueOf(10.00))
			.destaque(Boolean.TRUE)
			.restaurante(restaurante)
			.categorias(categorias)
			.build();

		var item3 = ItemCardapio.builder()
			.nome("Pestel Especial")
			.descricao("Porção de pastel com vinagrete")
			.preco(BigDecimal.valueOf(40.00))
			.destaque(Boolean.FALSE)
			.restaurante(restaurante)
			.categorias(categorias)
			.build();

		var item4 = ItemCardapio.builder()
			.nome("X - Bacon")
			.descricao("Lanche delicioso com bastante bacon")
			.preco(BigDecimal.valueOf(15.00))
			.destaque(Boolean.FALSE)
			.restaurante(restaurante)
			.categorias(categorias)
			.build();


		itemCardapioRepository.saveAll(List.of(item1,item2,item3,item4));
	}
}
