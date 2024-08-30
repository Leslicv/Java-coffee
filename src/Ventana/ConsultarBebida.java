package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.UIManager;

public class ConsultarBebida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTamano;
	private JTextField txtShots;
	private JTextField txtLeche;
	private JTextField txtCrema;
	private JTextField txtPrecio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarBebida frame = new ConsultarBebida();
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
	public ConsultarBebida() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConsultarBebida.class.getResource("/Imagenes/logo.page.png")));
		setTitle("Consultar bebida ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(169, 169, 169)));
		panel.setBackground(new Color(250, 255, 255));
		panel.setBounds(239, 52, 404, 503);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CONSULTAR BEBIDA");
		lblNewLabel_6.setBounds(78, 10, 252, 24);
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblPrecio = new JLabel("Precio ($.):");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBounds(20, 140, 80, 25);
		panel.add(lblPrecio);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tamaño:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(35, 180, 80, 25);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Shots:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(40, 220, 80, 25);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Leche:");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1.setBounds(45, 260, 80, 25);
		panel.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Crema Batida ");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1_1.setBounds(10, 300, 90, 25);
		panel.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Bebida");
		lblNewLabel_4_2.setIcon(new ImageIcon(ConsultarBebida.class.getResource("/Imagenes/vasobucks.jpg")));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(20, 100, 80, 25);
		panel.add(lblNewLabel_4_2);
		
	
		
		JComboBox cboBebidas = new JComboBox();
		cboBebidas.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		cboBebidas.setFont(new Font("Monospaced", Font.PLAIN, 11));
		cboBebidas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tipo;
				tipo=leerTipo();
				mostrarResultados(tipo);
			
//				String precio,tamano,shots,leche,crema;			
//
//				if (cboBebidas.getSelectedItem().equals("Matcha Frappuccino")) {
//					txtPrecio.setText("16.00");
//					txtTamano.setText("Grande");
//					txtShots.setText("1");
//					txtLeche.setText("Evaporada");
//					txtCrema.setText("Matcha");
//					
//				}
//				else if(cboBebidas.getSelectedItem().equals("Caramel Frappuccino")) {
//					txtPrecio.setText("15.00");
//					txtTamano.setText("Grande");
//					txtShots.setText("2");
//					txtLeche.setText("Evaporada");
//					txtCrema.setText("Caramelo");
//				}
//				else if(cboBebidas.getSelectedItem().equals("Americano ")) {
//					txtPrecio.setText("9.00");
//					txtTamano.setText("Grande");
//					txtShots.setText("2");
//					txtLeche.setText("Ninguno");
//					txtCrema.setText("Ninguno");
//				}
//				else if(cboBebidas.getSelectedItem().equals("Capuccino")) {
//					txtPrecio.setText("14.00");
//					txtTamano.setText("Grande");
//					txtShots.setText("2");
//					txtLeche.setText("Evaporada");
//					txtCrema.setText("Leche");
//				}
//				else if(cboBebidas.getSelectedItem().equals("Latte Frio")) {
//					txtPrecio.setText("14.50");
//					txtTamano.setText("Grande");
//					txtShots.setText("1");
//					txtLeche.setText("Semidescremada");
//					txtCrema.setText("Avena");
			}
			int leerTipo() {
				return cboBebidas.getSelectedIndex();
			}
			 void mostrarResultados(int tip) {
				 switch(tip) {
				 	case 0:
				 		txtPrecio.setText("16.00");
						txtTamano.setText("Grande");
						txtShots.setText("1");
						txtLeche.setText("Evaporada");
						txtCrema.setText("Matcha");
						break;
				 	case 1:
				 		txtPrecio.setText("15.00");
						txtTamano.setText("Grande");
						txtShots.setText("2");
						txtLeche.setText("Evaporada");
						txtCrema.setText("Caramelo");
						break;
				 	case 2:
				 		txtPrecio.setText("9.00");
						txtTamano.setText("Grande");
						txtShots.setText("2");
						txtLeche.setText("Ninguno");
						txtCrema.setText("Ninguno");
						break;
				 	case 3:
						txtPrecio.setText("14.00");
						txtTamano.setText("Grande");
						txtShots.setText("2");
						txtLeche.setText("Evaporada");
						txtCrema.setText("Leche");
				 		break;
					default:
						txtPrecio.setText("14.50");
						txtTamano.setText("Grande");
						txtShots.setText("1");
						txtLeche.setText("Semidescremada");
						txtCrema.setText("Avena");						
				 }
			}
		});
		cboBebidas.setModel(new DefaultComboBoxModel(new String[] {"Matcha Frappuccino", "Caramel Frappuccino", "Americano ", "Capuccino", "Latte Frio"}));
		cboBebidas.setBounds(120, 103, 190, 21);
		panel.add(cboBebidas);
		
		txtPrecio = new JTextField();
		txtPrecio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtPrecio.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtPrecio.setBackground(new Color(250, 255, 255));
		txtPrecio.setBounds(120, 141, 190, 22);
		panel.add(txtPrecio);
		txtPrecio.setEditable(false);
		
		txtTamano = new JTextField();
		txtTamano.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtTamano.setEditable(false);
		txtTamano.setBackground(Color.WHITE);
		txtTamano.setBounds(120, 184, 190, 22);
		panel.add(txtTamano);
		
		txtShots = new JTextField();
		txtShots.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtShots.setEditable(false);
		txtShots.setBackground(Color.WHITE);
		txtShots.setBounds(120, 222, 190, 22);
		panel.add(txtShots);
		
		txtLeche = new JTextField();
		txtLeche.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtLeche.setEditable(false);
		txtLeche.setBackground(Color.WHITE);
		txtLeche.setBounds(120, 264, 190, 22);
		panel.add(txtLeche);
		
		txtCrema = new JTextField();
		txtCrema.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtCrema.setEditable(false);
		txtCrema.setBackground(Color.WHITE);
		txtCrema.setBounds(120, 295, 190, 22);
		panel.add(txtCrema);
		
		txtPrecio.setText("16.00");
		txtTamano.setText("Grande");
		txtShots.setText("1");
		txtLeche.setText("Evaporada");
		txtCrema.setText("Matcha");
		
		JLabel lblNewLabel_1 = new JLabel("Eliga la bebida para realizar su venta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_1.setBounds(79, 55, 284, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConsultarBebida.class.getResource("/Imagenes/frapp.png")));
		lblNewLabel.setBounds(10, 156, 110, 117);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ConsultarBebida.class.getResource("/Imagenes/caliente.png")));
		lblNewLabel_3.setBounds(10, 283, 110, 116);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBackground(new Color(105, 105, 105));
		separator.setBounds(800, 70, 200, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ConsultarBebida.class.getResource("/Imagenes/expressfrio.png")));
		lblNewLabel_2.setBounds(10, 439, 110, 116);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Frappuccinos");
		btnNewButton.setForeground(new Color(188, 143, 143));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(109, 230, 120, 60);
		contentPane.add(btnNewButton);
		
		JButton btnExpresosCalientes = new JButton("Expresos calientes");
		btnExpresosCalientes.setForeground(new Color(188, 143, 143));
		btnExpresosCalientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExpresosCalientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExpresosCalientes.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnExpresosCalientes.setBackground(Color.WHITE);
		btnExpresosCalientes.setBounds(109, 369, 120, 60);
		contentPane.add(btnExpresosCalientes);
		
		JButton btnExpresosFrios = new JButton("Expresos frios ");
		btnExpresosFrios.setForeground(new Color(188, 143, 143));
		btnExpresosFrios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExpresosFrios.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExpresosFrios.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnExpresosFrios.setBackground(Color.WHITE);
		btnExpresosFrios.setBounds(109, 503, 120, 60);
		contentPane.add(btnExpresosFrios);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal principal=new Vprincipal();
				principal.setVisible(true);
						
			}
		});
		btnCerrar.setForeground(new Color(248, 248, 255));
		btnCerrar.setBackground(new Color(188, 143, 143));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrar.setBounds(653, 120, 100, 49);
		contentPane.add(btnCerrar);
		
		
	}
}
