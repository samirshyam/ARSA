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
		setSize(540, 336);
		
		JLabel tituloListaProductosLabel = new JLabel("Lista Productos");
		tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaProductosLabel.setForeground(new Color(0, 0, 0));
		tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaProductosLabel.setBounds(10, 11, 520, 23);
		add(tituloListaProductosLabel);
		
		ListaProductosControlador a = new ListaProductosControlador();
		final String[] cabeceraTabla= {"Cod. Producto","Nombre","Seccion.", "Precio", "Stock"};
		JTable ListaProductos=new JTable(a.listarProductos(),cabeceraTabla) {
			public boolean isCellEditable(int row, int column) {
		            return false;
		         }
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 65, 470, 244);
		add(scrollPane);
		
		scrollPane.setViewportView(ListaProductos);
		
		ListaProductos.setGridColor(Color.BLACK);
		
		JPanel FondoTextoListaProductos = new JPanel();
		FondoTextoListaProductos.setBackground(new Color(204, 255, 204));
		FondoTextoListaProductos.setBounds(155, 11, 226, 23);
		add(FondoTextoListaProductos);

	}

}
