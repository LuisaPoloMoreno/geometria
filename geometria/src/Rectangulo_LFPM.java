/**
 * 
 * @author linuxmint20
 *Luis Fernanda Polo Moreno
 *version 1.2
 */
public class Rectangulo_LFPM extends FiguraGeometrica_LFPM {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 * lee los valores de los dos lados
	 */
	
	public Rectangulo_LFPM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * nos resuelve el area del rectangulo, devolviendonos su valor.
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * nos resuelve el perimetro del rectangulo, devolviendonos su valor.
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
