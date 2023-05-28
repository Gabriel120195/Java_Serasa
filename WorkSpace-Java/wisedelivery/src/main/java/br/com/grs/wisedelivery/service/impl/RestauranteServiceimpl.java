package br.com.grs.wisedelivery.service.impl;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteIdDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteLoginDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.RestauranteSalvoDTO;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.dominio.restaurante.RestauranteCategoria;
import br.com.grs.wisedelivery.exception.ObjetoNaoEncontradoException;
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

    private RestauranteDTO deRestauranteParaRestauranteDto(Restaurante restaurante){
        RestauranteDTO dto = new RestauranteDTO();
        BeanUtils.copyProperties(restaurante, dto, "senha","confirmaSenha");
        return dto;
    }

    @Override
    public boolean logar(RestauranteLoginDTO restaurante) {
        Restaurante restauranteBanco = getRestauranteRepository().findByEmail(restaurante.getEmail()).orElseThrow(
            () -> new ObjetoNaoEncontradoException("Não foi encontrado um restaurante para o e-mail passado"));
            return restaurante.getEmail().equals(restauranteBanco.getEmail())
            && restaurante.getSenha().equals(restauranteBanco.getSenha());
            
    }

    @Override
    public RestauranteSalvoDTO procurarPeloEmail(String email) {
        return deRestauranteParaRestauranteSalvoDto(getRestauranteRepository().findByEmail(email).orElseThrow(
        () -> new ObjetoNaoEncontradoException("Não foi encontrado um restaurante para o e-mail passado")));
        
        //deRestauranteParaRestauranteSalvoDto(restauranteBanco)
    }

    public RestauranteIdDTO procurarRestauranteIdPeloEmail(String email) {
        RestauranteIdDTO dto = new RestauranteIdDTO();
        Restaurante rest = getRestauranteRepository().findByEmail(email).orElseThrow(
        () -> new ObjetoNaoEncontradoException("Não foi encontrado um restaurante para o e-mail passado"));

        dto.setId(rest.getId());
        return dto;
    }

    @Override
    public List<RestauranteDTO> procurarTodos() {
        
        //Faz a mesma coisa que a linha 106
        // List<Restaurante> restaurantes = getRestauranteRepository().findAll();
        // List<RestauranteDTO> restaurantesDto = new ArrayList<>();

        // for (Restaurante restaurante : restaurantes) {
        //     RestauranteDTO dto = deRestauranteParaRestauranteDto(restaurante);
        //     restaurantesDto.add(dto);
        // }
        // return restaurantesDto;

        return getRestauranteRepository().findAll().stream().map(this::deRestauranteParaRestauranteDto).toList();
    }

    @Override
    public RestauranteIdDTO procurarRestaurantePeloId(Long id){
        Restaurante restaurante = getRestauranteRepository().findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Não foi encontrado um restaurante para o e-mail passado"));
        RestauranteIdDTO dto = new RestauranteIdDTO();
        dto.setId(restaurante.getId());
        dto.setNome(restaurante.getNome());
        return dto;
    }
}