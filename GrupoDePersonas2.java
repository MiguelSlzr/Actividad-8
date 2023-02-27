package Actividad8;

public class GrupoDePersonas2 extends Persona {
	
	public Persona crearPersona2(String nombre, boolean esEstudiante, boolean tieneTrabajo, boolean tieneFamilia, boolean tieneEnfermedad) {
		Persona miPersona = new GrupoDePersonas2();
		return miPersona;
	}
	
	public GrupoDePersonas1(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto) {
		super(nombre, tieneLentes, mayorDeEdad, haceEjercicio, esAlto);
	}
	
	
	public String setName(){
		return nombre;
	}
}
