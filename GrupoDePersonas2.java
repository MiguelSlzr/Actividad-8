package Actividad8;

public class GrupoDePersonas2 extends Persona {
	
	private boolean esEstudiante;
	private boolean tieneTrabajo;
	
	public GrupoDePersonas2(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean esEstudiante, boolean tieneTrabajo) {
		super(nombre, tieneLentes, haceEjercicio);
		this.esEstudiante = esEstudiante;
		this.tieneTrabajo = tieneTrabajo;
	}
	
	public GrupoDePersonas2(boolean tieneLentes, boolean haceEjercicio, boolean esEstudiante, boolean tieneTrabajo){
		super(tieneLentes, haceEjercicio);
		this.esEstudiante = esEstudiante;
		this.tieneTrabajo = tieneTrabajo;
	}

	
	public boolean getEstudiante() {
		return esEstudiante;
	}
	
	public void setEstudiante(boolean esEstudiante){
		this.esEstudiante = esEstudiante;
	}
	
	public void setTrabajador(boolean tieneTrabajo){
		this.tieneTrabajo = tieneTrabajo;
	}
	
	public boolean getTrabajador() {
		return tieneTrabajo;
	}
	
	public boolean getMayorDeEdad() {
		return false;
	}
	
	public boolean getEsAlto() {
		return false;
	}

	public void setMayoriaEdad(boolean edad) {
	}
	
	public void setAlto(boolean esAlto){
	}
	
}