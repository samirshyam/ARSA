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
			setSize(540, 350);
			
			ListarCargasControlador a = new ListarCargasControlador();
			final String[] cabeceraTabla= {"Cod. Cargo","Cod. Empleado","Productos"};
			JTable ListaCargas=new JTable(a.listarCargas(),cabeceraTabla) {
				public boolean isCellEditable(int row, int column) {
			            return false;
			         }
			};
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 65, 470, 244);
			add(scrollPane);
			
			scrollPane.setViewportView(ListaCargas);
			
			ListaCargas.setGridColor(Color.BLACK);
			
			JLabel tituloListaCargasLabel = new JLabel("Lista Cargas");
			tituloListaCargasLabel.setHorizontalAlignment(SwingConstants.CENTER);
			tituloListaCargasLabel.setForeground(Color.BLACK);
			tituloListaCargasLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
			tituloListaCargasLabel.setBounds(10, 11, 520, 23);
			add(tituloListaCargasLabel);
			
			JPanel FondoTextoListaProductos_1 = new JPanel();
			FondoTextoListaProductos_1.setBackground(new Color(204, 255, 255));
			FondoTextoListaProductos_1.setBounds(155, 11, 226, 23);
			add(FondoTextoListaProductos_1);

		}
	}
