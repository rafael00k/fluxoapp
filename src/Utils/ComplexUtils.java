package Utils;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

public class ComplexUtils {
	public ComplexUtils () {
		
	}
	public String FormataComplexoAlgebrico (Complex complex) {
		String formatado = new ComplexFormat().format(complex);
		return formatado;
		
		
	}
	public String FormataComplexoPolar (Complex complex) {
		double arg = complex.getArgument();
		double abs = complex.abs();
		
		
		return abs+" <"+arg;
	}
	
	
	

}
