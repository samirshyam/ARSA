package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.AltaEmpleadoControlador;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class AltaSupervisorVista extends JPanel implements ActionListener {
	private JTextField DNItextfield;
	private JTextField NombretextField;
	private JTextField TipoEmpleadotextField;
	private JTextField SueldotextField;
	private JTextField TurnotextField;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSiguiente;
	private JButton btnAadir;
	private AltaEmpleadoControlador a = new AltaEmpleadoControlador();
	private JTextField seccionTextField;

	public AltaSupervisorVista() {
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
		DNILabel.setBounds(45, 65, 105, 14);
		add(DNILabel);
		
		DNItextfield = new JTextField();
		DNItextfield.setHorizontalAlignment(SwingConstants.CENTER);
		DNItextfield.setColumns(10);
		DNItextfield.setBounds(160, 62, 226, 20);
		add(DNItextfield);
		
		JLabel NombreLabel = new JLabel("Nombre");
		NombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		NombreLabel.setBounds(45, 95, 105, 14);
		add(NombreLabel);
		
		NombretextField = new JTextField();
		NombretextField.setHorizontalAlignment(SwingConstants.CENTER);
		NombretextField.setColumns(10);
		NombretextField.setBounds(160, 93, 226, 20);
		add(NombretextField);
		
		JLabel PuestoLabel = new JLabel("Puesto y Seccion");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(45, 127, 105, 14);
		add(PuestoLabel);
		
		TipoEmpleadotextField = new JTextField();
		TipoEmpleadotextField.setHorizontalAlignment(SwingConstants.CENTER);
		TipoEmpleadotextField.setColumns(10);
		TipoEmpleadotextField.setBounds(160, 124, 105, 20);
		add(TipoEmpleadotextField);
		
		JLabel SueldoLabel = new JLabel("Sueldo");
		SueldoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SueldoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		SueldoLabel.setBounds(45, 158, 105, 14);
		add(SueldoLabel);
		
		SueldotextField = new JTextField();
		SueldotextField.setHorizontalAlignment(SwingConstants.CENTER);
		SueldotextField.setColumns(10);
		SueldotextField.setBounds(160, 155, 226, 20);
		add(SueldotextField);
		
		JLabel TurnoLabel = new JLabel("Turno");
		TurnoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TurnoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		TurnoLabel.setBounds(45, 189, 105, 14);
		add(TurnoLabel);
		
		TurnotextField = new JTextField();
		TurnotextField.setHorizontalAlignment(SwingConstants.CENTER);
		TurnotextField.setColumns(10);
		TurnotextField.setBounds(160, 186, 226, 20);
		add(TurnotextField);
		
		btnSiguiente = new JButton("Enviar");
		btnSiguiente.setBackground(new Color(255, 51, 102));
		btnSiguiente.setBounds(224, 216, 89, 23);
		add(btnSiguiente);
		btnSiguiente.addActionListener(this);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(255, 51, 102));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
		
		btnAadir = new JButton("Añadir Empleado");
		btnAadir.setBackground(new Color(102, 153, 255));
		btnAadir.setBounds(160, 313, 226, 23);
		add(btnAadir);
		btnAadir.addActionListener(this);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(160, 248, 226, 8);
		add(separator);
		
		JLabel lblDniEmpleado = new JLabel("DNI Supervisor");
		lblDniEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDniEmpleado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDniEmpleado.setBounds(160, 260, 96, 14);
		add(lblDniEmpleado);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(160, 280, 96, 20);
		add(textField);
		
		JLabel lblDniEmpleado_1 = new JLabel("DNI Empleado");
		lblDniEmpleado_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDniEmpleado_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDniEmpleado_1.setBounds(291, 260, 95, 14);
		add(lblDniEmpleado_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(291, 280, 95, 20);
		add(textField_1);
		
		seccionTextField = new JTextField();
		seccionTextField.setHorizontalAlignment(SwingConstants.CENTER);
		seccionTextField.setColumns(10);
		seccionTextField.setBounds(281, 124, 105, 20);
		add(seccionTextField);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSiguiente) {
			try {
				String dni = DNItextfield.getText();
				String nombre = NombretextField.getText();
				String puesto = TipoEmpleadotextField.getText();
				Double sueldo = Double.parseDouble(SueldotextField.getText());
				String turno = TurnotextField.getText();
				String seccion = seccionTextField.getText();
				a.altaSupervisor(nombre, dni, puesto, sueldo, turno, seccion);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnSiguiente),"Alta Correcta");
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnSiguiente),"Formato incorrecto"); 	
			}
		}
		else if (e.getSource() == btnAadir) {
			try {
				String dniSupervisor=textField.getText();
				String dniEmpleado=textField_1.getText();
				a.annadirEmpleadoBajoSupervisor(a.buscarEmpleado(dniSupervisor), dniEmpleado);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnAadir),"Alta Correcta");
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnAadir),"Formato incorrecto"); 	
			}
		}
	}
}
