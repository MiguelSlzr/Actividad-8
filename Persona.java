package Actividad8;

public abstract class Persona {
	private String nombre;
	private boolean tieneLentes;
	private boolean mayorDeEdad;
	private boolean haceEjercicio;
	private boolean esAlto;
	
	private boolean esEstudiante;
	private boolean tieneTrabajo;
	private boolean tieneFamilia;
	private boolean tieneEnfermedad;

	
	public Persona(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto, boolean esEstudiante, boolean tieneTrabajo, boolean tieneFamilia, boolean tieneEnfermedad){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.mayorDeEdad = mayorDeEdad;
		this.haceEjercicio = haceEjercicio;
		this.esAlto = esAlto;
		this.esEstudiante = esEstudiante;
		this.tieneTrabajo = tieneTrabajo;
		this.tieneFamilia = tieneFamilia;
		this.tieneEnfermedad = tieneEnfermedad;
		
	}
	
	public void setName(String nombre){
		this.nombre = nombre;
	}
	
	public void setLentes(boolean lentes){
		this.tieneLentes = lentes;
	}
	
	public void setMayoriaEdad(boolean mayoriaEdad){
		this.mayorDeEdad = mayoriaEdad;
	}
	
	public void setEjercicio(boolean ejercicio){
		this.haceEjercicio = ejercicio;
	}
	
	public void setAlto(boolean esAlto){
		this.esAlto = esAlto;
	}
	
	public void setEstudiante(boolean estudiante){
		this.esEstudiante = estudiante;
	}
	
	public void setTrabajador(boolean trabajador){
		this.tieneTrabajo = trabajador;
	}
	
	public void setFamilia(boolean familia){
		this.tieneFamilia = familia;
	}
	
	public void setEnfermo(boolean enfermo){
		this.tieneEnfermedad = enfermo;
	}
}