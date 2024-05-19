package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class bajaProducto extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public bajaProducto() {
		setLayout(null);
		
		JLabel tituloBajaProductoLabel = new JLabel("Baja Producto");
		tituloBajaProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloBajaProductoLabel.setForeground(Color.BLACK);
		tituloBajaProductoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloBajaProductoLabel.setBounds(0, 11, 450, 23);
		add(tituloBajaProductoLabel);
		
		JLabel ProductoNombreLabel = new JLabel("Nombre");
		ProductoNombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ProductoNombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		ProductoNombreLabel.setBounds(0, 133, 105, 14);
		add(ProductoNombreLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(115, 130, 226, 20);
		add(textField);
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(255, 153, 153));
		EnviarButton.setBounds(180, 161, 89, 23);
		add(EnviarButton);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(255, 153, 153));
		FondoTextoAltaEmpleado.setBounds(115, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

}
