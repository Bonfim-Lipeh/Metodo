package scr;

//Criação da classe número.

public class Numero {

//Criação do meu método para definir positivo e negativo.
	
	public static void metod (int num) {
		
		if (num >= 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
	}

//Ao tentar inserir meu main em outro arquivo, não estava rodando, optei pelo mais simples e deixei aqui mesmo.
	public static void main(String[] args) {
		
			//chamei a variável | insira o valor aqui
			int num = 0; 
			
			//Execução do método.
			metod(num);		
		
	}

}
