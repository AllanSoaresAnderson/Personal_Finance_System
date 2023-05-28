package br.com.PFS;


/**
 * @author Allan_Anderson
 *
 */
public class Application {

	public static void main(String[] args) {
		People Allan = new People ("Allan Soares Anderson");
		Menu menu = new Menu();
		menu.tick(Allan);
	}

}
