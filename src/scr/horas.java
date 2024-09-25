package scr;

public class horas {
	
	//utilizei  string par poder colocar com maior variedade de caracteres, e adicionar hora e minuto junto ao valor sem ter que chamar no System.out
	public static String conversor(int minutos) {

		int horas = minutos / 60;
		int restminut = minutos % 60; //% indica o resto da divisão
		
		return horas + "Hora(s)" + " e " + restminut + "Minuto(s)";
		
	}
	
	public static void main(String[] args) {
		
		int minutos = 175;
		String result = horas.conversor(minutos); //chamei a classe e o método anterior, referenciando a variavel
		
		System.out.println(result);
	}

}
