package Utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.math3.complex.Complex;

import modelo.Linha;

public class MatrizBarraUtils {
	public static HashMap<Key,Complex> MatrizYBarra (ArrayList<Linha> linhas,int quantidaDeBarras,int quantidadeDeLinhas){
		HashMap<Key,Complex> matrizYbarra = new HashMap<>();
		
		for (Linha linha : linhas) {
			 for (int i=1;i<= quantidaDeBarras;i++) {
				 Key key = new Key (i,i);
				 if (matrizYbarra.get(key). = null) {
					 
				 }
				 
				 if (linha.getDe()==i || linha.getPara()==i) {
					  aux = matrizYbarra.get(new Key(i,i)).add(linha.getImpedancia());
					  
				 }else {
					 
				 }
				 
			 }
			
		}
	}	

}
