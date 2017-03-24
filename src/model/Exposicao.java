package model;

import java.util.ArrayList;

public class Exposicao {
	
	private String nome, dataI, dataF;
	private int qt;
	private float preco;
	private ArrayList<Obra> obras = new ArrayList<Obra>();
	
	public Exposicao(String nome, String dataI, String dataF, float preco) {
		this.nome = nome;
		this.dataI = dataI;
		this.dataF = dataF;
		this.qt = 0;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataI() {
		return dataI;
	}

	public void setDataI(String dataI) {
		this.dataI = dataI;
	}

	public String getDataF() {
		return dataF;
	}

	public void setDataF(String dataF) {
		this.dataF = dataF;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	
	public String toString(){
		return "\nNome Exposição: " + getNome() 
			+ "\nDuração: " + getDataI() + " - " + getDataF() 
			+ "\nQuantidade pessoas: " + getQt() 
			+ "\nPreço por bilhete: " + getPreco() +"\n";
	}
	
}
