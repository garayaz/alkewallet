package clases;

import java.util.Scanner;

/**
 * Se define clase CuentaBancaria con sus atributos y métodos <br>
 * para crear objetos en la clase Main.
 * 
 * @author Gonzalo Araya
 */
public class CuentaBancaria {
	private int numerocta;
	private double saldo;
	private String titular;

	/**
	 * Constructor sin datos
	 */
	public CuentaBancaria() {
	}

	/**
	 * Constructor con datos
	 * 
	 * @param numerocta
	 * @param saldo
	 * @param titular
	 */
	public CuentaBancaria(int numerocta, double saldo, String titular) {
		this.numerocta = numerocta;
		this.saldo = saldo;
		this.titular = titular;
	}

	/**
	 * @return the numerocta
	 */
	public int getNumerocta() {
		return numerocta;
	}

	/**
	 * @param numerocta the numerocta to set
	 */
	public void setNumerocta(int numerocta) {
		this.numerocta = numerocta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Metodo ingresarDinero, para permitir al titular depositar
	/**
	 * 
	 * @param double monto, cantidad que va a depositar
	 * @return saldo mas el monto depositado
	 */
	public void ingresarDinero(double monto) {
		this.saldo = this.saldo + monto;
	}

	public void retirarDinero(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	public static CuentaBancaria crearCuenta(String nombre) {
		CuentaBancaria cuentacr = new CuentaBancaria();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero de Cuenta: ");
		cuentacr.setNumerocta(sc.nextInt());
		sc.nextLine();
		cuentacr.setTitular(nombre);
		System.out.println("Ingrese Saldo Inicial: ");
		cuentacr.setSaldo(sc.nextDouble());
		sc.nextLine();
		System.out.println("==============================");
		return cuentacr;
	}

	public void verCuenta(long idcli) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estado de Cuenta.");
		System.out.println("------------------------");
		System.out.println("Número de Cuenta: " + numerocta);
		System.out.println("Nombre Titular: " + titular);
		System.out.println("ID Titular: " + idcli);
		System.out.println("Saldo: " + saldo);
		System.out.println("Presione ENTER para continuar...");
		sc.nextLine();
	}
}
