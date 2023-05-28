package br.com.PFS;



/**
 * @author Allan_Anderson
 *
 */
public class Application {

	public static void main(String[] args) {
		
		
		//Instanciação de uma pessoa para gerenciamento de despesas
		
		People Allan = new People ("Allan Soares Anderson");
		
		
		// Custos
		
			
		Allan.addexpenses(new Costs ("Faculdade", 230));
		Allan.addexpenses(new Costs ("Academia", 110));
		Allan.addexpenses(new Costs ("Carro", 600));
		
		
		// Imprimir a lista de despesas
		
		System.out.println(Allan);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
