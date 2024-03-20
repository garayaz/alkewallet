package clases;

import java.util.Scanner;

public class Cliente {
	private long id;
	private String nombre;
	private CuentaBancaria cuenta;
	
	
	/**
	 * Se crea Constructor vacío
	 */
	public Cliente() {
	}
	
	/**
	 * Se crea constructor con parámetros
	 * @param id
	 * @param nombre
	 * @param cuenta
	 */
	public Cliente(long id, String nombre, CuentaBancaria cuenta) {
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	
	/* Se crean Getters y Setters
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cuenta
	 */
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	public static Cliente crearCliente() {
		Cliente nuevocliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a AlkeBank.");
		System.out.println("------------------------");
		System.out.println("Ingrese id de Cliente: ");
		nuevocliente.setId(sc.nextLong());
		sc.nextLine();
		System.out.println("Ingrese nombre del Cliente: ");
		nuevocliente.setNombre(sc.nextLine());
		nuevocliente.setCuenta(CuentaBancaria.crearCuenta(nuevocliente.getNombre()));
		System.out.println("==============================");
		return nuevocliente;
	}
}
