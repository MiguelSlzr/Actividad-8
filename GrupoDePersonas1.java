package Actividad8;

public class GrupoDePersonas1 extends Persona {

	private boolean esAlto;
	private boolean mayorDeEdad;
	
	public GrupoDePersonas1(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean esAlto, boolean mayorDeEdad){
		super(nombre, tieneLentes, haceEjercicio);
		this.mayorDeEdad = mayorDeEdad;
		this.esAlto = esAlto;
	}
	
	public void setAlto(boolean esAlto){
		this.esAlto = esAlto;
	}
	
	public void setMayoriaEdad(boolean mayorDeEdad){
		this.mayorDeEdad = mayorDeEdad;
	}
	
	
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean getTieneLentes() {
		return tieneLentes;
	}
	
	public boolean getMayorDeEdad() {
		return mayorDeEdad;
	}
	
	public boolean getHaceEjercicio() {
		return haceEjercicio;
	}
	
	public boolean getEsAlto() {
		return esAlto;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setLentes(boolean lentes){
		this.tieneLentes = lentes;
	}
	
	public void setEjercicio(boolean ejercicio){
		this.haceEjercicio = ejercicio;
	}
}
	
	