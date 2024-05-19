package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class modificarEmpleado extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public modificarEmpleado() {
		setLayout(null);
		
		JLabel tituloActualizarPosicionLabel = new JLabel("Actualizar Posición");
		tituloActualizarPosicionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloActualizarPosicionLabel.setForeground(Color.BLACK);
		tituloActualizarPosicionLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloActualizarPosicionLabel.setBounds(0, 12, 450, 23);
		add(tituloActualizarPosicionLabel);
		
		JLabel DNILabel = new JLabel("DNI");
		DNILabel.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel.setBounds(0, 117, 105, 14);
		add(DNILabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(115, 114, 226, 20);
		add(textField);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(204, 153, 255));
		FondoTextoAltaEmpleado.setBounds(115, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
		
		JLabel PuestoLabel = new JLabel("Puesto");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(0, 149, 105, 14);
		add(PuestoLabel);
		
		JComboBox ListaPuesto = new JComboBox();
		ListaPuesto.setBounds(115, 145, 226, 22);
		add(ListaPuesto);
		
		ListaPuesto.addItem("1");
		ListaPuesto.addItem("2");
		ListaPuesto.addItem("3");
		ListaPuesto.addItem("4");
		ListaPuesto.addItem("5");
		
		JButton EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(204, 102, 255));
		EnviarButton.setBounds(180, 178, 89, 23);
		add(EnviarButton);

	}
}
