package basico;

import java.util.Scanner;
import java.util.ArrayList;

class MainClass{
  
  	static Scanner read = new Scanner(System.in);
  	static ArrayList<prod> itens = new ArrayList();

  	public static void main(String[] args) {
    
		prod item; 
		int cont = 0; //Controle 
		
		while(cont == 0){
		
		item = new prod();//Objeto null
		
		//Coleta de dados
		System.out.println("Digite o código do ítem:");
		item.cod = read.nextInt();
		
		System.out.println("Digite o nome do ítem:");
		item.nome = read.next();
		
		System.out.println("Digite a data de Aquisição:");
		item.data = read.next();
		
		System.out.println("Digite o preço do ítem:");
		item.preco = read.nextFloat();

		//Adicionar produtos
		itens.add(item);

		System.out.println("Continuar adicionando ítens? digite 0 para sim ou qualquer outro número inteiro para não.");
		cont = read.nextInt();
		}

		//Exibição
		System.out.println("Id\tName\tData de Aquisição\tPrice");
		for(int i = 0; i < itens.size(); i++){
		System.out.println(itens.get(i).cod +"\t"+ itens.get(i).nome +"\t"+ itens.get(i).data  +"\t"+ itens.get(i).getPriceReais());
		}
	}
}
