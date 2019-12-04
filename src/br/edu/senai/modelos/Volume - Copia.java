package br.edu.senai.modelos;

public abstract class Volume extends Quadrilatero {
	
	//Atributo amb1 é estático porque deve ser compartilhado entre os objetos das classes filhas.
	private static Ambiente amb1;
	
	private int posX, posY;

	public Volume() {
		super();
	}
	
	public Volume(int tamanhoX, int tamanhoY, int posX, int posY) {
		super(tamanhoX, tamanhoY);
		this.posX = posX;
		this.posY = posY;
	}

	public static Ambiente getAmb1() {
		return amb1;
	}

	public static void setAmb1(Ambiente amb1) {
		Volume.amb1 = amb1;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
