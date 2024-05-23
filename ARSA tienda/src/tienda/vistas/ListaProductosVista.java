package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tienda.controlador.ListaProductosControlador;

public class ListaProductosVista extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListaProductosVista() {
		setLayout(null);
		
		JLabel tituloListaProductosLabel = new JLabel("Lista Productos");
		tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaProductosLabel.setForeground(Color.BLACK);
		tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaProductosLabel.setBounds(0, 11, 450, 23);
		add(tituloListaProductosLabel);
		
		ListaProductosControlador a = new ListaProductosControlador();
		final String[] cabeceraTabla= {"Cod. Producto","Nombre","Seccion.", "Precio", "Stock"};
		JTable ListaProductos=new JTable(a.listarProductos(),cabeceraTabla) {
			public boolean isCellEditable(int row, int column) {
		            return false;
		         }
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 430, 244);
		add(scrollPane);
		
		scrollPane.setViewportView(ListaProductos);
		
		ListaProductos.setGridColor(Color.BLACK);

	}

}
