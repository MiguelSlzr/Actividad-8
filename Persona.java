package Actividad8;

public abstract class Persona {
	public String nombre;
	public boolean tieneLentes;
	public boolean haceEjercicio;


public boolean personajesIguales(Persona personaUno, Persona personaDos) {
		
		if(personaUno == personaDos) {
			return false;
		}
		
		if(personaUno.getTieneLentes() == personaDos.getTieneLentes()) {
			if(personaUno.getHaceEjercicio() == personaDos.getHaceEjercicio()) {
				if(personaUno.getMayorDeEdad() == personaDos.getMayorDeEdad()) {
					if(personaUno.getEsAlto() == personaDos.getEsAlto()) {
						if(personaUno.getEstudiante() == personaDos.getEstudiante()) {
							if(personaUno.getTrabajador() == personaDos.getTrabajador()) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public Persona(String nombre, boolean tieneLentes, boolean haceEjercicio){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.haceEjercicio = haceEjercicio;
	}
	
	public Persona(boolean tieneLentes, boolean haceEjercicio){
		this.tieneLentes = tieneLentes;
		this.haceEjercicio = haceEjercicio;
	}
	
	public Persona(String nombre, boolean tieneLentes, boolean haceEjercicio, boolean mayorDeEdad, boolean esAlto, boolean esEstudiante, boolean tieneTrabajo){
		this.nombre = nombre;
		this.tieneLentes = tieneLentes;
		this.haceEjercicio = haceEjercicio;
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
	
	public boolean getTieneLentes() {
		return tieneLentes;
	}
	
	public void setEjercicio(boolean ejercicio){
		this.haceEjercicio = ejercicio;
	}
	
	public boolean getHaceEjercicio() {
		return haceEjercicio;
	}
	
	public abstract boolean getMayorDeEdad();
	public abstract void setMayoriaEdad(boolean edad);
	public abstract boolean getEsAlto();
	public abstract void setAlto(boolean altura);
	public abstract boolean getEstudiante();
	public abstract void setEstudiante(boolean estudiante);
	public abstract boolean getTrabajador();
	public abstract void setTrabajador(boolean trabajador);

	
	//DEBO ESCRIBIR TODOS LOS METODOS DE LAS 10 PERSONAS EN ESTA CLASE ABSTRACTA
}