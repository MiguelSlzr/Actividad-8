package ActividadPrueba;
import java.io.*;
import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	File file;
	String directoryPath = "D:\\Users\\174720\\eclipse-workspace\\Actividades\\src\\ActividadPrueba\\testing\\";
	
	FileWriter escribir = null;
	PrintWriter imprimir = null;
	String ext = ".txt";
	System.out.println("Escribe tu nombre: ");
	String texto = scan.nextLine();
	String path = directoryPath+texto+ext;
	file = new File(path);

	int juegosGanados = 0;
	int juegosJugados = 0;
	
	if (file.exists()) {
	System.out.println("Ya existe un archivo");
	} else {
	System.out.println("Creando archivo");
		try {
			
			file.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	try {
		escribir = new FileWriter(file);
		imprimir = new PrintWriter(escribir);
		
		imprimir.print(juegosJugados);
		imprimir.print(juegosGanados);
		
	
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally{
		try {
			escribir.close();
			imprimir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	scan.close();
}
}
