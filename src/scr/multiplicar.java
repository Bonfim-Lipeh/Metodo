package scr;

//cria classe
public class multiplicar {
	
//introduz multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

// cria minha classe principal
    


    	public static void main(String[] args) {
    		
   // para inserir o resultado eu chamei a classe anterior e o método dela declarando os valores a serem atribuidos "a" e "b" 		
    		
    		int resultado = multiplicar.multiplicar(5, 3);
    		
    		
    		System.out.println("O resultado da multiplicação é: " + resultado);
    }
}
