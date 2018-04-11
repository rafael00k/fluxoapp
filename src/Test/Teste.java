package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.math3.complex.Complex;

import Utils.ComplexUtils;
import Utils.Key;
import Utils.MatrizBarraUtils;
import modelo.Linha;
import java.util.Map;

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
		System.out.println("MatrizBarra");
		HashMap<Key,Complex> matrizTeste = new HashMap<>();
		matrizTeste = MatrizBarraUtils.MatrizYBarra(linhas, 3, 3);
		for (Key key : matrizTeste.keySet()) {
			System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizTeste.get(key));
			
		}
		
		 System.out.println("Matriz G");
		 HashMap<Key,Double> matrizGTeste = new HashMap<>();
		 matrizGTeste = MatrizBarraUtils.MatrizCondutancia(matrizTeste);
		 for (Key key : matrizGTeste.keySet() ) {
			 System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizGTeste.get(key));
			 
			
		}
		 System.out.println("Matriz B"); 
		 HashMap<Key,Double> matrizBTeste = new HashMap<>();
		 matrizGTeste = MatrizBarraUtils.MatrizSusceptancia(matrizTeste);
		 for (Key key : matrizGTeste.keySet() ) {
			 System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizGTeste.get(key));
			 
			
		}
	}

}
