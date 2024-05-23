package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SupervisorAltaEmpleadoVista extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public SupervisorAltaEmpleadoVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel lblAltaSupervisor = new JLabel("Alta Supervisor");
		lblAltaSupervisor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaSupervisor.setForeground(Color.BLACK);
		lblAltaSupervisor.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		lblAltaSupervisor.setBounds(10, 11, 520, 23);
		add(lblAltaSupervisor);
		
		JLabel DNILabel = new JLabel("DNI");
		DNILabel.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel.setBounds(45, 105, 105, 14);
		add(DNILabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(160, 102, 226, 20);
		add(textField);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBackground(new Color(255, 51, 102));
		btnSiguiente.setBounds(224, 290, 89, 23);
		add(btnSiguiente);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(255, 51, 102));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
	}

}
