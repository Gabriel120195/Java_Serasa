package br.com.grs.wisedelivery.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grs.wisedelivery.dominio.dto.restaurantedto.ItemCardapioDTO;
import br.com.grs.wisedelivery.dominio.dto.restaurantedto.ItemCardapioTabelaDTO;
import br.com.grs.wisedelivery.dominio.restaurante.CategoriaItem;
import br.com.grs.wisedelivery.dominio.restaurante.ItemCardapio;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.exception.ObjetoNaoEncontradoException;
import br.com.grs.wisedelivery.repository.CategoriaItemRepository;
import br.com.grs.wisedelivery.repository.ItemCardapioRepository;
import br.com.grs.wisedelivery.repository.RestauranteRepository;
import br.com.grs.wisedelivery.service.ItemCardapioService;
import lombok.Getter;

@Service
public class ItemCardapioServiceimpl implements ItemCardapioService{

    @Autowired @Getter
    private ItemCardapioRepository itemCardapioRepository;

    @Autowired @Getter
    private CategoriaItemRepository categoriaItemRepository;

    @Autowired @Getter
    private RestauranteRepository restauranteRepository;

    @Override
    public ItemCardapioDTO salvar(ItemCardapioDTO dto) {
        ItemCardapio itemCardapio = getItemCardapioRepository().save(deDtoParaItemCardapio(dto));
        dto = deItemCardapioParaItemCardapioDto(itemCardapio);
        return dto;
    }

    @Override
    public ItemCardapioDTO procurarPeloId(Long id) {
        ItemCardapio item = getItemCardapioRepository().findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Não foi encontrado nenhum item para o ID: " + id));
        return deItemCardapioParaItemCardapioDto(item);
    }

    @Override
    public List<ItemCardapioDTO> procurarTodos() {
        return getItemCardapioRepository().findAll().stream().map(item -> deItemCardapioParaItemCardapioDto(item)).toList();
    }

    @Override
    public void deletar(Long id) {
        getItemCardapioRepository().deleteById(id);
    }

    @Override
    public List<CategoriaItem> pegarTodasAsCategorias() {
        return getCategoriaItemRepository().findAll();
    }

    private ItemCardapio deDtoParaItemCardapio(ItemCardapioDTO dto){
        ItemCardapio itemCardapio = new ItemCardapio();
        BeanUtils.copyProperties(dto, itemCardapio);
        return itemCardapio;
    }

    private ItemCardapioDTO deItemCardapioParaItemCardapioDto(ItemCardapio itemCardapio){
        ItemCardapioDTO dto = new ItemCardapioDTO();
        BeanUtils.copyProperties(itemCardapio, dto);
        dto.setRestaurante(itemCardapio.getRestaurante());
        return dto;
    }

    private ItemCardapioTabelaDTO deItemCardapioParaItemCardapioTabelaDTO(ItemCardapio itemCardapio){
        ItemCardapioTabelaDTO dto = new ItemCardapioTabelaDTO();
        BeanUtils.copyProperties(itemCardapio, dto, "restaurante, categorias");
        dto.setRestauranteId(itemCardapio.getRestaurante().getId());
        dto.setCategorias(itemCardapio.getCategorias().stream().map(
            categoria -> categoria.getNome()).toList());
        
        return dto;

    }

    @Override
    public List<ItemCardapioTabelaDTO> procurarTodosOsItensPeloIdDoRestaurante(Long restauranteId) {
        Restaurante restaurante = getRestauranteRepository().findById(restauranteId).orElseThrow(() -> new ObjetoNaoEncontradoException("Não foi encontrado para este Id"));
        return getItemCardapioRepository().findByRestauranteAndAtivoOrderByNome(restaurante, true).stream().map(this::deItemCardapioParaItemCardapioTabelaDTO).toList();
    }

    @Override
    public List<ItemCardapioTabelaDTO> procurarTodosOsItensPeloIdDoRestauranteEQueEstejamEmDestaque(Long restauranteId) {
        return getItemCardapioRepository()
                            .findByRestauranteIdAndDestaqueAndAtivoOrderByNome(restauranteId, Boolean.TRUE,Boolean.TRUE)
                            .stream()
                            .map(this::deItemCardapioParaItemCardapioTabelaDTO)
                            .toList();
    }
}