package br.com.grs.wisedelivery.service;

import br.com.grs.wisedelivery.dominio.dto.ClienteDTO;
import br.com.grs.wisedelivery.dominio.dto.ClienteLoginDTO;
import br.com.grs.wisedelivery.dominio.dto.ClienteSalvoDTO;




public interface ClienteService {
    
    ClienteSalvoDTO salvar(ClienteDTO dto);

    boolean login(ClienteLoginDTO cliente);

}