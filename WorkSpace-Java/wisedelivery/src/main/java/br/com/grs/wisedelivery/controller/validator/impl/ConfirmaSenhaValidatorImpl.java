package br.com.grs.wisedelivery.controller.validator.impl;

import org.springframework.stereotype.Component;

import br.com.grs.wisedelivery.controller.validator.Validator;
import br.com.grs.wisedelivery.dominio.dto.clientedto.ClienteDTO;

@Component
public class ConfirmaSenhaValidatorImpl implements Validator<ClienteDTO> {

    @Override
    public boolean validator(ClienteDTO cliente) {
        
        return !cliente.getSenha().equals(cliente.getConfirmaSenha());
    }

    
    
}