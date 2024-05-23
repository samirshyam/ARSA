package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.BajaEmpleadoControlador;

import javax.swing.JTextField;
import javax.swing.JButton;

public class BajaEmpleadoVista extends JPanel implements ActionListener {
	private JTextField textField;
	private BajaEmpleadoControlador a = new BajaEmpleadoControlador();
	private JButton EnviarButton;

	/**
	 * Create the panel.
	 */
	public BajaEmpleadoVista() {
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
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(255, 153, 153));
		EnviarButton.setBounds(178, 164, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String dni = textField.getText();
		a.borrarEmpleado(dni);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
		}
	}

}
