package Actividad8;

public class GrupoDePersonas2 extends Persona {
	
	private boolean esEstudiante;
	private boolean tieneTrabajo;
	
	public GrupoDePersonas2(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean esEstudiante, boolean tieneTrabajo) {
		super(nombre, tieneLentes, haceEjercicio);
		this.esEstudiante = esEstudiante;
		this.tieneTrabajo = tieneTrabajo;
	}

	
	public void setEstudiante(boolean estudiante){
		this.esEstudiante = estudiante;
	}
	
	public void setTrabajador(boolean trabajador){
		this.tieneTrabajo = trabajador;
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