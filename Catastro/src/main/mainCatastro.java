package main;

import modelo.Inmueble;
import modelo.Piso;
import modelo.Terreno;

public class mainCatastro {

	public static void main(String[] args) {
		
		Piso p1= new Piso("00001", 250,150000,"'Piso en el centro'",800,3,false,false,8);
		System.out.println(p1);
		System.out.println("-----------------");
		
		Piso p2= new Piso("00003", 100,90000,"'Piso vpo'",500,2,true,false,20);
		System.out.println(p2);
		System.out.println("-----------------");
		
		Piso p3= new Piso("00004", 120,98000,"'Piso vpo viejo'",400,3,true,false,28);
		System.out.println(p3);
		System.out.println("-----------------");
		
		System.out.println("El ibi de '" + p1.getDescripcion()+"' es: "+ p1.calculaIBI());	
		System.out.println("El ibi de '" + p2.getDescripcion()+"' es: "+ p2.calculaIBI());	
		System.out.println("El ibi de '" + p3.getDescripcion()+"' es: "+ p3.calculaIBI());	
		System.out.println("-----------------");

		System.out.println("El precio venta de '" + p1.getDescripcion()+
				"' con antigüedad de "+ p1.getAntiguedad()+" años es: "+ p1.calculaPrecioVenta());
		System.out.println("El precio venta de '" + p2.getDescripcion()+
				"' con antigüedad de "+ p2.getAntiguedad()+" años es: "+ p2.calculaPrecioVenta());
		System.out.println("El precio venta de '" + p3.getDescripcion()+
				"' con antigüedad de "+ p3.getAntiguedad()+" años es: "+ p3.calculaPrecioVenta());
	
	}

}
