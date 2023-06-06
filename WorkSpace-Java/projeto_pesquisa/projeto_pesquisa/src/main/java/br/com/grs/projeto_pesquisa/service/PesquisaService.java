package br.com.grs.projeto_pesquisa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grs.projeto_pesquisa.exceptions.ObjetoNaoEncontradoException;
import br.com.grs.projeto_pesquisa.model.dto.PesquisaDTO;
import br.com.grs.projeto_pesquisa.model.dto.PesquisaInserirDTO;
import br.com.grs.projeto_pesquisa.model.dto.PesquisaListaDTO;
import br.com.grs.projeto_pesquisa.model.entidade.Pesquisa;
import br.com.grs.projeto_pesquisa.repository.PesquisaRepository;
import lombok.Getter;

@Service
public class PesquisaService {
    
    @Autowired
    @Getter
    private PesquisaRepository repository;

    public PesquisaDTO salvar(PesquisaInserirDTO pesquisaDto) {
        Pesquisa pesquisa = dto2PesquisaBuilder(pesquisaDto);
        pesquisa = getRepository().save(pesquisa);
        return pesquisa2PesquisaDtoBuilder(pesquisa);
    }

    public List<PesquisaListaDTO> findAll() {
        return listaPesquisa2ListaPesquisaListaDTO(repository.findAll());
    }

    private Pesquisa dto2PesquisaBuilder(PesquisaInserirDTO pesquisaInserirDto) {
        return Pesquisa.builder()
            .id(pesquisaInserirDto.getId())
            .nome(pesquisaInserirDto.getNome())
            .email(pesquisaInserirDto.getEmail())
            .sexo(pesquisaInserirDto.getSexo())
            .estadoCivil(pesquisaInserirDto.getEstadoCivil())
            .generosFilme(pesquisaInserirDto.getGenerosFilme())
            .build();
    }

    private PesquisaDTO pesquisa2PesquisaDtoBuilder(Pesquisa pesquisa) {
        return PesquisaDTO.builder()
            .id(pesquisa.getId())
            .nome(pesquisa.getNome())
            .email(pesquisa.getEmail())
            .sexo(pesquisa.getSexo())
            .estadoCivil(pesquisa.getEstadoCivil())
            .generosFilme(pesquisa.getGenerosFilme())
            .build();
    }

    private List<PesquisaListaDTO> listaPesquisa2ListaPesquisaListaDTO(List<Pesquisa> pesquisas) {
        return pesquisas.stream().map(pesquisa -> new PesquisaListaDTO(pesquisa.getId(), pesquisa.getNome(),
                pesquisa.getSexo(), pesquisa.getEstadoCivil(), pesquisa.getGenerosFilme()))
                .collect(Collectors.toList());
    }

    public void removerPeloId(Long id) {
        repository.deleteById(id);
    }

    public Pesquisa procurarPeloId(Long id) throws ObjetoNaoEncontradoException {
        return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado no banco de dados!"));
    }
    
}