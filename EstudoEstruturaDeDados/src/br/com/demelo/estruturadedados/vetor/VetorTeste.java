package br.com.demelo.estruturadedados.vetor;

import br.com.demelo.aluno.Aluno;

public class VetorTeste {

	public static void main(String[] args) {
		new Aluno("Daniel");
		new Aluno("Sussu");
		Aluno a3 = new Aluno("Maya");
		Aluno a4 = new Aluno("Fabio");

		Vetor lista = new Vetor();

		System.out.println(lista.tamanho());

		System.out.println(lista);

		System.out.println(lista.contem(a3));

		lista.adiciona(a3);

		// System.out.println(lista.pega(101));

		lista.adiciona(1, a4);

		lista.remove(1);
		System.out.println(lista);

		for (int i = 0; i < 150; i++) {
			Aluno y = new Aluno("Vanessa " + i);
			lista.adiciona(y);
		}

		System.out.println(lista);
	}
}
