package modelo;

public class Terreno extends Inmueble {

	private boolean urbano; //true urbano, false rustico
	private double terrenoHa;// 0 si es rustica
	private double precioHa;
	
	public Terreno() {
		super();
		this.urbano = true;
		this.terrenoHa = 0;
	}
	
	public Terreno(String ref, double m2, double valor, String descripcion, double preciom2, boolean urbano, double terrenoHa, 
			double precioHa) {
		super(ref, m2, valor, descripcion, preciom2);
		this.urbano = urbano;
		this.terrenoHa = terrenoHa;
		this.precioHa = precioHa;
	}

	@Override
	public String toString() {
		return "Terreno: \nurbano=" + urbano + "\nterrenoHa=" + terrenoHa + "\nprecioHa=" + precioHa + "\nref=" + ref
				+ "\nm2=" + m2 + "\nvalor=" + valor + "\ndescripcion=" + descripcion + "\npreciom2=" + preciom2;
	}

	public boolean isUrbano() {
		return urbano;
	}

	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}

	public double getTerrenoHa() {
		return terrenoHa;
	}

	public void setTerrenoHa(double terrenoHa) {
		this.terrenoHa = terrenoHa;
	}

	public double getPrecioHa() {
		return precioHa;
	}

	public void setPrecioHa(double precioHa) {
		this.precioHa = precioHa;
	}
	
	@Override
	public double calculaIBI() {
		if (isUrbano()) {
			return this.valor*coefUrbano;
		}else {
			return this.valor*coefRustico;
		}
	}
	
	@Override
	public double calculaPrecioVenta() {
		if (this.urbano) {
			return this.preciom2*this.m2+precioHa*terrenoHa;
		}else {
			return this.preciom2*this.m2;
		}
	}

	@Override
	public int compareTo(Inmueble o) {
		
		return 0;
	}
}
