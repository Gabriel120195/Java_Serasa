package br.com.grs.projeto_pesquisa.model.dto;

import java.util.List;

import br.com.grs.projeto_pesquisa.model.enums.EstadoCivil;
import br.com.grs.projeto_pesquisa.model.enums.GeneroFilme;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PesquisaListaDTO {

    private Long id;
    private String nome;
	private String sexo;
    private EstadoCivil estadoCivil;
    private List<GeneroFilme> generosFilme;
    
}