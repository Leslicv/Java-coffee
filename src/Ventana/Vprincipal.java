package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Vprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public static ArrayList<Venta> ventas= new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vprincipal frame = new Vprincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vprincipal() {
//		getContentPane().setBackground(new Color(192, 192, 192));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vprincipal.class.getResource("/Imagenes/logo.page.png")));
		setTitle("COFFEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 752);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Archivo ");
		Menu.setForeground(new Color(188, 143, 143));
		Menu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Salir ");
		MenuItem.setForeground(new Color(153, 102, 102));
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 int i=JOptionPane.showConfirmDialog(null, "Desea salir?", "Salir",JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);

			
				if(i==0) {
					JOptionPane.showMessageDialog(null, "Regresa Pronto", "Salir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}								
				
			}
		});
		Menu.add(MenuItem);
		
		JScrollPane scrollPane = new JScrollPane();
		Menu.add(scrollPane);
		
		JMenu Menu_1 = new JMenu("Mantenimiento");
		Menu_1.setForeground(new Color(188, 143, 143));
		Menu_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(Menu_1);
		
		JMenuItem MenuItem_1 = new JMenuItem("Consultar bebidas");
		MenuItem_1.setForeground(new Color(153, 102, 102));
		MenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ConsultarBebida consultar=new ConsultarBebida();
				consultar.setVisible(true);
			}
		});
		MenuItem_1.setIcon(new ImageIcon(Vprincipal.class.getResource("/Imagenes/vasobucks.jpg")));
		Menu_1.add(MenuItem_1);
		
		JMenuItem MenuItem_2 = new JMenuItem("Modificar bebida ");
		MenuItem_2.setForeground(new Color(153, 102, 102));
		MenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModificarBebidaFrame modificar=new ModificarBebidaFrame();
				modificar.setVisible(true);
			}
		});
		Menu_1.add(MenuItem_2);
		
		JMenuItem MenuItem_3 = new JMenuItem("Listar bebidas");
		MenuItem_3.setForeground(new Color(153, 102, 102));
		MenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				listarBebida listar=new listarBebida();
				listar.setVisible(true);
			}
		});
		Menu_1.add(MenuItem_3);
		
		JMenu Menu_2 = new JMenu("Ventas");
		Menu_2.setForeground(new Color(188, 143, 143));
		Menu_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(Menu_2);
		
		JMenuItem MenuItem_4 = new JMenuItem("Vender");
		MenuItem_4.setForeground(new Color(153, 102, 102));
		MenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vender vender=new Vender();
				vender.setVisible(true);
			}
			
		});
		Menu_2.add(MenuItem_4);
		
		JMenuItem MenuItem_5 = new JMenuItem("Generar reporte");
		MenuItem_5.setForeground(new Color(153, 102, 102));
		MenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				generarReporte reporte=new generarReporte();
				reporte.setVisible(true);
			}
		});
		Menu_2.add(MenuItem_5);
	
		JMenu Menu_3 = new JMenu("Configuracion");
		Menu_3.setForeground(new Color(188, 143, 143));
		Menu_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(Menu_3);
		
		JMenuItem MenuItem_6 = new JMenuItem("Configurar descuentos");
		MenuItem_6.setForeground(new Color(153, 102, 102));
		MenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				configurarDescuento configurarDescuento = new configurarDescuento();
				configurarDescuento.setVisible(true);
			}
		});
		Menu_3.add(MenuItem_6);
		
		JMenuItem MenuItem_7 = new JMenuItem("Configurar obsequios");
		MenuItem_7.setForeground(new Color(153, 102, 102));
		MenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				configurarObsequio configurarobsequio = new configurarObsequio();
				configurarobsequio.setVisible(true);
			}
		});
		Menu_3.add(MenuItem_7);
		
		JMenuItem MenuItem_8 = new JMenuItem("Configurar  cantidad optima");
		MenuItem_8.setForeground(new Color(153, 102, 102));
		MenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				configurarCantidadOptima configurarCantidadoptima = new configurarCantidadOptima();
				configurarCantidadoptima.setVisible(true);
			}
		});
		Menu_3.add(MenuItem_8);
		
		JMenuItem MenuItem_9 = new JMenuItem("Configurar cuota diaria");
		MenuItem_9.setForeground(new Color(153, 102, 102));
		MenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				configurarCuotaDiaria configurarCuota = new configurarCuotaDiaria();
				configurarCuota.setVisible(true);
			}
		});
		Menu_3.add(MenuItem_9);
		
		JMenu Menu_4 = new JMenu("Ayuda ");
		Menu_4.setForeground(new Color(188, 143, 143));
		Menu_4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(Menu_4);
		
		JMenuItem MenuItem_10 = new JMenuItem("Acerca de Tienda");
		MenuItem_10 .setForeground(new Color(153, 102, 102));
		MenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AcercadelaTienda acercadelaTienda=new AcercadelaTienda();
				acercadelaTienda.setVisible(true);
			}
		});
		Menu_4.add(MenuItem_10);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Vprincipal.class.getResource("/Imagenes/Fondo.principal.png")));
		lblNewLabel_1.setBounds(271, 10, 524, 210);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("INICIA A  REGISTRAR TUS VENTAS");
		lblNewLabel_6.setBounds(140, 280, 500, 24);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 28));
		
	}
}
