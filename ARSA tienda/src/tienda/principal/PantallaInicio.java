package tienda.principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PantallaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido a la tienda");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio frame = new PantallaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setTitle("ARSA");
		setForeground(new Color(128, 128, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu EmpleadosMenu = new JMenu("Empleados");
		menuBar.add(EmpleadosMenu);
		
		JMenuItem DarAltaEmpleadosMenuItem = new JMenuItem("Alta Empleado");
		DarAltaEmpleadosMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		EmpleadosMenu.add(DarAltaEmpleadosMenuItem);
		
		JMenuItem DarBajaEmpleadosNewMenuItem = new JMenuItem("Baja Empleado");
		DarBajaEmpleadosNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		EmpleadosMenu.add(DarBajaEmpleadosNewMenuItem);
		
		JMenuItem ActualizarPosicionEmpleadosNewMenuItem_1 = new JMenuItem("Actualizar Posición");
		ActualizarPosicionEmpleadosNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		EmpleadosMenu.add(ActualizarPosicionEmpleadosNewMenuItem_1);
		
		JMenu ProductosMenu = new JMenu("Productos");
		menuBar.add(ProductosMenu);
		
		JMenuItem DarAltaProductoMenuItem = new JMenuItem("Alta Producto");
		DarAltaProductoMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		ProductosMenu.add(DarAltaProductoMenuItem);
		
		JMenuItem DarBajaProductoMenuItem = new JMenuItem("Baja Producto");
		DarBajaProductoMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		ProductosMenu.add(DarBajaProductoMenuItem);
		
		JMenuItem ActualizarProductoMenuItem = new JMenuItem("Actualizar Producto");
		ActualizarProductoMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		ProductosMenu.add(ActualizarProductoMenuItem);
		
		JMenu ListasMenu = new JMenu("Listas");
		menuBar.add(ListasMenu);
		
		JMenuItem ListaEmpleadosMenuItem = new JMenuItem("Lista Empleados");
		ListaEmpleadosMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		ListasMenu.add(ListaEmpleadosMenuItem);
		
		JMenuItem ListaProductosMenuItem = new JMenuItem("Lista Productos");
		ListaProductosMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		ListasMenu.add(ListaProductosMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel FondoLabel = new JLabel("");
		FondoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FondoLabel.setIcon(new ImageIcon(System.getProperty("user.home")+"\\git\\ARSA\\ARSA tienda\\img\\ARSA_Logo.jpg"));
		FondoLabel.setBounds(0, 0, 434, 239);
		contentPane.add(FondoLabel);
	}
}
