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
		
		JLabel tituloListaProductosLabel = new JLabel("Lista Empleados");
		tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaProductosLabel.setForeground(Color.BLACK);
		tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaProductosLabel.setBounds(0, 11, 450, 23);
		add(tituloListaProductosLabel);
		
		ListaFacturasControlador a = new ListaFacturasControlador();
		final String[] cabeceraTabla= {"Cod. Factura","Cod. Empleado","Precio.", "productos"};
		JTable ListaFacturas=new JTable(a.listarFacturas(),cabeceraTabla) {
			public boolean isCellEditable(int row, int column) {
		            return false;
		         }
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 430, 244);
		add(scrollPane);
		
		scrollPane.setViewportView(ListaFacturas);
		
		ListaFacturas.setGridColor(Color.BLACK);
		
		
		JPanel FondoTextoListaProductos = new JPanel();
		FondoTextoListaProductos.setBackground(Color.WHITE);
		FondoTextoListaProductos.setBounds(112, 11, 226, 23);
		add(FondoTextoListaProductos);

	}

}
