package tienda.vistas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import tienda.controlador.ListaFacturasControlador;

public class ListaFacturasVista extends JPanel {

	public ListaFacturasVista() {
		setLayout(null);
		setSize(540, 350);
		
		ListaFacturasControlador a = new ListaFacturasControlador();
		final String[] cabeceraTabla= {"Cod. Factura","Cod. Empleado","Precio.", "productos"};
		JTable ListaFacturas=new JTable(a.listarFacturas(),cabeceraTabla) {
			public boolean isCellEditable(int row, int column) {
		            return false;
		         }
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 65, 470, 244);
		add(scrollPane);
		
		scrollPane.setViewportView(ListaFacturas);
		
		ListaFacturas.setGridColor(Color.BLACK);
		
		JLabel lblListaFacturas = new JLabel("Lista Facturas");
		lblListaFacturas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaFacturas.setForeground(Color.BLACK);
		lblListaFacturas.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		lblListaFacturas.setBounds(10, 11, 520, 23);
		add(lblListaFacturas);
		
		JPanel FondoTextoListaProductos_1 = new JPanel();
		FondoTextoListaProductos_1.setBackground(new Color(204, 255, 255));
		FondoTextoListaProductos_1.setBounds(155, 11, 226, 23);
		add(FondoTextoListaProductos_1);

	}

}
