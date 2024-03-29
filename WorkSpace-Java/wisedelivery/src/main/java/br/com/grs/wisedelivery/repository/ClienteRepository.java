package br.com.grs.wisedelivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grs.wisedelivery.dominio.cliente.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional <Cliente> findByEmail(String email);
    
}