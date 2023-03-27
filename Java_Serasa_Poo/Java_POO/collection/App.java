package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import collection.entidades.Aluno;

public class App {
	public static void main(String[] args) {
		
	List<Aluno> alunos = new ArrayList<>();
	
	Aluno aluno1 = new Aluno("Gabriel", "Matemática", 5);
	Aluno aluno2 = new Aluno("Laura", "Quimíca", 10);
	Aluno aluno3 = new Aluno("Fabricio", "Física", 4);
	Aluno aluno4 = new Aluno("Natalie", "Geografia", 11);
	
	//Add Elementos de um a um / metodo mais comum
	alunos.add(aluno1);
	alunos.add(aluno2);
	alunos.add(aluno3);
	alunos.add(aluno4);
	
	//Add elementos em grupo
	//alunos.addAll(Arrays.asList(aluno1,aluno2,aluno3,aluno4));
	
	//pegar um elemento especifico da lista
	//System.out.println("Aluno: " + alunos.get(0));
	
	//imprimir lista
	//System.out.println(alunos);
	
	//Remove elemento
	//alunos.remove(3);
	
	//Verifica o tamanho da lista
	//System.out.println("Tamanho da lista = " + alunos.size());
	
	//Verifica se tem o objeto na lista
	//System.out.println("Contém = " + alunos.contains(aluno3));
	
	//imprimir determinados valores da lista / no caso os nomes
	//for (Aluno aluno : alunos) {
		//System.out.println(aluno.getNome());
	//}
	
	//Faz a mesma coisa// geralmente utilizar essa estrutura
	//alunos.forEach( aluno -> System.out.println(aluno.getNome()));
	
	//Verifica se a lista ta vazia
	//alunos.isEmpty();
	
	//Exemplo: se a lista não estiver vazia, imprima os nomes
	if (!alunos.isEmpty()) {
		alunos.forEach( aluno -> System.out.println(aluno.getNome()));
	}

	}
}
