package clases;

public interface Moneda {

	/**
	 * Interfaz que devuelve el simbolo segun el tipo de moneda utilizado
	 * 
	 * @return
	 */
	public String getSimbolo();

	public float getFactorConversion();

	public void convertir();
}
