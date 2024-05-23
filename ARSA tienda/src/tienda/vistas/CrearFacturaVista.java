package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearFacturaVista extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CrearFacturaVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel lblCrearCarga = new JLabel("Crear Factura");
		lblCrearCarga.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearCarga.setForeground(Color.BLACK);
		lblCrearCarga.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		lblCrearCarga.setBounds(10, 11, 520, 23);
		add(lblCrearCarga);
		
		JLabel DNILabel = new JLabel("DNI");
		DNILabel.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel.setBounds(45, 105, 105, 14);
		add(DNILabel);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(160, 102, 226, 20);
		add(textField);
		
		JLabel NombreLabel = new JLabel("Nombre Producto");
		NombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		NombreLabel.setBounds(45, 135, 105, 14);
		add(NombreLabel);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(160, 133, 226, 20);
		add(textField_1);
		
		JLabel PuestoLabel = new JLabel("x");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(45, 167, 105, 14);
		add(PuestoLabel);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(160, 164, 226, 20);
		add(textField_2);
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(153, 51, 255));
		EnviarButton.setBounds(224, 290, 89, 23);
		add(EnviarButton);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(153, 51, 255));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

}
