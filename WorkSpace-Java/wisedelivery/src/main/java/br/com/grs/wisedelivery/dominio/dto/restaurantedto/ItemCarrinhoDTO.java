package br.com.grs.wisedelivery.dominio.dto.restaurantedto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemCarrinhoDTO {

    private ItemCardapioDTO itemCardapio;
    private String observacoes;
    private BigDecimal preco;
    private int quantidade;

    
}