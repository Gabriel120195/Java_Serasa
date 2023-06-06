package br.com.grs.projeto_pesquisa.model.dto;

import java.util.List;

import br.com.grs.projeto_pesquisa.model.enums.EstadoCivil;
import br.com.grs.projeto_pesquisa.model.enums.GeneroFilme;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PesquisaDTO {

    private Long id;
    private String nome;
    private String email;
	private String sexo;
    private EstadoCivil estadoCivil;
    private List<GeneroFilme> generosFilme;
    
}