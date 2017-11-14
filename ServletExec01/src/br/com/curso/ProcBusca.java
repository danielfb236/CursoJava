package br.com.curso;

public class ProcBusca {


	
	public String verificaMaior(String num1, String num2) {
		
		String total = null;
		
		if ((Integer.parseInt(num1)) > (Integer.parseInt(num2))) {
			total = "Numero " + num1 + " é maior que o numero " + num2;
		}else if ((Integer.parseInt(num1)) < (Integer.parseInt(num2))) {
			total = "Numero " + num1 + " e menor que o numero " + num2;
		}else if ((Integer.parseInt(num1)) == (Integer.parseInt(num2))) {
			total = "Numero " + num1 + " e igual a " + num2;
		}
	return total.toString();
	}
	
	
}
