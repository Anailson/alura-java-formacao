package br.com.alura.sintaxe;

public class TesteAliquota {

	public static void main(String[] args) {
		
		/**
		 * De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142
			De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350
			De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636
			faixa salario:
			
		 */
		
		double salario = 3800.0;
		
		if(salario >= 3751.01 || salario >=4664.00) {
			System.out.println("o IR � de 22.5% e pode deduzir R$ 636");
		}else {
			System.out.println("o IR � de 15% e pode deduzir R$ 350");
		}
	}

}
