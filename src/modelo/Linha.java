package modelo;

import org.apache.commons.math3.complex.Complex;

public class Linha {
	private int de;
	private int para;
	private double resistencia;
	private double reatancia;
	

	
	private Complex impedancia;
	
	public Linha (int de, int para, double resistencia,double reatancia) {
		this.de = de;
		this.para = para;
		this.resistencia = resistencia;
		this.reatancia = reatancia;
		this.impedancia = new Complex (resistencia,reatancia);
	}
	public void setImpedancia(Complex impedancia) {
		this.impedancia = impedancia;
	}
	
	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}
	public void setReatancia(float reatancia) {
		this.reatancia = reatancia;
	}
	public int getDe() {
		return de;
	}
	public int getPara() {
		return para;
	}
	public double getResistencia() {
		return resistencia;
	}
	public double getReatancia() {
		return reatancia;
	}
	public Complex getImpedancia() {
		return impedancia;
	}
	
	
	
	
	

}
