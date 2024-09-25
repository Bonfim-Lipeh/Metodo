package scr;

//Classe criada
public class Maiorn {

//meu main
	public static void main(String[] args) {
	
//declaração das variaveis com valores
		int num1 = 3;
		int num2 = 7;
		int num3 = 9;
//criação da classe maior, começando como referencia inicial		
		int maior = num1;

//conforme os números forem maiores ou não a variavel maior vai mudando de acordo com o maior número
		if (num2 > maior) {
			maior = num2;
		}
		
		if (num3 > maior) {
			maior = num3;
		}

//imprimindo o maior numero
		
		System.out.println("O maior número é: " + maior);
	}

}
