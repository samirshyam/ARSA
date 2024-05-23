package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;

import tienda.controlador.BajaProductoControlador;

import javax.swing.JTextField;
import javax.swing.JButton;

public class BajaProductoVista extends JPanel implements ActionListener {
	private JTextField textField;
	private JButton EnviarButton;
	private BajaProductoControlador a = new BajaProductoControlador();

	/**
	 * Create the panel.
	 */
	public BajaProductoVista() {
		setLayout(null);
		setSize(540, 350);
		
		JLabel tituloBajaProductoLabel = new JLabel("Baja Producto");
		tituloBajaProductoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloBajaProductoLabel.setForeground(Color.BLACK);
		tituloBajaProductoLabel.setFont(new Font("Noto Sans Arabic", Font.BOLD, 18));
		tituloBajaProductoLabel.setBounds(10, 11, 520, 23);
		add(tituloBajaProductoLabel);
		
		JLabel ProductoNombreLabel = new JLabel("Nombre");
		ProductoNombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ProductoNombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		ProductoNombreLabel.setBounds(45, 105, 105, 14);
		add(ProductoNombreLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(160, 102, 226, 20);
		add(textField);
		
		EnviarButton = new JButton("Enviar");
		EnviarButton.setBackground(new Color(255, 153, 153));
		EnviarButton.setBounds(223, 166, 89, 23);
		add(EnviarButton);
		EnviarButton.addActionListener(this);
		
		JPanel FondoTextoAltaEmpleado = new JPanel();
		FondoTextoAltaEmpleado.setBackground(new Color(255, 153, 153));
		FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
		add(FondoTextoAltaEmpleado);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String nombre = textField.getText();
		a.borrarProducto(nombre);
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Borrado");
		}catch(Exception exception) {
			JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
		}
	}

}
