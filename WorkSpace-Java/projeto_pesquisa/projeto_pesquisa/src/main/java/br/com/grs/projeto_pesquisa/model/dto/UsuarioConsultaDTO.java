package br.com.grs.projeto_pesquisa.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioConsultaDTO {
    
    private Long id;
    private String nome;
}