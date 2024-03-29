package br.com.grs.wisedelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.grs.wisedelivery.dominio.restaurante.ItemCardapio;
import br.com.grs.wisedelivery.dominio.restaurante.Restaurante;

public interface ItemCardapioRepository extends JpaRepository<ItemCardapio,Long>{

    List<ItemCardapio> findByRestauranteAndAtivoOrderByNome(Restaurante restaurante, boolean ativo);

    List<ItemCardapio> findByRestauranteIdAndDestaqueAndAtivoOrderByNome(Long restauranteId, boolean destaque, boolean ativo);
    

}