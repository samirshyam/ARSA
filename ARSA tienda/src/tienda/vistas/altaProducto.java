package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class altaProducto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public altaProducto() {
		setLayout(null);
		
		JLabel tituloAltaProductoLabel = new JLabel("Alta Producto");
		tituloAltaProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloAltaProductoLabel.setForeground(Color.BLACK);
		tituloAltaProductoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloAltaProductoLabel.setBounds(0, 11, 450, 23);
		add(tituloAltaProductoLabel);
		
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
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(204, 255, 204));
		EnviarButton.setBounds(180, 232, 89, 23);
		add(EnviarButton);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(204, 255, 204));
		FondoTextoAltaEmpleado.setBounds(115, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

}
