package aplicacao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programa {
	/*
	 * Em um portal de cursos online, cada usuário possui um código único, 
	 * representado por um número inteiro.
	 * Cada instrutor do portal pode ter vários cursos, 
	 * sendo que um mesmo aluno pode se matricular em quantos cursos quiser. 
	 * Assim, o número total de alunos de um instrutor não é 
	 * simplesmente a soma dos alunos de todos os cursos que ele possui, 
	 * pois pode haver alunos repetidos em mais de um curso.
	 * O instrutor Alex possui três cursos A, B e C, 
	 * e deseja saber seu número total de alunos.
	 * Seu programa deve ler os alunos dos cursos A, B e C 
	 * do instrutor Alex, depois mostrar a quantidade total e 
	 * alunos dele, conforme exemplo.
	 */

	public static void main(String[] args) {
		Set<Integer> cuA = new HashSet<>(Arrays.asList(21,35,22));
		Set<Integer> cuB = new HashSet<>(Arrays.asList(21,50));
		Set<Integer> cuC = new HashSet<>(Arrays.asList(42,35,13));
		
		//Criado um set total que recebe a cópia de cuA (curso a) 
		Set<Integer> total = new HashSet<>(cuA);
		//addAll que é a união do atual com o que recebe, assim unindo cuB e cuC 
		//descartando os códigos repetidos
		total.addAll(cuB);
		total.addAll(cuC);
		
		System.out.println("Total de alunos: "+total.size());

	}

}
