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

	
	
	

	
	public Persona(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.mayorDeEdad = mayorDeEdad;
		this.haceEjercicio = haceEjercicio;
		this.esAlto = esAlto;
	}
	

	public String setName(){
		return nombre;
	}
	
	
	
}
