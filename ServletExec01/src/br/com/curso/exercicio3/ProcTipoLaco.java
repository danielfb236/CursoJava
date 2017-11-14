package br.com.curso.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class ProcTipoLaco {
	
	public String selecioneLaco(String numInicial, String numFinal, String parTipo ) {
		
		int par1 = Integer.parseInt(numInicial);
		int par2 = Integer.parseInt(numFinal);
		int varTemp = par1;
	
			
		List<Integer> sequencia = new ArrayList<Integer>();
								
			if ((par1 >= 0 && par2 >= 0) && (par1 != par2) && (!(par1 > par2))) {
						
					if (parTipo.equals("for")) {
						for (int i = par1; i <= par2; i++) {	
							sequencia.add(i);	
						}
					}else if (parTipo.equals("while")) {
						while(varTemp <= par2) {
							sequencia.add(varTemp);
							varTemp++;
						}
					}else if (parTipo.equals("dowhile")) {
						do {
							sequencia.add(varTemp);
							varTemp++;
							
						}while(varTemp <= par2);
					} 
			}

			return sequencia.toString();
		
	}

}
