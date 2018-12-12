package bastoros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class bastoros {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		// aldagaiak
		jokalaria jokalariHau;
		int idHau, rolHau;
		String izenHau;
		// ##

		ArrayList<jokalaria> lista = new ArrayList<>();
		sortuPartida(lista);

		Iterator<jokalaria> it = lista.iterator();
		while (it.hasNext()) {
			jokalariHau = it.next();
			idHau = jokalariHau.getId();
			rolHau = jokalariHau.getRol();
			izenHau = jokalariHau.getIzena();

			System.out.println(idHau + izenHau + rolHau);
		}
		
		System.out.println("Bozketa txanda!");
		Iterator<jokalaria> bozkaketa = lista.iterator();
		while (bozkaketa.hasNext()) {
			jokalariHau = bozkaketa.next();
			idHau = jokalariHau.getId();
			rolHau = jokalariHau.getRol();
			izenHau = jokalariHau.getIzena();

			System.out.println(idHau + " - " + izenHau + " (r)en botoa: ");
			int bozka = teclado.nextInt();
			
		}

		teclado.close();

	}

	
	//METODOAK
	public static void sortuPartida(ArrayList<jokalaria> lista) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		System.out.println("Jokalari kopurua: ");
		int jokalariKopurua = teclado.nextInt();
		System.out.println("Urre kopurua: ");
		int urreKopurua = teclado.nextInt();
		for (int i = -1; i < jokalariKopurua; i++) {
			System.out.println(i + 1 + ". jokalariaren izena: ");
			String izena = teclado.nextLine();

			lista.add(new jokalaria(i, izena, 0));

		}
		// URREAK ASIGNATU
		int rolBatura = 0;
		while (rolBatura < urreKopurua) {
			int urrea = (int) (Math.random() * jokalariKopurua);
			if (urrea != 0) {
				lista.get(urrea).setRol();

				rolBatura = 0;
				for (int i = 1; i < jokalariKopurua; i++) {
					int rolHau = lista.get(i).getRol();
					rolBatura = rolBatura + rolHau;
				}
			}
		}
		// #

		teclado.close();
	}

}
