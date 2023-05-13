package br.com.grs.wisedelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.grs.wisedelivery.dominio.restaurante.ItemCardapio;

public interface ItemCardapioRepository extends JpaRepository<ItemCardapio,Long>{
    
}