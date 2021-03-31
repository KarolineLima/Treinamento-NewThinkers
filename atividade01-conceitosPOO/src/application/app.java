package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Cozinha;
import model.EnumFuncionario;
import model.Funcionario;
import model.Ingrediente;

public class app {

	public static void main(String[] args) {
	
		
		System.out.println("\n --------------- Iniciando o restaurante ---------------");
		
		
		//Ingredientes
		
		Ingrediente feijao =  new Ingrediente("Feijão",LocalDate.of(2021, 12, 31));
		Ingrediente farinha = new Ingrediente("Farinha",LocalDate.of(2021, 12, 31));
		Ingrediente arroz = new Ingrediente("Arroz",LocalDate.of(2021, 12, 31));
		Ingrediente carneDePorco = new Ingrediente("Carne de Porco",LocalDate.of(2021, 12, 31)); 
		Ingrediente linguica = new Ingrediente("Linguiça",LocalDate.of(2021, 12, 31)); 
		
		Ingrediente champignon =  new Ingrediente("Champignon",LocalDate.of(2021, 12, 31));
		Ingrediente brocolis = new Ingrediente("Brócolis",LocalDate.of(2021, 12, 31));
		Ingrediente macarrao = new Ingrediente("Macarrão",LocalDate.of(2021, 12, 31));
		Ingrediente carne = new Ingrediente("Carne",LocalDate.of(2021, 12, 31));
		
		Ingrediente molho = new Ingrediente("Brócolis",LocalDate.of(2021, 12, 31));

		
		//Funcionários
		Funcionario cozinheiroMineiro = new Funcionario("Thaís", EnumFuncionario.Cozinheira);
		Funcionario cozinheiroChines = new Funcionario("Lien Hu", EnumFuncionario.Cozinheira);
		Funcionario cozinheiroItaliano = new Funcionario("Marilena Dellucci", EnumFuncionario.Cozinheira);
		Funcionario ajudante1 = new Funcionario("Mariana", EnumFuncionario.Ajudante);
		Funcionario ajudante2 = new Funcionario("Laura", EnumFuncionario.Ajudante);
		Funcionario ajudante3 = new Funcionario("Julia", EnumFuncionario.Ajudante);
		Funcionario ajudante4 = new Funcionario("Sun T'ien", EnumFuncionario.Ajudante);
		Funcionario ajudante5 = new Funcionario("Lian Sung", EnumFuncionario.Ajudante);
		Funcionario ajudante6 = new Funcionario("Stella Dellucci", EnumFuncionario.Ajudante);
		
		
		//Cozinha Mineira
		
		System.out.println("\n ------ Iniciando Cozinha Mineira ------");
		List<Funcionario> funcionariosMineiros = Arrays.asList(cozinheiroMineiro, ajudante1, ajudante2, ajudante3);
		List<Ingrediente> ingredientesMineiros = Arrays.asList(feijao, farinha, arroz, carneDePorco, linguica);
		Cozinha cozinhaMineira = new Cozinha("Mineira",10,4,30,LocalTime.of(14,00), LocalTime.of(20,00),"Feijoada", ingredientesMineiros,funcionariosMineiros);
		
		
		
		//Cozinha
		System.out.println("\n ------ Iniciando Cozinha Chinesa ------");
		List<Funcionario> funcionariosChineses = Arrays.asList(cozinheiroChines, ajudante4, ajudante5);
		List<Ingrediente> ingredientesChineses = Arrays.asList(champignon, brocolis, macarrao , carne);
		Cozinha cozinhaChinesa = new Cozinha("Chinesa",8, 3,30,LocalTime.of(10,00), LocalTime.of(21,00),"Yakissoba",ingredientesChineses,funcionariosChineses);
		
		
		
		//Cozinha Italiana
		System.out.println("\n ------ Iniciando Cozinha Italiana ------");
		List<Funcionario> funcionariosItalianos = Arrays.asList(cozinheiroItaliano, ajudante6);
		List<Ingrediente> ingredientesItalianos = Arrays.asList(molho, macarrao , carne);
		Cozinha cozinhaItaliana = new Cozinha("Italiana",5, 2,30,LocalTime.of(13,00), LocalTime.of(22,00),"Espaguete",ingredientesItalianos,funcionariosItalianos);

		
		System.out.println("\n --------------- Pedidos Abertos ---------------");
		
		
		escolha();
		
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		
		
		while(opcao != 4) {
			
			switch(opcao) {
			
				case 1:
					
					System.out.println(cozinhaMineira);
					selecao();
					int escolha = entrada.nextInt();
					if(escolha == 1) {
						cozinhaMineira.prepararPratos();
						cozinhaMineira.lavarLouca();	
					}
					break;
					
				case 2:
					
					System.out.println(cozinhaChinesa);
					selecao();
					escolha = entrada.nextInt();
					if(escolha == 1) {
						cozinhaChinesa.prepararPratos();
						cozinhaChinesa.lavarLouca();
					}
					break;
					
				case 3:
					
					System.out.println(cozinhaItaliana);
					escolha = entrada.nextInt();
					if(escolha == 1) {
						cozinhaItaliana.prepararPratos();
						cozinhaItaliana.lavarLouca();
					}
					break;
			}
		
			escolha();
			opcao = entrada.nextInt();
		}
		
		
		entrada.close();
		System.out.println("\n --------------- Finalizando o restaurante ---------------");
		
	}
	
	public static void escolha() {
		System.out.println("\n ----> Escolha: ");
		System.out.println("\n 1-Cozinha Mineira");
		System.out.println("\n 2-Cozinha Chinesa");
		System.out.println("\n 3-Cozinha Italiana");
		System.out.println("\n 4-Finalizar");			
		System.out.println("\n Informe a opção desejada: ");
	}

	public static void selecao() {
		System.out.println("\n ----> Deseja continuar nessa cozinha?");
		System.out.println("\n 1- Sim");
		System.out.println("\n 2- Não");
		System.out.println("\n Informe a opção desejada: ");
	}
	
}

