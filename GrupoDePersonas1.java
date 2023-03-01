package Actividad8;

public class GrupoDePersonas1 extends Persona {

	private boolean esAlto;
	private boolean mayorDeEdad;
	
	public GrupoDePersonas1(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean esAlto, boolean mayorDeEdad){
		super(nombre, tieneLentes, haceEjercicio);
		this.mayorDeEdad = mayorDeEdad;
		this.esAlto = esAlto;
	}
	
	
	
	
	
	

	
	
	public boolean getMayorDeEdad() {
		return mayorDeEdad;
	}
	
	public void setMayoriaEdad(boolean mayorDeEdad){
		this.mayorDeEdad = mayorDeEdad;
	}
	
	public void setAlto(boolean esAlto){
		this.esAlto = esAlto;
	}
	
	public boolean getEsAlto() {
		return esAlto;
	}
	
	
	
	
	
	
	
	
	
	
}
	
