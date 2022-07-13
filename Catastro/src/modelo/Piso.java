package modelo;

public class Piso extends Inmueble{
	
	private int numHab;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;
	
	public Piso() {
		super();
		this.numHab=0;
		this.vpo=false;
	}

	public Piso(String ref, double m2, double valor, String descripcion, double preciom2, int numHab, boolean vpo,
			boolean atico, int antiguedad) {
		super(ref, m2, valor, descripcion, preciom2);
		this.numHab=numHab;
		this.vpo=vpo;
		this.atico=atico;
		this.antiguedad=antiguedad;
	}

	public Piso(Piso p) {
		super(p);
		this.numHab=p.numHab;
		this.vpo=p.vpo;
		this.atico=p.atico;
		this.antiguedad=p.antiguedad;
	}

	@Override
	public String toString() {
		return "Piso: \nnumHab=" + numHab + "\nvpo=" + vpo + "\natico=" + atico + "\nantiguedad=" + antiguedad + "\nref="
				+ ref + "\nm2=" + m2 + "\nvalor=" + valor + "\ndescripcion=" + descripcion + "\npreciom2=" + preciom2;
	}
	
	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public boolean isVpo() {
		return vpo;
	}

	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}

	public boolean isAtico() {
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double calculaIBI() {
		if (this.vpo) {
			return this.valor*coefUrbano/2;
		} else {
			return this.valor*coefUrbano;
		}
	}

	@Override
	public double calculaPrecioVenta() {
		if (this.vpo && this.antiguedad<25) {
			return 0;
		}
		if (isAtico()) {
			double res;
			res = this.m2*this.preciom2; //si fuese private tendria que acceder con getM2
			res= res + res*0.06;
			return res;
		} else {
			return this.m2*this.preciom2;
		}
		
	}

	@Override
	public int compareTo(Inmueble o) {
		
		return 0;
	}

}
