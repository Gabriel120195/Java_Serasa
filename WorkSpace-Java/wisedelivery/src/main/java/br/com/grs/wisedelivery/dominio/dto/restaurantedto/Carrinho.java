package br.com.grs.wisedelivery.dominio.dto.restaurantedto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;
import br.com.grs.wisedelivery.exception.RestauranteDiferenteException;
import br.com.grs.wisedelivery.service.ItemCardapioService;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class Carrinho {

    public Carrinho(ItemCardapioService itemCardapioService){
        this.itemCardapioService = itemCardapioService;
    }

    private final ItemCardapioService itemCardapioService;

    @Getter private List<ItemCarrinhoDTO> itens = new ArrayList<>();
    private Restaurante restaurante;
    private ItemCardapioDTO itemCardapioDto;
    @Getter private BigDecimal total = new BigDecimal(0);

    public void adicionarItem(ItemCarrinhoDTO itemCarrinhoDTO, Long itemCardapioDtoId){
        setItemCardapio(itemCardapioDtoId);
        log.info(String.format("Restaurante: [%s]", itemCardapioDto.getRestaurante().getNome()));

        if (itens.isEmpty()) {
            this.restaurante = itemCardapioDto.getRestaurante();
        }
        else if(!restauranteIgual(itemCardapioDto.getRestaurante())){
            throw new RestauranteDiferenteException("Não é possivel adicionar itens de restaurante diferentes no mesmo carrinho");
        }

        itemCarrinhoDTO.setItemCardapio(itemCardapioDto);
        itemCarrinhoDTO.setPreco(itemCardapioDto.getPreco().multiply(BigDecimal.valueOf(itemCarrinhoDTO.getQuantidade())));

        log.info(String.format("Adicionando item ao carrinho: [%s]", itemCarrinhoDTO.getItemCardapio().getNome()));
        log.info(String.format("Adicionando item ao carrinho, preço: [%s]", itemCarrinhoDTO.getPreco()));
        log.info(String.format("Restaurante: [%s]", itemCarrinhoDTO.getItemCardapio().getRestaurante().getNome()));
        itens.add(itemCarrinhoDTO);
        setTotalCarrinho(itemCarrinhoDTO);
    }

    private boolean restauranteIgual(Restaurante restaurante){
        return this.restaurante.equals(restaurante);
    }

    public void setItemCardapio(Long itemCardapioDtoId) {
        this.itemCardapioDto = itemCardapioService.procurarPeloId(itemCardapioDtoId);
    }

    public void setTotalCarrinho(ItemCarrinhoDTO item){
        this.total = total.add(item.getPreco());
    }
    
}