package clases;

import java.util.Scanner;

public class Menu {
	public static int menu(int opc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a AlkeBanko.");
		System.out.println("=======================");		
		System.out.println("Ingrese opción: ");
		System.out.println("1.- Crear cuenta.");
		System.out.println("2.- Hacer un depósito.");
		System.out.println("3.- Hacer un retiro.");
		System.out.println("4.- Consulta cuenta.");
		System.out.println("6.- Salir.");
		return opc = sc.nextInt();
	}
}
