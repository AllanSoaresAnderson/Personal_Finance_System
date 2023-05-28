package br.com.PFS;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);

	private int action = 1;
	
	
	public void tick(People people) {
		do {
			menuOptions(menuMessages(),people);
		} while (getAction() != 0);
		
	}
	
	
	public int menuMessages() {
		System.out.println("O que você gostaria de fazer?\n"
				+ "1 - Adicionar uma nova despesa?\n"
				+ "2 - Verificar sua lista de despesas?\n"
				+ "0 - sair");
		return this.scanner.nextInt();
	}
	
	
	
	public void menuOptions(int action, People people) {
		switch (action) {
		case 1:
			System.out.println("Digite o nome da despesa:");
			String name = scanner.next();
			scanner.nextLine();
			System.out.println("Digite o valor da despesa:");
			double value = scanner.nextDouble();
			System.out.println(name);
			people.addexpenses(new Costs(name, value));
			System.out.println("Curso adicionado com sucesso!!!");
			break;
		case 2:
			System.out.println("--------------------------Sua lista----------------------------------\n"
					+ people.printExpenses() + "\n"
					+ "*****************************************\n"
					+ "*****************************************\n"
					+ "*****************MENU*********************\n"
					+ "*****************************************\n"
					+ "*****************************************\n");
			break;
		case 0:
			System.out.println("Finalizando aplicacao");
			this.setAction(0);
			break;
		default:
			scanner.close();
			System.out.println("Valor nao correspondente as opcoes");
		}
		
	}
	
	// Getters and Setters

	public int getAction() {
		return action;
	}


	public void setAction(int action) {
		this.action = action;
	}



	
	
}
