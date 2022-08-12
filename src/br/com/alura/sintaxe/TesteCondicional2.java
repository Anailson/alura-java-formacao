package br.com.alura.sintaxe;

public class TesteCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado ) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("seja bem vindo!");
		} else {

			System.out.println("infelizmente você não pode entrar!");
		}

	}

}
