package Utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.math3.complex.Complex;

import modelo.Linha;

public class MatrizUtils {
	public static HashMap<Key, Complex> MatrizYBarra(ArrayList<Linha> linhas, int quantidaDeBarras,
			int quantidadeDeLinhas) {
		HashMap<Key, Complex> matrizYbarra = new HashMap<>();

		for (Linha linha : linhas) {
			for (int i = 1; i <= quantidaDeBarras; i++) {

				if (linha.getDe() == i || linha.getPara() == i) {
					if (matrizYbarra.get(new Key(i, i)) != null) {
						matrizYbarra.put(new Key(i, i), matrizYbarra.get(new Key(i, i)).add(linha.getAdmitancia()));
					} else {
						matrizYbarra.put(new Key(i, i), linha.getAdmitancia());
					}

				} else {
					if (matrizYbarra.get(new Key(linha.getDe(), linha.getPara())) != null) {
						matrizYbarra.get(new Key(linha.getDe(), linha.getPara())).add(linha.getAdmitancia().negate());
						matrizYbarra.get(new Key(linha.getPara(), linha.getDe())).add(linha.getAdmitancia().negate());
					}
					matrizYbarra.put(new Key(linha.getDe(), linha.getPara()), linha.getAdmitancia().negate());
					matrizYbarra.put(new Key(linha.getPara(), linha.getDe()), linha.getAdmitancia().negate());

				}

			}

		}
		return matrizYbarra;
	}
	
	public static HashMap<Key, Complex> MatrizZBarra(ArrayList<Linha> linhas, int quantidaDeBarras,
			int quantidadeDeLinhas) {
		HashMap<Key, Complex> matrizZbarra = new HashMap<>();

		for (Linha linha : linhas) {
			for (int i = 1; i <= quantidaDeBarras; i++) {

				if (linha.getDe() == i || linha.getPara() == i) {
					if (matrizZbarra.get(new Key(i, i)) != null) {
						matrizZbarra.put(new Key(i, i), matrizZbarra.get(new Key(i, i)).add(linha.getImpedancia()));
					} else {
						matrizZbarra.put(new Key(i, i), linha.getImpedancia());
					}

				} else {
					if (matrizZbarra.get(new Key(linha.getDe(), linha.getPara())) != null) {
						matrizZbarra.get(new Key(linha.getDe(), linha.getPara())).add(linha.getAdmitancia().pow(-1));
						matrizZbarra.get(new Key(linha.getPara(), linha.getDe())).add(linha.getAdmitancia().pow(-1));
					}
					matrizZbarra.put(new Key(linha.getDe(), linha.getPara()), linha.getImpedancia());
					matrizZbarra.put(new Key(linha.getPara(), linha.getDe()), linha.getImpedancia());

				}

			}

		}
		return matrizZbarra;
	}

	public static HashMap<Key, Double> MatrizCondutancia(HashMap<Key, Complex> matrizYBarra) {
		HashMap<Key, Double> matrizCondutancia = new HashMap<>();
		for (Key key : matrizYBarra.keySet()) {
			matrizCondutancia.put(key, matrizYBarra.get(key).getReal());

		}
		return matrizCondutancia;

	}

	public static HashMap<Key, Double> MatrizSusceptancia(HashMap<Key, Complex> matrizYBarra) {
		HashMap<Key, Double> matrizSusceptancia = new HashMap<>();
		for (Key key : matrizYBarra.keySet()) {
			matrizSusceptancia.put(key, matrizYBarra.get(key).getImaginary());

		}
		return matrizSusceptancia;
	}
	
	public static  HashMap<Key, Double> MultiplicaMatrizReal(HashMap<Key, Double> A, HashMap<Key, Double> B,int limite){
		
		
		
	return  new HashMap<Key, Double>(); 	
	}

}
