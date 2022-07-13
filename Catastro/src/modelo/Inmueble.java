package modelo;

import java.util.Objects;

public abstract class Inmueble  //no puedo crear objetos de clase inmueble
	implements Comparable<Inmueble>{ //interfaz para comparar compareTo
	
	protected String ref;
	protected double m2;
	protected double valor;
	protected String descripcion;
	protected double preciom2;
	public static final double coefUrbano=0.0085;
	public static final double coefRustico=0.0045;
	
	public Inmueble() {
		this.ref=null;
		this.descripcion=null;
		this.m2=0;
		this.preciom2=0;
	}

	public Inmueble(String ref, double m2, double valor, String descripcion, double preciom2) {
		this.ref = ref;
		this.m2 = m2;
		
		if (valor>=0) {
			this.valor = valor;
		} else this.valor=0;
		
		this.descripcion = descripcion;
		this.preciom2 = preciom2;
		
		if (preciom2>=0) {
			this.preciom2 = preciom2;
		} else this.preciom2=0;
	}
	
	public Inmueble (Inmueble i) {
		this.ref = i.ref;
		this.m2 = i.m2;
		this.valor = i.valor;
		this.descripcion = i.descripcion;
		this.preciom2 = i.preciom2;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPreciom2() {
		return preciom2;
	}

	public void setPreciom2(double preciom2) {
		this.preciom2 = preciom2;
	}

	@Override
	public String toString() {
		return "Inmueble [ref=" + ref + "\nm2=" + m2 + "\nvalor=" + valor + "\ndescripcion=" + descripcion
				+ "\npreciom2=" + preciom2 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ref);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		if (obj instanceof String) { //compara con la cadena
			return this.ref.equals(obj);
		}
		
		Inmueble other = (Inmueble) obj;
		return Objects.equals(ref, other.ref);
	}
		
	/*public Inmueble masSuperficie(Inmueble i) {
		if (this.getM2()>i.getM2()) {
			return this;
		} else {
			return i;
		}
	}*/
	
	@Override
	public int compareTo(Inmueble o) {
		return Double.compare(this.m2, o.m2);//devuelve -1 0(iguales) +1
	}
	
	public abstract double calculaIBI();
		
	public abstract double calculaPrecioVenta();
}
