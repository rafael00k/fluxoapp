package Utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.math3.complex.Complex;

import modelo.Linha;
//falta inverter a impedancia das linhas
public class MatrizBarraUtils {
	public static HashMap<Key, Complex> MatrizYBarra(ArrayList<Linha> linhas, int quantidaDeBarras,
			int quantidadeDeLinhas) {
		HashMap<Key, Complex> matrizYbarra = new HashMap<>();

		for (Linha linha : linhas) {
			for (int i = 1; i <= quantidaDeBarras; i++) {

				if (linha.getDe() == i || linha.getPara() == i) {
					if (matrizYbarra.get(new Key(i, i)) != null) {
						matrizYbarra.put(new Key(i, i), matrizYbarra.get(new Key(i, i)).add(linha.getImpedancia()));
					} else {
						matrizYbarra.put(new Key(i, i), linha.getImpedancia());
					}

				} else {
					matrizYbarra.put(new Key(linha.getDe(), linha.getPara()), linha.getImpedancia().negate());
					matrizYbarra.put(new Key(linha.getPara(), linha.getDe()), linha.getImpedancia().negate());

				}

			}

		}
		return matrizYbarra;
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

}
