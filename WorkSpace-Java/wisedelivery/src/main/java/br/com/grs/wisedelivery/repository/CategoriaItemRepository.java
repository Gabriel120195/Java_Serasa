package br.com.grs.wisedelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grs.wisedelivery.dominio.restaurante.CategoriaItem;

public interface CategoriaItemRepository extends JpaRepository<CategoriaItem,Long>{
    
}