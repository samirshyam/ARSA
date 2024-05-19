package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class listaProductos extends JPanel {
	private JTable ListaProductos;
	private DefaultTableModel model;

	/**
	 * Create the panel.
	 */
	public listaProductos() {
		setLayout(null);
		
		JLabel tituloListaProductosLabel = new JLabel("Lista Productos");
		tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloListaProductosLabel.setForeground(Color.BLACK);
		tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloListaProductosLabel.setBounds(0, 11, 450, 23);
		add(tituloListaProductosLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 430, 244);
		add(scrollPane);
		
		ListaProductos = new JTable();
	
		model=new DefaultTableModel();
		ListaProductos.setModel(model);
		
		model.addColumn("DNI");
		model.addColumn("Nombre");
		model.addColumn("Puesto");
		model.addColumn("Sueldo");
		model.addColumn("Turno");
		model.addColumn("Seccion");
		
		scrollPane.setViewportView(ListaProductos);
		
		//Video min 11:20
		
		
		JPanel FondoTextoListaProductos = new JPanel();
		FondoTextoListaProductos.setBackground(Color.WHITE);
		FondoTextoListaProductos.setBounds(112, 11, 226, 23);
		add(FondoTextoListaProductos);

	}

}
