package alkewallet;

import java.util.Scanner;

import clases.Cliente;
import clases.CuentaBancaria;
import clases.Efectivo;
import clases.FormaPago;
import clases.Menu;
import clases.Paypal;
import clases.TarjetaCredito;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcmenu = 0;
		CuentaBancaria cuenta = null;
		Cliente cliente = null;
		do {
			opcmenu = Menu.menu(opcmenu);
			switch (opcmenu) {
			case 1:
				cliente = Cliente.crearCliente();
				// Visualizacion de información llamando al metodo verCuenta
				cliente.getCuenta().verCuenta(cliente.getId());
				break;
			case 2:
				if (cliente.getCuenta() != null) {
					System.out.println("Ingrese Monto a depositar: ");
					double saldoini = cliente.getCuenta().getSaldo();
					cliente.getCuenta().ingresarDinero(sc.nextInt());
					sc.nextLine();
					System.out.println("Saldo Inicial $: " + saldoini + ", Saldo Final $: " + cliente.getCuenta().getSaldo());
					System.out.println("Presione ENTER para continuar");
					sc.nextLine();
				} else {
					System.out.println("No hay una cuenta creada. Seleccione la opción 1 para crear una cuenta.");
				}
				break;
			case 3:
				if (cliente.getCuenta() != null) {
					System.out.println("Ingrese Monto a retirar: ");
					double saldoini = cliente.getCuenta().getSaldo();
					cliente.getCuenta().retirarDinero(sc.nextInt());
					sc.nextLine();
					System.out.println("Saldo Inicial $: " + saldoini + ", Saldo Final $: " + cliente.getCuenta().getSaldo());
					System.out.println("Presione ENTER para continuar");
					sc.nextLine();
				} else {
					System.out.println("No hay una cuenta creada. Seleccione la opción 1 para crear una cuenta.");
				}
				break;
			case 4:
				if (cliente.getCuenta() != null) {
					cliente.getCuenta().verCuenta(cliente.getId());
				} else {
					System.out.println("No hay una cuenta creada. Seleccione la opción 1 para crear una cuenta.");
				}
				break;
			case 5:
				FormaPago pago;
				pago = new TarjetaCredito();
				pago.procesarPago();
				pago = new Efectivo();
				pago.procesarPago();
				pago = new Paypal();
				pago.procesarPago();
				break;
			default:

				System.out.println("Opcion no implementada");
				System.out.println("Presione ENTER para continuar");
				sc.nextLine();
				break;
			}

		} while (opcmenu != 6);
		System.out.println("---- ADIOS -----");

		sc.close();
	}

}
