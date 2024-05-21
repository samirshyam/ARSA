package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
/*
import deportistas.controlador.ConsultaContraladorInterfaz;
import deportistas.controlador.ConsultaControlador;
*/
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaEmpleadosVista extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaEmpleadosVista() {
		setLayout(null);
		
		JLabel tituloListaEmpleadosLabel = new JLabel("Lista Empleados");
		tituloListaEmpleadosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaEmpleadosLabel.setForeground(Color.BLACK);
		tituloListaEmpleadosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaEmpleadosLabel.setBounds(0, 11, 450, 23);
		add(tituloListaEmpleadosLabel);


		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 430, 244);
		add(scrollPane);
		
		JPanel FondoTextoListaEmpleados = new JPanel();
		FondoTextoListaEmpleados.setBackground(new Color(255, 255, 255));
		FondoTextoListaEmpleados.setBounds(112, 11, 226, 23);
		add(FondoTextoListaEmpleados);
		


	}

}
