package br.com.grs.wisedelivery.service;

import java.util.List;

import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteIdDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteLoginDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteSalvoDTO;
import br.com.grs.wisedelivery.dominio.restaurante.RestauranteCategoria;

public interface RestauranteService {

    RestauranteIdDTO procurarRestauranteIdPeloEmail(String email);

    RestauranteIdDTO procurarRestaurantePeloId(Long id);

    RestauranteSalvoDTO procurarPeloEmail(String email);

    RestauranteSalvoDTO salvar(RestauranteDTO dto);

    List<RestauranteCategoria> pegaTodasCategorias();

    boolean logar(RestauranteLoginDTO restaurante);

    List<RestauranteDTO> procurarTodos();
    
}