package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Exposicao;
import model.Obra;

public class GestaoObra {

	Scanner read = new Scanner(System.in);
	
	public void addO(ArrayList<Exposicao> e){
		
		if(e.size() > 0){
			
			System.out.printf("Insira o nome do autor da obra: ");
			String nome = read.nextLine();
			
			System.out.printf("Insira o titulo da obra: ");
			String tit = read.nextLine();
			
			System.out.printf("Insira a categoria da obra: ");
			String cat = read.nextLine();
			
			System.out.printf("Insira o tipo da obra: ");
			String tipo = read.nextLine();
			
			System.out.printf("Insira a data de criação da obra: ");
			String data = read.nextLine();
			
			System.out.println();
			
			new GestaoExpo().listEx(e, false);
			System.out.printf("\nInsira o id da exposicao que deseja expor a obra: ");
			int id = read.nextInt();
			
			id--;
			
			e.get(id).getObras().add(new Obra(nome,tit,cat,tipo,data));
		
		}
		else{
			System.out.println("\nInsira exposições primeiro!");
		}
	}
}
