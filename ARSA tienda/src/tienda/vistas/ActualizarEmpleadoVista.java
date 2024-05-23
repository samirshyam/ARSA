package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.ActualizarEmpleadoControlador;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ActualizarEmpleadoVista extends JPanel implements ActionListener {
	private JTextField dniTextField;
	private JButton EnviarButton;
	private JTextField puestoTextField;
	private ActualizarEmpleadoControlador a = new ActualizarEmpleadoControlador();

	/**
	 * Create the panel.
	 */
	public ActualizarEmpleadoVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel tituloActualizarPosicionLabel = new JLabel("Actualizar Posición");
		tituloActualizarPosicionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloActualizarPosicionLabel.setForeground(Color.BLACK);
		tituloActualizarPosicionLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloActualizarPosicionLabel.setBounds(10, 11, 520, 23);
		add(tituloActualizarPosicionLabel);
		
		JLabel DNILabel = new JLabel("DNI");
		DNILabel.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel.setBounds(39, 128, 105, 14);
		add(DNILabel);
		
		dniTextField = new JTextField();
		dniTextField.setHorizontalAlignment(SwingConstants.CENTER);
		dniTextField.setColumns(10);
		dniTextField.setBounds(154, 125, 226, 20);
		add(dniTextField);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(102, 153, 255));
		FondoTextoAltaEmpleado.setBounds(154, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
		
		JLabel PuestoLabel = new JLabel("Puesto");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(39, 160, 105, 14);
		add(PuestoLabel);
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(102, 153, 255));
		EnviarButton.setBounds(221, 224, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);
		
		puestoTextField = new JTextField();
		puestoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		puestoTextField.setColumns(10);
		puestoTextField.setBounds(154, 158, 226, 20);
		add(puestoTextField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String dni = dniTextField.getText();
		String puesto = puestoTextField.getText();
		a.actualizarPosicion(dni, puesto);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Modificacion Correcta");
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
		}
	}
}
