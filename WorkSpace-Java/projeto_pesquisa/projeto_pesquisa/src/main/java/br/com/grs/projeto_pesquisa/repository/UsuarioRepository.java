package br.com.grs.projeto_pesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grs.projeto_pesquisa.model.entidade.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}