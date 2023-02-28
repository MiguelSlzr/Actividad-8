package Actividad8;

public class GrupoDePersonas2 extends Persona {
	
	
	public GrupoDePersonas2(String nombre, boolean tieneLentes, boolean mayorDeEdad, boolean haceEjercicio, boolean esAlto, boolean esEstudiante, boolean tieneTrabajo, boolean tieneFamilia, boolean tieneEnfermedad) {
		super(nombre, tieneLentes, mayorDeEdad, haceEjercicio, esAlto, esEstudiante, tieneTrabajo, tieneFamilia, tieneEnfermedad);
	}
	
	public Persona crearPersona2(String nombre, boolean esEstudiante, boolean tieneTrabajo, boolean tieneFamilia, boolean tieneEnfermedad) {
		Persona miPersona = new GrupoDePersonas2();
		return miPersona;
	}

	
	public String setName(){
		return nombre;
	}
}