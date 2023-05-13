package br.com.grs.wisedelivery.service;

import java.util.List;

import br.com.grs.wisedelivery.dominio.dto.restaurantedto.ItemCardapioDTO;
import br.com.grs.wisedelivery.dominio.restaurante.CategoriaItem;

public interface ItemCardapioService {
    
    ItemCardapioDTO salvar(ItemCardapioDTO dto);

    ItemCardapioDTO procurarPeloId(Long id);

    List<ItemCardapioDTO> procurarTodos();

    void deletar(Long id);

    List<CategoriaItem> pegarTodasAsCategorias();
}