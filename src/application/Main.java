package application;

import java.util.ArrayList;
import java.util.Scanner;

import model.Exposicao;
import controller.GestaoExpo;
import controller.GestaoObra;

public class Main {

	static Scanner read = new Scanner(System.in);
	static ArrayList<Exposicao> e = new ArrayList<Exposicao>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		
		do{
			
			System.out.println("\tMenu:");
			System.out.println(" 1- Inserir;\n"
					+ " 2- Listar;\n"
					+ " 3- Add Pessoas;\n"
					+ " 4- Lucros;\n"
					+ " 0- Sair;\n");
			System.out.printf("Insira a opção que deseja: ");
			
			try{
			op = read.nextInt();
			}
			catch(Exception ex){
				op = 10;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: menuI(); break;
			case 2: new GestaoExpo().listEx(e, true); break;
			case 3: new GestaoExpo().torniquete(e); break;
			case 4: new GestaoExpo().countPrice(e); break;
			case 0: System.out.println("\nVai Sair!"); break;
			
			default: System.out.println("\nOpção Inválida!");
			}
			
			System.out.println();
			
		}while(op != 0);
	}

	public static void menuI(){
	
		int op=0;
		
		do{
			
			System.out.println("\tMenu:");
			System.out.println(" 1- Inserir Exposição;\n"
					+ " 2- Inserir Obra;\n"
					+ " 0- Sair;\n");
			System.out.printf("Insira a opção desejada: ");
			
			try{
				op = read.nextInt();
			}
			catch(Exception ex){
				op = 10;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: new GestaoExpo().addEx(e); break;
			case 2: new GestaoObra().addO(e); break;
			case 0: System.out.println("\nVai Sair!"); break;
			
			default: System.out.println("\nOpção Inválida!"); 
			
			}
			
			System.out.println();
			
		}while(op != 0);
	}
}
