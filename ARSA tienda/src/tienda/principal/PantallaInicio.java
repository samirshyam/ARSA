package tienda.principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;

import tienda.vistas.ActualizarEmpleadoVista;
import tienda.vistas.ActualizarProductoVista;
import tienda.vistas.AltaEmpleadoVista;
import tienda.vistas.AltaProductoVista;
import tienda.vistas.BajaEmpleadoVista;
import tienda.vistas.BajaProductoVista;
import tienda.vistas.ListaCargasVista;
import tienda.vistas.ListaEmpleadosVista;
import tienda.vistas.ListaFacturasVista;
import tienda.vistas.ListaProductosVista;

public class PantallaInicio extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JMenuItem DarAltaEmpleadosMenuItem;
    private JMenuItem DarBajaEmpleadosNewMenuItem;
    private JMenuItem ActualizarPosicionEmpleadosMenuItem;
    private JMenuItem DarAltaProductoMenuItem;
    private JMenuItem DarBajaProductoMenuItem;
    private JMenuItem ActualizarProductoMenuItem;
    private JMenuItem CrearFacturaMenuItem;
    private JMenuItem CrearCargaMenuItem;
    private JMenuItem ListaEmpleadosMenuItem;
    private JMenuItem ListaProductosMenuItem;
    private JMenuItem ListaFacturasMenuItem;
    private JMenuItem ListaCargasMenuItem;

    private JPanel Inicio;
    private JLabel FondoLabel;
    private JMenu SupervisorMenu;
    private JMenuItem AltaSupervisorMenuItem;
    private JMenuItem BajaEmpleadoSupervisorMenuItem;

    /**
     * Create the frame.
     */
    public PantallaInicio() {
        setTitle("ARSA");
        setForeground(new Color(128, 128, 192));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 540, 400);

  
        
        /* JFRAME AREA FROM HERE */

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
                JMenu InicioMenu = new JMenu("Inicio");
                InicioMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
                InicioMenu.setForeground(new Color(255, 0, 0));
                InicioMenu.setBackground(new Color(255, 255, 255));
                menuBar.add(InicioMenu);
                
                        // Creating a menu item for "Inicio"
                        JMenuItem inicioMenuItem = new JMenuItem("Inicio");
                        inicioMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 14));
                        inicioMenuItem.setForeground(new Color(255, 0, 0));
                        inicioMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
                        InicioMenu.add(inicioMenuItem);
                        inicioMenuItem.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                            	System.out.println("Inicio...");
                                setContentPane(Inicio);
                                revalidate();
                                repaint();
                            }
                        });

        JMenu EmpleadosMenu = new JMenu("Empleados");
        menuBar.add(EmpleadosMenu);

        DarAltaEmpleadosMenuItem = new JMenuItem("Alta Empleado");
        DarAltaEmpleadosMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        EmpleadosMenu.add(DarAltaEmpleadosMenuItem);
        DarAltaEmpleadosMenuItem.addActionListener(this);

        DarBajaEmpleadosNewMenuItem = new JMenuItem("Baja Empleado");
        DarBajaEmpleadosNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        EmpleadosMenu.add(DarBajaEmpleadosNewMenuItem);
        DarBajaEmpleadosNewMenuItem.addActionListener(this);
        
        JSeparator separator = new JSeparator();
        EmpleadosMenu.add(separator);

        ActualizarPosicionEmpleadosMenuItem = new JMenuItem("Actualizar Posición");
        ActualizarPosicionEmpleadosMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        EmpleadosMenu.add(ActualizarPosicionEmpleadosMenuItem);
        ActualizarPosicionEmpleadosMenuItem.addActionListener(this);
        
        SupervisorMenu = new JMenu("Supervisores");
        menuBar.add(SupervisorMenu);
        
        AltaSupervisorMenuItem = new JMenuItem("Alta Supervisor");
        AltaSupervisorMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        SupervisorMenu.add(AltaSupervisorMenuItem);
        AltaSupervisorMenuItem.addActionListener(this);
        
        BajaEmpleadoSupervisorMenuItem = new JMenuItem("Baja Empleado por Supervisor");
        BajaEmpleadoSupervisorMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        SupervisorMenu.add(BajaEmpleadoSupervisorMenuItem);
        BajaEmpleadoSupervisorMenuItem.addActionListener(this);

        JMenu ProductosMenu = new JMenu("Productos");
        menuBar.add(ProductosMenu);

        DarAltaProductoMenuItem = new JMenuItem("Alta Producto");
        DarAltaProductoMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ProductosMenu.add(DarAltaProductoMenuItem);
        DarAltaProductoMenuItem.addActionListener(this);

        DarBajaProductoMenuItem = new JMenuItem("Baja Producto");
        DarBajaProductoMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ProductosMenu.add(DarBajaProductoMenuItem);
        DarBajaProductoMenuItem.addActionListener(this);
        
        JSeparator separator_1 = new JSeparator();
        ProductosMenu.add(separator_1);

        ActualizarProductoMenuItem = new JMenuItem("Actualizar Producto");
        ActualizarProductoMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ProductosMenu.add(ActualizarProductoMenuItem);
        ActualizarProductoMenuItem.addActionListener(this);

        JMenu FacturasMenu = new JMenu("Facturas");
        FacturasMenu.setHorizontalAlignment(SwingConstants.LEFT);
        menuBar.add(FacturasMenu);

        CrearFacturaMenuItem = new JMenuItem("Crear Factura");
        CrearFacturaMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        FacturasMenu.add(CrearFacturaMenuItem);
        CrearFacturaMenuItem.addActionListener(this);

        JMenu CargaMenu = new JMenu("Cargas");
        menuBar.add(CargaMenu);

        CrearCargaMenuItem = new JMenuItem("CrearCarga");
        CrearCargaMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        CargaMenu.add(CrearCargaMenuItem);
        CrearCargaMenuItem.addActionListener(this);

        JMenu ListasMenu = new JMenu("Listas");
        menuBar.add(ListasMenu);

        ListaEmpleadosMenuItem = new JMenuItem("Lista Empleados");
        ListaEmpleadosMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ListasMenu.add(ListaEmpleadosMenuItem);
        ListaEmpleadosMenuItem.addActionListener(this);

        ListaProductosMenuItem = new JMenuItem("Lista Productos");
        ListaProductosMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ListasMenu.add(ListaProductosMenuItem);
        ListaProductosMenuItem.addActionListener(this);

        ListaFacturasMenuItem = new JMenuItem("Lista Facturas");
        ListaFacturasMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ListasMenu.add(ListaFacturasMenuItem);
        ListaFacturasMenuItem.addActionListener(this);

        ListaCargasMenuItem = new JMenuItem("Lista Cargas");
        ListaCargasMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
        ListasMenu.add(ListaCargasMenuItem);
        ListaCargasMenuItem.addActionListener(this);

        /* CONTENT PANE AREA FROM HERE */

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel FondoLabel = new JLabel("");
        FondoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        FondoLabel.setIcon(new ImageIcon("C:\\Users\\samee\\Downloads\\image_2024-05-23_233216423.jpg"));
        FondoLabel.setBounds(-121, -10, 767, 360);
        contentPane.add(FondoLabel);

        Inicio = contentPane; // Store the initial content pane
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DarAltaEmpleadosMenuItem) {
            System.out.println("Alta Empleado");
            AltaEmpleadoVista a = new AltaEmpleadoVista();
            setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == DarAltaProductoMenuItem){
        	System.out.println("Alta Producto");
        	AltaProductoVista a = new AltaProductoVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == DarBajaEmpleadosNewMenuItem) {
        	System.out.println("Baja Empleado");
        	BajaEmpleadoVista a = new BajaEmpleadoVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == DarBajaProductoMenuItem) {
        	System.out.println("Baja Producro");
        	BajaProductoVista a = new BajaProductoVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ActualizarPosicionEmpleadosMenuItem) {
        	System.out.println("Actualizar Posicion");
        	ActualizarEmpleadoVista a = new ActualizarEmpleadoVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ActualizarProductoMenuItem) {
        	System.out.println("Actualizar Producto");
        	ActualizarProductoVista a = new ActualizarProductoVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ListaEmpleadosMenuItem) {
        	System.out.println("Listando Empleados");
        	ListaEmpleadosVista a = new ListaEmpleadosVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ListaProductosMenuItem) {
        	System.out.println("Listando Productos");
        	ListaProductosVista a = new ListaProductosVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ListaFacturasMenuItem) {
        	System.out.println("Listando Facturas");
        	ListaFacturasVista a = new ListaFacturasVista();
        	setContentPane(a);
            setVisible(true);
        }
        else if (e.getSource() == ListaCargasMenuItem) {
        	System.out.println("Listando Cargas");
        	ListaCargasVista a = new ListaCargasVista();
        	setContentPane(a);
            setVisible(true);
        }
    }
}
