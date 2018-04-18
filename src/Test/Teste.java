package Test;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.math3.complex.Complex;

import Utils.ComplexUtils;
import Utils.Key;
import Utils.MatrizUtils;
import modelo.Linha;

public class Teste {

	public static void main(String[] args) {
		long tempoInicio = System.currentTimeMillis();
		Complex a = new Complex (32.75,47.2);
		Complex b = new Complex (25.4,32.567);
		Complex c = new Complex (3.5,2.4);
		ComplexUtils utils = new ComplexUtils();
		
		ArrayList<Linha> linhas = new ArrayList<>();
		linhas.add(new Linha(1, 2, 32.75, 47.2));
		linhas.add(new Linha(1, 3, 32.75, 47.2));
		linhas.add(new Linha(2, 3, 32.75, 47.2));
		linhas.add(new Linha(1,2,30.30,27.2));
		System.out.println("Linha a de "+linhas.get(0).getDe()+" para "+linhas.get(0).getPara()+": "+ utils.FormataComplexoAlgebrico(linhas.get(0).getImpedancia())+" Admitancia: "+utils.FormataComplexoAlgebrico(linhas.get(0).getAdmitancia()));
		System.out.println("Linha b de "+linhas.get(1).getDe()+" para "+linhas.get(1).getPara()+": "+ utils.FormataComplexoAlgebrico(linhas.get(1).getImpedancia())+" Admitancia: "+utils.FormataComplexoAlgebrico(linhas.get(1).getAdmitancia()));
		System.out.println("Linha c de "+linhas.get(2).getDe()+" para "+linhas.get(2).getPara()+": "+ utils.FormataComplexoAlgebrico(linhas.get(2).getImpedancia())+" Admitancia: "+utils.FormataComplexoAlgebrico(linhas.get(2).getAdmitancia()));
		System.out.println("Linha d de "+linhas.get(3).getDe()+" para "+linhas.get(3).getPara()+": "+ utils.FormataComplexoAlgebrico(linhas.get(3).getImpedancia())+" Admitancia: "+utils.FormataComplexoAlgebrico(linhas.get(3).getAdmitancia()));
		System.out.println("polar de  Impedancia de a: "+utils.FormataComplexoPolar(linhas.get(0).getImpedancia()));
		System.out.println("polar de  Impedancia de b: "+utils.FormataComplexoPolar(linhas.get(1).getImpedancia()));
		System.out.println("polar de  Impedancia de c: "+utils.FormataComplexoPolar(linhas.get(2).getImpedancia()));
		System.out.println("polar de  Impedancia de d: "+utils.FormataComplexoPolar(linhas.get(3).getImpedancia()));
		System.out.println("a+b "+ utils.FormataComplexoAlgebrico(a.add(b)));
		System.out.println("a-b: "+ utils.FormataComplexoAlgebrico(a.subtract(b)));
		System.out.println("a*b: "+ utils.FormataComplexoAlgebrico(a.multiply(b)));
		
		System.out.println("MatrizBarra");
		HashMap<Key,Complex> matrizTeste = new HashMap<>();
		matrizTeste = MatrizUtils.MatrizYBarra(linhas, 3, linhas.size());
		System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio)); 
		for (Key key : matrizTeste.keySet()) {
			System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizTeste.get(key));
			
		}
		
		 System.out.println("Matriz G");
		 HashMap<Key,Double> matrizGTeste = new HashMap<>();
		 matrizGTeste = MatrizUtils.MatrizCondutancia(matrizTeste);
		 for (Key key : matrizGTeste.keySet() ) {
			 System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizGTeste.get(key));
			 
			
		}
		 System.out.println("Matriz B"); 
		 HashMap<Key,Double> matrizBTeste = new HashMap<>();
		 matrizGTeste = MatrizUtils.MatrizSusceptancia(matrizTeste);
		 for (Key key : matrizGTeste.keySet() ) {
			 System.out.println("Indice: "+key + 
				       "" + 
				       " valor: "+matrizGTeste.get(key));
			 
			
		}
		 
		 
	}

}
