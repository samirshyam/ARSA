package tienda.vistas;

import javax.swing.JPanel;
import tienda.controlador.AltaEmpleadoControlador;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class AltaEmpleadoVista extends JPanel implements ActionListener {
	private JTextField DNItextfield;
	private JTextField NombretextField;
	private JTextField TipoEmpleadotextField;
	private JTextField SueldotextField;
	private JTextField TurnotextField;
	private JButton EnviarButton;
	private AltaEmpleadoControlador a = new AltaEmpleadoControlador();
	

	/**
	 * Create the panel.
	 */
	public AltaEmpleadoVista() {
		setLayout(null);
		setSize(540, 350);
	
		
		JLabel tituloAltaEmpleadoLabel = new JLabel("Alta Empleado");
		tituloAltaEmpleadoLabel.setForeground(new Color(0, 0, 0));
		tituloAltaEmpleadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloAltaEmpleadoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloAltaEmpleadoLabel.setBounds(10, 11, 520, 23);
		add(tituloAltaEmpleadoLabel);
		
		JLabel DNILabel = new JLabel("DNI");
		DNILabel.setHorizontalAlignment(SwingConstants.CENTER);
		DNILabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		DNILabel.setBounds(45, 105, 105, 14);
		add(DNILabel);
		
		DNItextfield = new JTextField();
		DNItextfield.setToolTipText("");
		DNItextfield.setHorizontalAlignment(SwingConstants.CENTER);
		DNItextfield.setBounds(160, 102, 226, 20);
		add(DNItextfield);
		DNItextfield.setColumns(10);
		
		JLabel NombreLabel = new JLabel("Nombre");
		NombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		NombreLabel.setBounds(45, 135, 105, 14);
		add(NombreLabel);
		
		NombretextField = new JTextField();
		NombretextField.setHorizontalAlignment(SwingConstants.CENTER);
		NombretextField.setColumns(10);
		NombretextField.setBounds(160, 133, 226, 20);
		add(NombretextField);
		
		JLabel PuestoLabel = new JLabel("Puesto");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(45, 167, 105, 14);
		add(PuestoLabel);
		
		TipoEmpleadotextField = new JTextField();
		TipoEmpleadotextField.setHorizontalAlignment(SwingConstants.CENTER);
		TipoEmpleadotextField.setColumns(10);
		TipoEmpleadotextField.setBounds(160, 164, 226, 20);
		add(TipoEmpleadotextField);
		
		JLabel SueldoLabel = new JLabel("Sueldo");
		SueldoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SueldoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		SueldoLabel.setBounds(45, 198, 105, 14);
		add(SueldoLabel);
		
		SueldotextField = new JTextField();
		SueldotextField.setHorizontalAlignment(SwingConstants.CENTER);
		SueldotextField.setColumns(10);
		SueldotextField.setBounds(160, 195, 226, 20);
		add(SueldotextField);
		
		JLabel TurnoLabel = new JLabel("Turno");
		TurnoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TurnoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		TurnoLabel.setBounds(45, 229, 105, 14);
		add(TurnoLabel);
		
		TurnotextField = new JTextField();
		TurnotextField.setHorizontalAlignment(SwingConstants.CENTER);
		TurnotextField.setColumns(10);
		TurnotextField.setBounds(160, 226, 226, 20);
		add(TurnotextField);
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(102, 153, 255));
		EnviarButton.addActionListener(this);
		EnviarButton.setBounds(224, 290, 89, 23);
		add(EnviarButton);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(102, 153, 255));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String dni = DNItextfield.getText();
		String nombre = NombretextField.getText();
		String puesto = TipoEmpleadotextField.getText();
		Double sueldo = Double.parseDouble(SueldotextField.getText());
		String turno = TurnotextField.getText();
		a.altaEmpleado(nombre, dni, puesto, sueldo, turno);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
		}catch (Exception exception) {
			System.out.println(exception.getMessage());
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");

		}
	}
}
