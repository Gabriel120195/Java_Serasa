package br.com.grs.wisedelivery.dominio.dto.restaurantedto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemCarrinhoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private String observacoes;
    private BigDecimal preco;
    private int quantidade;

    
}