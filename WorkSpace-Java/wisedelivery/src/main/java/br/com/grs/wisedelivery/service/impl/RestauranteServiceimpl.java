package br.com.grs.wisedelivery.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteSalvoDTO;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.dominio.restaurante.RestauranteCategoria;
import br.com.grs.wisedelivery.repository.RestauranteCategoriaRepository;
import br.com.grs.wisedelivery.repository.RestauranteRepository;
import br.com.grs.wisedelivery.service.RestauranteService;
import lombok.Getter;


@Service
public class RestauranteServiceimpl implements RestauranteService{

    @Autowired
    @Getter
    private RestauranteRepository restauranteRepository;

    @Autowired
    @Getter
    private RestauranteCategoriaRepository restauranteCategoriaRepository;

    @Autowired
    @Getter
    private imageServiceimpl imageService;

    @Override
    public RestauranteSalvoDTO salvar(RestauranteDTO dto){
        dto.setLogotipo(imageService.uploadImagem(dto.getArquivoLogotipo()));
        return deRestauranteParaRestauranteSalvoDto(getRestauranteRepository().save(deDtoParaRestaurante(dto)));    
    }

    @Override
    public List<RestauranteCategoria> pegaTodasCategorias() {
        return restauranteCategoriaRepository.findAll();
    }

    private Restaurante deDtoParaRestaurante(RestauranteDTO dto){
        Restaurante restaurante = new Restaurante();
        BeanUtils.copyProperties(dto, restaurante, "confirmaSenha");
        return restaurante;
    }

    private RestauranteSalvoDTO deRestauranteParaRestauranteSalvoDto(Restaurante restaurante){
        RestauranteSalvoDTO dto = new RestauranteSalvoDTO();
        BeanUtils.copyProperties(restaurante, dto, "confirmaSenha");
        return dto;
    } 
}