package br.com.grs.wisedelivery.service;

import java.util.List;

import br.com.grs.wisedelivery.dominio.RestauranteCategoria;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteSalvoDTO;

public interface RestauranteService {

    RestauranteSalvoDTO salvar(RestauranteDTO dto);

    List<RestauranteCategoria> pegaTodasCategorias();
    
}