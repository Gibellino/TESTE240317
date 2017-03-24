package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Exposicao;

public class GestaoExpo {

	Scanner read = new Scanner(System.in);
	
	public void addEx(ArrayList<Exposicao> e){
		
		System.out.printf("Insira o nome da exposição: ");
		String nome = read.nextLine();
		
		System.out.printf("Insira a data de inicio da exposição: ");
		String dataI = read.nextLine();
		
		System.out.printf("Insira a data de fim da exposição: ");
		String dataF = read.nextLine();
		
		System.out.printf("Insira o preço dos bilhetes da exposição: ");
		float preco = read.nextFloat();
		
		e.add(new Exposicao(nome,dataI,dataF,preco));
	}
	
	public void listEx(ArrayList<Exposicao> e, boolean ti){
		
		if(e.size() > 0){
			int i=0;
			
			if(ti == true){	
				for(Exposicao expo : e){
					System.out.println(expo.toString());
					for(int j=0; j< e.get(i).getObras().size(); j++){
						System.out.println(" Obra " + (j+1) + ":\n"
								+ "  Nome autor: " + e.get(i).getObras().get(j).getNome() 
								+ "\n  Titulo obra: " + e.get(i).getObras().get(j).getTitulo()
								+ "\n  Categoria obra: " + e.get(i).getObras().get(j).getCategoria()
								+ "\n  Tipo obra: " + e.get(i).getObras().get(j).getTipo()
								+ "\n  Data obra: " + e.get(i).getObras().get(j).getData());
						System.out.println();
					}
					i++;
					System.out.println();
				}
			}
			else{
				for(Exposicao expo : e){
					System.out.println(" " + (i+1) + " - " + expo.getNome());
					i++;
				}
			}
		}
		else{
			System.out.println("\nInsira exposições primeiro!");
		}
	}
	
	public void torniquete(ArrayList<Exposicao> e){
		
		if(e.size() > 0){
			System.out.println();
			
			listEx(e, false);
			
			System.out.printf("\nInsira o id da exposição que deseja adicionar pessoas: ");
			int id = read.nextInt();
				
			System.out.printf("Insira a quantidade de pessoas que deseja adicionar: ");
			int qt = read.nextInt();
				
			id--;
				
			e.get(id).setQt(e.get(id).getQt() + qt);
		}
		else{
			System.out.println("\nInsira exposições primeiro!");
		}
	}
	
	public void countPrice(ArrayList<Exposicao> e){
		
		if(e.size() > 0){
			int i=0, price=0;
			Exposicao ex = null;
			
			for(Exposicao expo : e){
				if(expo.getQt() > 0){
					System.out.println(" " + (i+1) + " - " + expo.getNome() + " teve " + expo.getQt() + " pessoas e o preço era de " + expo.getPreco() 
						+ " €. Total " + (expo.getQt()*expo.getPreco()) + " €");
					
					if((expo.getQt()*expo.getPreco()) > price){
						ex = expo;
						price = (int)(expo.getQt()*expo.getPreco());
					}
					
					i++;
				}
			}
			
			System.out.println("\nA exposição que lucrou mais foi " + ex.getNome() + " com " + (ex.getQt()*ex.getPreco()) + " €\n");
		}
		else{
			System.out.println("\nInsira exposições primeiro!");
		}
	}
}
