package Actividad8;

public class GrupoDePersonas1 extends Persona {
	
	public GrupoDePersonas1(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto, boolean esEstudiante, boolean tieneTrabajo, boolean tieneFamilia, boolean tieneEnfermedad) {
		super(nombre, tieneLentes, mayorDeEdad, haceEjercicio, esAlto, esEstudiante, tieneTrabajo, tieneFamilia, tieneEnfermedad);
	}
	
	public Persona crearPersona1(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto) {
		Persona miPersona = new GrupoDePersonas1(nombre, tieneLentes, mayorDeEdad, haceEjercicio, esAlto);
		return miPersona;
	}
	
	
	
	
	
}