package br.com.alura.sintaxe;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Voc? tem mais de 18 anos!");
			System.out.println("seja bem vindo!");
		} else {

			System.out.println("infelizmente voc? n?o pode entrar!");
		}

	}

}
