package com.curso.java.aula33exercicio;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	  
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencial() {
		return potencia;
	}
	public void setPotencia (int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoluz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses () {
		return garantiaMeses;
	}
	public void setGarantiaMeses (int garantiaMeses) {
		this.garantiaMeses=garantiaMeses;
	}
	public String[]getTipos(){
		return tipos;
	}
	public void setTipos (String[] tipos) {
		this.tipos= tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigado() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	
	
	
	
}
