package br.com.grs.projeto_pesquisa.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.grs.projeto_pesquisa.model.enums.EstadoCivil;
import br.com.grs.projeto_pesquisa.model.enums.GeneroFilme;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;


@Data
public class PesquisaInserirDTO {

    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    @Size(min = 5, max = 100, message = "Nome deve ter no mínimo 5 e no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "Email não pode ser vazio")
    @Email(message = "Por favor digite um e-mail válido")
    private String email;

    @NotBlank(message = "Sexo não pode ser vazio")
    private String sexo;

    @NotNull(message = "Estado Civil deve ser preenchido")
    private EstadoCivil estadoCivil;

    @NotNull(message = "Genero de Filmes deve ser preenchido")
    
    private List<GeneroFilme> generosFilme = new ArrayList<>();    
    
}