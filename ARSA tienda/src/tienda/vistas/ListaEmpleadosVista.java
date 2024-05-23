package tienda.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.ListarEmpleadosControlador;

/*
import deportistas.controlador.ConsultaContraladorInterfaz;
import deportistas.controlador.ConsultaControlador;
*/
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaEmpleadosVista extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListaEmpleadosVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel tituloListaProductosLabel = new JLabel("Lista Empleados");
		tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaProductosLabel.setForeground(Color.BLACK);
		tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaProductosLabel.setBounds(10, 11, 520, 23);
		add(tituloListaProductosLabel);
		
		ListarEmpleadosControlador a = new ListarEmpleadosControlador();
		final String[] cabeceraTabla= {"Cod. Emp","Nombre","DNI.", "Tipo", "Turno", "Sueldo", "Seccion Supervisor", "Empleados Supervisor"};
		JTable ListaEmpleados=new JTable(a.listarEmpleados(),cabeceraTabla) {
			public boolean isCellEditable(int row, int column) {
		            return false;
		         }
		};
		
		ListaEmpleados.setGridColor(Color.BLACK);
		
		JScrollPane scrollPane = new JScrollPane(ListaEmpleados);
		scrollPane.setBounds(27, 65, 470, 244);
		add(scrollPane);
		
		JPanel FondoTextoListaProductos = new JPanel();
		FondoTextoListaProductos.setBackground(new Color(102, 153, 255));
		FondoTextoListaProductos.setBounds(155, 11, 226, 23);
		add(FondoTextoListaProductos);
	}
}
