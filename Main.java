package Actividad8;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		String nombre = "";
		boolean tieneLentes = false;
		boolean mayorDeEdad = false;
		boolean haceEjercicio = false;
		boolean esAlto = false;
		boolean esEstudiante = false;
		boolean tieneTrabajo = false;
		boolean tieneFamilia = false;
		boolean tieneEnfermedad = false;
		
		Boolean[] arregloAtributos = {tieneLentes, mayorDeEdad, haceEjercicio, esAlto, esEstudiante, tieneTrabajo, tieneFamilia, tieneEnfermedad};
		
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		
		for(int i = 0; i <= 6; i++) {
			randomNumber = random.nextInt(2);
			System.out.println(randomNumber);
			
			if (randomNumber == 1) {
				arregloAtributos[i] = true;
			}
			else {
				arregloAtributos[i] = false;
			}
		}

		
		
		Persona persona1 = new GrupoDePersonas1("Juan", tieneLentes, mayorDeEdad, haceEjercicio, esAlto, esEstudiante, tieneTrabajo, tieneFamilia, tieneEnfermedad);
		
		for(int i = 0; i <= 6; i++) {
			randomNumber = random.nextInt(2);
			
			System.out.println(arregloAtributos[i]);
		}
		
		persona1.setName(nombre);
		persona1.setLentes(tieneLentes);
		persona1.setMayoriaEdad(mayorDeEdad);
		persona1.setEjercicio(haceEjercicio);
		persona1.setAlto(esAlto);
	}
}
