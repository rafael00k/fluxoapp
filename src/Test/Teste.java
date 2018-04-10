package Test;

import java.util.ArrayList;

import org.apache.commons.math3.complex.Complex;

import Utils.ComplexUtils;
import Utils.MatrizBarraUtils;
import modelo.Linha;

public class Teste {

	public static void main(String[] args) {
		Complex a = new Complex (32.75,47.2);
		Complex b = new Complex (25.4,32.567);
		Complex c = new Complex (3.5,2.4);
		ComplexUtils utils = new ComplexUtils();
		System.out.println("Complexo a "+ utils.FormataComplexoAlgebrico(a));
		System.out.println("Complexo b "+ utils.FormataComplexoAlgebrico(b));
		System.out.println("polar de a "+utils.FormataComplexoPolar(a));
		System.out.println("polar de b "+utils.FormataComplexoPolar(b));
		System.out.println("a+b "+ utils.FormataComplexoAlgebrico(a.add(b)));
		System.out.println("a-b: "+ utils.FormataComplexoAlgebrico(a.subtract(b)));
		System.out.println("a*b: "+ utils.FormataComplexoAlgebrico(a.multiply(b)));
		ArrayList<Linha> linhas = new ArrayList<>();
		linhas.add(new Linha(1, 2, 32.75, 47.2));
		linhas.add(new Linha(1, 3, 32.75, 47.2));
		linhas.add(new Linha(2, 3, 32.75, 47.2));
		Complex[][] matrizbarra = new MatrizBarraUtils().matrizBarra(linhas, 3, 3);
		for (int i=1;i<matrizbarra.length;i++) {
			for (int j=1;j<matrizbarra[0].length;j++) {
				System.out.println("Y "+i+j+" "+utils.FormataComplexoAlgebrico(matrizbarra[i][j]));
			}
		}
	}

}
