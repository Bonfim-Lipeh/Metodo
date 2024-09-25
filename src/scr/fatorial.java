package scr;

public class fatorial {
	
	public static int fatore(int n) {
		
		if (n==0) {
			return 1; // o número fatorial de 0 é 1 || começa para garantir a fatoração caso o usuário coloque 0
		}
		else {
			return n * fatore(n-1); //recursão, n é inserido e é subtraido e multiplicado n pelo numero subtraido
		}
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		int result = fatorial.fatore(n); //chama a classe e o método anterior
		
		System.out.println("O fatorial de " + n + " é " + result);
	}

}
