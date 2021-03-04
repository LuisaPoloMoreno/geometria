import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaCirculo {

	@Test
	void testArea() {
		Circulo_LFPM circulo= new Circulo_LFPM (7, null);
		assertEquals (153.9384, circulo.area());
		
	}

	@Test
	void testArea2() {
		Circulo_LFPM circulo= new Circulo_LFPM (0, null);
		assertEquals (0, circulo.area());
		
	}
	@Test
	void testArea3() {
		Circulo_LFPM circulo= new Circulo_LFPM (-3, null);
		assertEquals (28.2744, circulo.area());
		
	}
	
	@Test
	void testPerimetro() {
		Circulo_LFPM circulo= new Circulo_LFPM (7, null);
		assertEquals (43.9824, circulo.perimetro());
	}

	@Test
	void testPerimetro2() {
		Circulo_LFPM circulo= new Circulo_LFPM (0, null);
		assertEquals (0, circulo.perimetro());
	}
	
	@Test
	void testPerimetro3() {
		Circulo_LFPM circulo= new Circulo_LFPM (-3, null);
		assertEquals (18.8496, circulo.perimetro());
	}
}
