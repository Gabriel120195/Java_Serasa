package br.com.grs.projeto_pesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grs.projeto_pesquisa.model.entidade.Pesquisa;


public interface PesquisaRepository extends JpaRepository<Pesquisa, Long>{

    Pesquisa findByIdAndNome(Long id, String nome);
}