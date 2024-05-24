package tienda.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import tienda.controlador.AltaCargaControlador;
import tienda.modelo.Producto;

public class CrearCargaVista extends JPanel implements ActionListener {
    private JTextField textField;
    private ArrayList<Producto> listaProductos;
    private JButton EnviarButton;
    private AltaCargaControlador a = new AltaCargaControlador();

    /**
     * Create the panel.
     */
    public CrearCargaVista() {
        setLayout(null);
        setSize(540, 350);

        JLabel lblCrearCarga = new JLabel("Crear Carga");
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

        EnviarButton = new JButton("Enviar");
        EnviarButton.setBackground(new Color(102, 153, 255));
        EnviarButton.setBounds(224, 290, 89, 23);
        add(EnviarButton);
        EnviarButton.addActionListener(this);

        JPanel FondoTextoAltaEmpleado = new JPanel();
        FondoTextoAltaEmpleado.setBackground(new Color(255, 153, 102));
        FondoTextoAltaEmpleado.setBounds(160, 11, 226, 23);
        add(FondoTextoAltaEmpleado);

        // Add a new button for opening CSV files
        JButton openCsvButton = new JButton("Open CSV File");
        openCsvButton.setBounds(160, 153, 226, 20);
        add(openCsvButton);
        
        JLabel lblArchivoCsv = new JLabel("Archivo CSV");
        lblArchivoCsv.setHorizontalAlignment(SwingConstants.CENTER);
        lblArchivoCsv.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblArchivoCsv.setBounds(45, 157, 105, 14);
        add(lblArchivoCsv);
        openCsvButton.addActionListener(e -> openCsvFile());
    }

    private void openCsvFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getAbsolutePath();
            listaProductos = readProductosFromCsv(fileName);
            
        }
    }

    public static ArrayList<Producto> readProductosFromCsv(String fileName) {
        ArrayList<Producto> productos = new ArrayList<>();
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] productoData = line.split(csvSplitBy);
                
                String nombreProducto = productoData[0];
                String seccionProducto = productoData[1];
                String fechaCaducidad = productoData[2];
                double precio = Double.parseDouble(productoData[3]);
                int stock = Integer.parseInt(productoData[4]);

                Producto producto = new Producto(nombreProducto, seccionProducto, fechaCaducidad, precio, stock);
                producto.setCodProducto(producto.getSeccionProducto().substring(0,4)+"_"+producto.getNombreProducto());
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(productos);
        return productos;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == EnviarButton ) {
			try {
				String dni = textField.getText();
				a.crearCarga(dni, listaProductos);
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Alta Correcta");
			}catch(Exception exception) {
				System.out.println(exception.getMessage());
				JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(EnviarButton),"Formato incorrecto");
			}
		}
	}
}
