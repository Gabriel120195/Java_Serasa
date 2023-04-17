package entidade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
	
	private static List<Pesquisa> pesquisas = new ArrayList<>();

	public Pesquisa salvar(Pesquisa novaPesquisa) {
		pesquisas.add(novaPesquisa);
		return novaPesquisa;
	}
	
	public Pesquisa atualizar(Pesquisa pesquisaAtualizada) {
		Pesquisa pesquisa = procurarPeloId(pesquisaAtualizada.getId());
		if(pesquisas.contains(pesquisa)) {
			pesquisas.remove(pesquisa);
			pesquisas.add(pesquisaAtualizada);
		}
		return pesquisaAtualizada;
	}
	
	public List<Pesquisa> getPesquisas(){
		List<Pesquisa> listaPesquisas = Banco.pesquisas.stream().sorted(Comparator.comparing(Pesquisa::getId)).collect(Collectors.toList());
		Banco.pesquisas = listaPesquisas;
		return Banco.pesquisas;
	}
	
	public Pesquisa procurarPeloId(int id) {
		try {
			Pesquisa pesquisa = getPesquisas()
					.stream()
					.filter( p -> p.getId() == id)
					.collect(Collectors.toList())
					.get(0);
			
			return pesquisa;
		}
		catch(IndexOutOfBoundsException e) {
			return null;
		}
		 
	}
	
	public Pesquisa procurarPeloEmail(String email) {
		try {
			Pesquisa pesquisa = this.getPesquisas()
					.stream()
					.filter( p -> p.getEmail().equals(email))
					.collect(Collectors.toList())
					.get(0); 
			return pesquisa;
		}
		catch(IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void deletar(int id) {
		List<Pesquisa> novaListaPesquisas = Banco.pesquisas.stream().filter(p -> id != p.getId()).collect(Collectors.toList());
		Banco.pesquisas = novaListaPesquisas;
	}

}
