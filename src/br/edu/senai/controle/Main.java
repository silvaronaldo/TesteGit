package br.edu.senai.controle;

import java.util.Scanner;

import br.edu.senai.modelos.Ambiente;
import br.edu.senai.modelos.Objeto;
import br.edu.senai.modelos.Pessoa;
import br.edu.senai.modelos.Quadrilatero;
import br.edu.senai.modelos.Volume;

public class Main {

	public static void main(String[] args) {

	Ambiente amb = new Ambiente(15, 20);
	
	//Passando ponteiro de Ambiente para o atributo est�tico de Volume.
	Volume.setAmb1(amb);
	
	Pessoa pessoa1 = new Pessoa(1, 1, 0, 0, "Rodrigo");
	
	
	Objeto mesa = new Objeto(1, 2, 15, 0);
	
	
	pessoa1.deslocar(-10, 0);
	
	System.out.println("O personagem est� na posi��o x: " + 
			pessoa1.getPosX() + ", posi��o y: " + 
			pessoa1.getPosY());
	
	

	}

}
