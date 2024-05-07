package tienda.modelo;

public class TestPrincipal {

	public static void main(String[] args) {
		
		Empleado emp1= new Empleado("Samir","12345678P","CAJERO",1000,"morning");
		Empleado emp2= new Empleado("Rimas","45678912F","LIMPIADOR",1000,"morning");
		Empleado emp3= new Empleado("Victoria","78912345H","CAJERO",1000,"morning");
		Empleado emp4= new Empleado("Airotciv","98765432L","CAJERO",1000,"morning");
		
		Empleado emp5= new Supervisor("Airotciv","45678398G","SUPERVISOR",1000,"morning","CONGELADOS");
		((Supervisor) emp5).annadirEmpleado(emp1);
		((Supervisor) emp5).annadirEmpleado(emp3);
		
		Tienda tienda = new Tienda("", "");
		tienda.codEmpleado(emp1);
		tienda.codEmpleado(emp2);
		tienda.codEmpleado(emp3);
		tienda.codEmpleado(emp4);
		tienda.codEmpleado(emp5);
		
		System.out.println(emp1);
		System.out.println(emp5);
	}

}
