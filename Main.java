package Actividad8;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		String[] arregloNombres = {"Luis", "Juan", "Ana", "Maria", "Pedro", "Angel", "Rubi", "Sofia", "Francisco", "Jose"};
		int[] arregloRandom = new int[10];
		int bandera = 0;
/*		String nombre = "";
		boolean tieneLentes = false;
		boolean haceEjercicio = false;
		
		boolean mayorDeEdad = false;
		boolean esAlto = false;
		boolean esEstudiante = false;
		boolean tieneTrabajo = false;
		boolean tieneFamilia = false;
		boolean tieneEnfermedad = false;
		
		Boolean[] arregloAtributos = {tieneLentes, mayorDeEdad, haceEjercicio, esAlto, esEstudiante, tieneTrabajo, tieneFamilia, tieneEnfermedad};
		
		
		
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

		
		
		Persona persona1 = new GrupoDePersonas1("Juan", tieneLentes, haceEjercicio, mayorDeEdad, esAlto);
		
		for(int i = 0; i <= 6; i++) {
			randomNumber = random.nextInt(2);
			
			System.out.println(arregloAtributos[i]);
		}
		
		//persona1.setNombre(nombre);
		System.out.println(persona1.getNombre());
		
		persona1.setLentes(tieneLentes);
		System.out.println(persona1.getTieneLentes());
		
		persona1.setMayoriaEdad(mayorDeEdad);
		System.out.println(persona1.getMayorDeEdad());
		
		persona1.setEjercicio(haceEjercicio);
		System.out.println(persona1.getHaceEjercicio());
		
		persona1.setAlto(esAlto);
		System.out.println(persona1.getEsAlto());
		*/
		for(int i = 0; i <= 9; i++) {
			randomNumber = random.nextInt(9);
			
			
				if (randomNumber == (arregloRandom[0] || randomNumber == arregloRandom[1])) {
					
				}
				else {
					bandera = 1;
				}
			
			if(bandera == 0) {
			arregloRandom[i] = randomNumber;
			bandera = 0;
			}
		}	
		
		
			
		
		for(int i = 0; i <= 9; i++) {	
			System.out.println(arregloRandom[i]);
		}
		
		
		
	}
}
