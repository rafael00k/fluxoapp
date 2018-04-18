package modelo;

import org.apache.commons.math3.complex.Complex;

public class Linha {
	private int de;
	private int para;
	private double resistencia;
	private double reatancia;	
	private Complex impedancia;
	private Complex admitancia;
	
	public Linha (int de, int para, double resistencia,double reatancia) {
		this.de = de;
		this.para = para;
		this.resistencia = resistencia;
		this.reatancia = reatancia;
		this.impedancia = new Complex (resistencia,reatancia);
		this.admitancia = this.impedancia.pow(-1);
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
	public Complex getAdmitancia() {
		return admitancia;
	}
	public void setAdmitancia(Complex admitancia) {
		this.admitancia = admitancia;
	}
	public void setDe(int de) {
		this.de = de;
	}
	public void setPara(int para) {
		this.para = para;
	}
	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}
	public void setReatancia(double reatancia) {
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
