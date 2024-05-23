package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.ActualizarProductoControlador;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ActualizarProductoVista extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton EnviarButton;
	private ActualizarProductoControlador a = new ActualizarProductoControlador();

	/**
	 * Create the panel.
	 */
	public ActualizarProductoVista() {
		setLayout(null);
		
		JLabel tituloActualizarProductoLabel = new JLabel("Actualizar Producto");
		tituloActualizarProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloActualizarProductoLabel.setForeground(Color.BLACK);
		tituloActualizarProductoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloActualizarProductoLabel.setBounds(0, 11, 450, 23);
		add(tituloActualizarProductoLabel);
		
		JLabel ProductoNombreLabel = new JLabel("Nombre");
		ProductoNombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ProductoNombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		ProductoNombreLabel.setBounds(0, 80, 105, 14);
		add(ProductoNombreLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(115, 77, 226, 20);
		add(textField);
		
		JLabel SeccionProductoLabel = new JLabel("Seccion");
		SeccionProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SeccionProductoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		SeccionProductoLabel.setBounds(0, 111, 105, 14);
		add(SeccionProductoLabel);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(115, 108, 226, 20);
		add(textField_1);
		
		JLabel FechaCaducidadLabel = new JLabel("Fecha Caducidad");
		FechaCaducidadLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FechaCaducidadLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		FechaCaducidadLabel.setBounds(0, 142, 105, 14);
		add(FechaCaducidadLabel);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(115, 139, 226, 20);
		add(textField_2);
		
		JLabel PrecioProductoLabel = new JLabel("Precio");
		PrecioProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioProductoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PrecioProductoLabel.setBounds(0, 173, 105, 14);
		add(PrecioProductoLabel);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(115, 170, 226, 20);
		add(textField_3);
		
		JLabel StockProductoLabel = new JLabel("Stock");
		StockProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StockProductoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		StockProductoLabel.setBounds(0, 204, 105, 14);
		add(StockProductoLabel);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(115, 201, 226, 20);
		add(textField_4);
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(153, 153, 153));
		EnviarButton.setBounds(180, 232, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(204, 204, 204));
		FondoTextoAltaEmpleado.setBounds(115, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String nombre=textField.getText();
		String seccion=textField_1.getText();
		String fecha_caducidad=textField_2.getText();
		Double precio=Double.parseDouble(textField_3.getText());
		int stock=Integer.parseInt(textField_4.getText());
		a.actualizarProducto(fecha_caducidad, nombre, seccion, precio, stock);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Actualizacion Correcta");
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");

		}
	}

}
