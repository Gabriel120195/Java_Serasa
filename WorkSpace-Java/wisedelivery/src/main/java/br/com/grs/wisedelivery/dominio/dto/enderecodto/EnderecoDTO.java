package br.com.grs.wisedelivery.dominio.dto.enderecodto;

import lombok.Data;

@Data
public class EnderecoDTO {
    
    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private LocationDTO location;

}
