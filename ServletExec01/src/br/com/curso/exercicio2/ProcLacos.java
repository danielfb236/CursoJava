package br.com.curso.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ProcLacos {

	public String imprimeSequencia(String numInicial, String mumFinal) {

		int par1 = Integer.parseInt(numInicial);
		int par2 = Integer.parseInt(mumFinal);

		List<Integer> sequencia = new ArrayList<Integer>();

		if (par1 >= 0 || par2 >= 0) {
			if (par1 != par2) {
				if (!(par1 > par2)) {

					for (int i = par1; i <= par2; i++) {

						sequencia.add(i);
					}

				} // par1 nao pode ser maior que par2
			} // diferente
		} // negativo

		return sequencia.toString();
	}
}
