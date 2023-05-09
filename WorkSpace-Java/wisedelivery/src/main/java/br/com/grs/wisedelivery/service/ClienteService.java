package br.com.grs.wisedelivery.service;

import br.com.grs.wisedelivery.dominio.dto.clientedto.ClienteDTO;
import br.com.grs.wisedelivery.dominio.dto.clientedto.ClienteLoginDTO;
import br.com.grs.wisedelivery.dominio.dto.clientedto.ClienteSalvoDTO;




public interface ClienteService {
    
    ClienteSalvoDTO salvar(ClienteDTO dto);

    boolean login(ClienteLoginDTO cliente);

}