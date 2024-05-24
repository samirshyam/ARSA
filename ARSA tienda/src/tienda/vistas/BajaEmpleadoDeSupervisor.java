package tienda.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import tienda.controlador.BajaEmpleadoControlador;

public class BajaEmpleadoDeSupervisor extends JPanel implements ActionListener {

	private JTextField textField;
	private BajaEmpleadoControlador a = new BajaEmpleadoControlador();
	private JButton EnviarButton;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public BajaEmpleadoDeSupervisor() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel TituloBajaEmpleadoLabel = new JLabel("Baja Empleado Supervisor");
		TituloBajaEmpleadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TituloBajaEmpleadoLabel.setForeground(Color.BLACK);
		TituloBajaEmpleadoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		TituloBajaEmpleadoLabel.setBounds(10, 11, 520, 23);
		add(TituloBajaEmpleadoLabel);
		
		JLabel DNILabel_ = new JLabel("DNI Supervisor");
		DNILabel_.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel_.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel_.setBounds(45, 105, 105, 14);
		add(DNILabel_);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(160, 102, 226, 20);
		add(textField);
		
		JPanel FondoTextoBajaEmpleado = new JPanel();
		FondoTextoBajaEmpleado.setBackground(new Color(102, 153, 255));
		FondoTextoBajaEmpleado.setBounds(127, 11, 276, 23);
		add(FondoTextoBajaEmpleado);
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(102, 153, 255));
		EnviarButton.setBounds(225, 203, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);
		
		JLabel DNILabel__1 = new JLabel("DNI Empleado");
		DNILabel__1.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel__1.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel__1.setBounds(45, 148, 105, 14);
		add(DNILabel__1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(160, 145, 226, 20);
		add(textField_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String dni_supervisor = textField.getText();
		String dni_empleado = textField_1.getText();
		a.borrarEmpleadoBajoSupervisor(a.buscarEmpleado(dni_supervisor), dni_empleado);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
		}
	}

}
