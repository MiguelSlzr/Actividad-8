package Actividad8;

public class GrupoDePersonas3 extends Persona {
	
	private boolean tieneFamilia;
	private boolean tieneEnfermedad;

	
	public GrupoDePersonas3(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean tieneFamilia, boolean tieneEnfermedad) {
		super(nombre, tieneLentes, haceEjercicio);
		this.tieneFamilia = tieneFamilia;
		this.tieneEnfermedad = tieneEnfermedad;
	}
	


	
	public String setName(){
		return nombre;
	}
	
	public void setFamilia(boolean familia){
		this.tieneFamilia = familia;
	}
	
	public void setEnfermo(boolean enfermo){
		this.tieneEnfermedad = enfermo;
	}
	
	
	
	public String getNombre(){
		return nombre;
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