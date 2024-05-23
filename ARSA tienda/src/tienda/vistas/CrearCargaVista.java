package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearCargaVista extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CrearCargaVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel lblCrearCarga = new JLabel("Crear Carga");
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
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(102, 153, 255));
		EnviarButton.setBounds(224, 290, 89, 23);
		add(EnviarButton);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(255, 153, 102));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

}
