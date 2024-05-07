package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Supervisor extends Empleado implements Iterable<Empleado>{
	
	private String seccion;
	private ArrayList<Empleado> listaEmpleados;

	public Supervisor(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno, String seccion) {
		super(nombreEmpleado, dni, tipoEmpleado, sueldo, turno);
		this.seccion=seccion;
		listaEmpleados=new ArrayList<>();
	}
	
	public void annadirEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}

	public boolean borrarEmpleado(String dni) {
		Iterator<Empleado> it = listaEmpleados.iterator();
		if (it.hasNext()) {
			if (it.next().getDni().equals(dni)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Iterator<Empleado> iterator() {
		return this.listaEmpleados.iterator();
	}
	
	@Override
	public String toString() {
		System.out.println("Empleados:");
		for (Empleado i: this) {
			System.out.println(i);
		}
		System.out.println("Supervisor:");
		return super.toString()+" Seccion:"+this.seccion;
	}
}
