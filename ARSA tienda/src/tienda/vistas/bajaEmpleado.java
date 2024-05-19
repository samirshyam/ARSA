package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class bajaEmpleado extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public bajaEmpleado() {
		setLayout(null);
		
		JLabel TituloBajaEmpleadoLabel = new JLabel("Baja Empleado");
		TituloBajaEmpleadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TituloBajaEmpleadoLabel.setForeground(Color.BLACK);
		TituloBajaEmpleadoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		TituloBajaEmpleadoLabel.setBounds(0, 12, 450, 23);
		add(TituloBajaEmpleadoLabel);
		
		JLabel DNILabel_ = new JLabel("DNI");
		DNILabel_.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel_.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel_.setBounds(0, 136, 105, 14);
		add(DNILabel_);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(115, 133, 226, 20);
		add(textField);
		
		JPanel FondoTextoBajaEmpleado = new JPanel();
		FondoTextoBajaEmpleado.setBackground(new Color(255, 153, 153));
		FondoTextoBajaEmpleado.setBounds(115, 11, 226, 23);
		add(FondoTextoBajaEmpleado);
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(255, 153, 153));
		EnviarButton.setBounds(178, 164, 89, 23);
		add(EnviarButton);

	}

}
