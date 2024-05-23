package tienda.vistas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import tienda.controlador.ListarCargasControlador;

public class ListaCargasVista extends JPanel {
	
	public ListaCargasVista() {
			setLayout(null);
			
			JLabel tituloListaProductosLabel = new JLabel("Lista Empleados");
			tituloListaProductosLabel.setHorizontalAlignment(SwingConstants.CENTER);
			tituloListaProductosLabel.setForeground(Color.BLACK);
			tituloListaProductosLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
			tituloListaProductosLabel.setBounds(0, 11, 450, 23);
			add(tituloListaProductosLabel);
			
			ListarCargasControlador a = new ListarCargasControlador();
			final String[] cabeceraTabla= {"Cod. Cargo","Cod. Empleado","Productos"};
			JTable ListaCargas=new JTable(a.listarCargas(),cabeceraTabla) {
				public boolean isCellEditable(int row, int column) {
			            return false;
			         }
			};
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 45, 430, 244);
			add(scrollPane);
			
			scrollPane.setViewportView(ListaCargas);
			
			ListaCargas.setGridColor(Color.BLACK);
			
			
			JPanel FondoTextoListaProductos = new JPanel();
			FondoTextoListaProductos.setBackground(Color.WHITE);
			FondoTextoListaProductos.setBounds(112, 11, 226, 23);
			add(FondoTextoListaProductos);

		}
	}
