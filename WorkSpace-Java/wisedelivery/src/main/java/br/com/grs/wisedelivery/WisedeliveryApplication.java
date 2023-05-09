package br.com.grs.wisedelivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.grs.wisedelivery.dominio.RestauranteCategoria;
import br.com.grs.wisedelivery.repository.RestauranteCategoriaRepository;

@SpringBootApplication
public class WisedeliveryApplication implements CommandLineRunner {

	@Autowired
	private RestauranteCategoriaRepository restauranteCategoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(WisedeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		RestauranteCategoria cat1 = RestauranteCategoria.builder().nome("Churrasco").build();

		RestauranteCategoria cat2 = RestauranteCategoria.builder().nome("Massas").build();

		RestauranteCategoria cat3 = RestauranteCategoria.builder().nome("Asiática").build();

		RestauranteCategoria cat4 = RestauranteCategoria.builder().nome("Lanches").build();


		restauranteCategoriaRepository.saveAll(List.of(cat1, cat2, cat3, cat4));
	}

}
