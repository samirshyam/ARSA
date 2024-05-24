package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.AltaFacturaControlador;
import tienda.modelo.Factura;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class CrearFacturaVista extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField textField_2;
	private JButton EnviarButton;
	private JButton EnviarButton_1;
	private AltaFacturaControlador a = new AltaFacturaControlador();
	private Factura factura;
	private JButton FinalizarButton;

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
		
		JLabel DNILabel = new JLabel("DNI Empleado");
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
		
		JLabel PuestoLabel = new JLabel("Nombre Producto");
		PuestoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PuestoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		PuestoLabel.setBounds(45, 233, 105, 14);
		add(PuestoLabel);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(160, 230, 226, 20);
		add(textField_2);
				
		EnviarButton_1 = new JButton("Annadir");
		EnviarButton_1.setBackground(new Color(153, 51, 255));
		EnviarButton_1.setBounds(224, 260, 89, 23);
		add(EnviarButton_1);
		EnviarButton_1.addActionListener(this);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(153, 51, 255));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);
		
		EnviarButton = new JButton("Crear");
		EnviarButton.setBackground(new Color(153, 51, 255));
		EnviarButton.setBounds(224, 132, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 188, 443, 14);
		add(separator);
		
		FinalizarButton = new JButton("FINALIZAR");
		FinalizarButton.setBackground(new Color(153, 51, 255));
		FinalizarButton.setBounds(224, 301, 89, 23);
		add(FinalizarButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == EnviarButton) {
			try {
				String dni=textField.getText();
				factura=a.crearFactura(dni);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
				EnviarButton.setVisible(false);
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
			}
		}
		else if (e.getSource() == EnviarButton_1) {
			try {
				String nombre_producto=textField_2.getText();
				a.annadirProductoFactura(factura, nombre_producto);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
			}
		}
		else if (e.getSource() == FinalizarButton) {
			try {
				a.precioFactura(factura);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Factura Finalizada");
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
	}
}
