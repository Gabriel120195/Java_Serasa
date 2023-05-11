package br.com.grs.wisedelivery.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.grs.wisedelivery.dominio.dto.enderecodto.EnderecoDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ServiceUtils {

    @Getter @Setter
    @Value("${brasil.api.v2.cep.url}")
    private String apiUrl;

    public void consultaCep(String cep){
        setApiUrl(apiUrl + cep);
        log.info("Api Url = " + getApiUrl());

        RestTemplate rt = new RestTemplate();

        ResponseEntity<EnderecoDTO> result = rt.getForEntity(getApiUrl(), EnderecoDTO.class);
        
        log.info("Resultado = " + result.getBody());
    }   
}