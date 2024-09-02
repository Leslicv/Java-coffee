package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;

public class ModificarBebidaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ArrayList<Bebida> bebidas=new ArrayList<>();
	public JComboBox cboBebidas;
	ModificarBebidaFrame yo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarBebidaFrame frame = new ModificarBebidaFrame();
					frame.setVisible(true);
					}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	 void actualizarCombo() {
		 String [] arreglodeNombre=new String[bebidas.size()];
		 for (int i = 0; i < arreglodeNombre.length; i++) {
			 arreglodeNombre[i]=bebidas.get(i).nombre;
		}
		 cboBebidas.setModel(new DefaultComboBoxModel(arreglodeNombre));
	 }
	public ModificarBebidaFrame() {
		this.yo = this;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ModificarBebidaFrame.class.getResource("/Imagenes/logo.page.png")));
		setTitle("Modificar Bebida ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bebidas=new ArrayList<>();
		bebidas.add(new Bebida("Matcha Frappuccino","Grande",16.0,1,"Evaporada","Matcha"));
		bebidas.add(new Bebida("Caramel Frappuccino","Grande",15.0,2,"Evaporada","Caramelo"));
		bebidas.add(new Bebida("Americano", "Grande", 9.0, 2, "Ninguno", "Ninguno"));
	    bebidas.add(new Bebida("Capuccino", "Grande", 14.0, 2, "Evaporada", "Leche"));
	    bebidas.add(new Bebida("Latte Frio", "Grande", 14.5, 1, "Semidescremada", "Avena"));
	    bebidas.add(new Bebida("Mocca", "Grande", 12.5, 1, "Semidescremada", "Moca"));

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(5, 20, 733, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("MODIFICA LA BEBIDA");
		lblNewLabel_6.setBounds(20, 0, 335, 24);
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblPrecio = new JLabel("Precio ($.):");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBounds(20, 100, 80, 25);
		panel.add(lblPrecio);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tamaño:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(35, 140, 80, 25);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Shots:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(40, 180, 80, 25);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Leche:");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1.setBounds(45, 220, 80, 25);
		panel.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Crema Batida ");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1_1.setBounds(10, 260, 90, 25);
		panel.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Bebida");
		lblNewLabel_4_2.setIcon(new ImageIcon(ConsultarBebida.class.getResource("/Imagenes/vasobucks.jpg")));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(20, 60, 80, 25);
		panel.add(lblNewLabel_4_2);
		
		JTextField txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtPrecio.setBounds(120, 100, 150, 22);
		panel.add(txtPrecio);
		
		JTextField txtTamano = new JTextField();
		txtTamano.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtTamano.setBounds(120, 140, 150, 22);
		panel.add(txtTamano);
		
		JTextField txtShots = new JTextField();
		txtShots.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtShots.setBounds(120, 180, 150, 22);
		panel.add(txtShots);
		
		JTextField txtLeche = new JTextField();
		txtLeche.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtLeche.setBounds(120, 220, 150, 22);
		panel.add(txtLeche);
		
		JTextField txtCrema = new JTextField();
		txtCrema.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtCrema.setBounds(120, 260, 150, 22);
		panel.add(txtCrema);
		
		cboBebidas = new JComboBox();
		cboBebidas.setFont(new Font("Monospaced", Font.PLAIN, 10));
		cboBebidas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tipo;
				tipo=leerTipo();
				mostrarResultados(tipo);
			}
			int leerTipo() {
				return cboBebidas.getSelectedIndex();
			}
			void mostrarResultados(int tipo) {
				 Bebida bebidaelegida= bebidas.get(tipo);
				  txtPrecio.setText(String.valueOf(bebidaelegida.precio));
			        txtTamano.setText(bebidaelegida.tamano);
			        txtShots.setText(String.valueOf(bebidaelegida.shots));
			        txtLeche.setText(bebidaelegida.leche);			       
			        txtCrema.setText(bebidaelegida.crema);
				 
				 
//				 switch(tip) {
//				 	case 0:
//				 		txtPrecio.setText("16.00");
//						txtTamano.setText("Grande");
//						txtShots.setText("1");
//						txtLeche.setText("Evaporada");
//						txtCrema.setText("Matcha");
//						break;
//				 	case 1:
//				 		txtPrecio.setText("15.00");
//						txtTamano.setText("Grande");
//						txtShots.setText("2");
//						txtLeche.setText("Evaporada");
//						txtCrema.setText("Caramelo");
//						break;
//				 	case 2:
//				 		txtPrecio.setText("9.00");
//						txtTamano.setText("Grande");
//						txtShots.setText("2");
//						txtLeche.setText("Ninguno");
//						txtCrema.setText("Ninguno");
//						break;
//				 	case 3:
//						txtPrecio.setText("14.00");
//						txtTamano.setText("Grande");
//						txtShots.setText("2");
//						txtLeche.setText("Evaporada");
//						txtCrema.setText("Leche");
//				 		break;
//					default:
//						txtPrecio.setText("14.50");
//						txtTamano.setText("Grande");
//						txtShots.setText("1");
//						txtLeche.setText("Semidescremada");
//						txtCrema.setText("Avena");
//						
//				 }
			 }
		});
				
		String []arregloDeStringsDeBebidas=new String[bebidas.size()];
		for(int i=0; i<bebidas.size(); i++) {
			arregloDeStringsDeBebidas[i]=bebidas.get(i).nombre;
			
		}
		

		cboBebidas.setModel(new DefaultComboBoxModel(arregloDeStringsDeBebidas));
		cboBebidas.setBounds(120, 63, 150, 21);
		panel.add(cboBebidas);
		
		
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal principal=new Vprincipal();
				principal.setVisible(true);
						
			}
		});
		btnCerrar.setForeground(new Color(248, 248, 255));
		btnCerrar.setBackground(new Color(188, 143, 143));
		btnCerrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCerrar.setBounds(508, 380, 100, 30);
		contentPane.add(btnCerrar);

		txtPrecio.setText("16.00");
		txtTamano.setText("Grande");
		txtShots.setText("1");
		txtLeche.setText("Evaporada");
		txtCrema.setText("Matcha");
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice;
				indice=leerIndex();
				modificarBebida(indice);
				JOptionPane.showMessageDialog(null, "Informacion guardada", "Modificacion de bebida",JOptionPane.INFORMATION_MESSAGE);
//				String ntamano,nleche,ncrema;
//				double nprecio; int nshot;
//				nprecio=modificarNuevoPrecio();
//				ntamano=modificarNuevoTamano();
//				nshot=modificarNuevoShot();
//				nleche=modificarNuevaLeche();
//				ncrema=modificarNuevaCrema();	
//				txtPrecio.setEditable(false);
//				txtTamano.setEditable(false);
//				txtShots.setEditable(false);
//				txtLeche.setEditable(false);
//				txtCrema.setEditable(false);
			}
			int leerIndex() {
				return cboBebidas.getSelectedIndex();
				}
			void modificarBebida(int index) {
				Bebida bebidamodificada=bebidas.get(index);
				bebidamodificada.setPrecio(Double.parseDouble(txtPrecio.getText()));
				bebidamodificada.setTamano(txtTamano.getText());
				bebidamodificada.shots=Integer.parseInt(txtShots.getText());
				bebidamodificada.setLeche(txtLeche.getText());
				bebidamodificada.setCrema(txtCrema.getText());				
		}


//			double modificarNuevoPrecio() {
//				return Double.parseDouble(txtPrecio.getText());
//			}
//			String modificarNuevoTamano() {
//				return txtTamano.getText();
//			}
//			int modificarNuevoShot() {
//				return Integer.parseInt(txtShots.getText());
//			}
//			String modificarNuevaLeche() {
//				return txtLeche.getText();
//			}
//			String modificarNuevaCrema() {
//				return txtCrema.getText();
//			}
//
//	
		});
		
		btnGuardar.setForeground(new Color(248, 248, 255));
		btnGuardar.setBackground(new Color(188, 143, 143));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(638, 380, 100, 30);
		contentPane.add(btnGuardar);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Modifica la bebida para realizar su venta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_1.setBounds(20, 30, 284, 13);
		panel.add(lblNewLabel_1);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarBebidaFrame agregar=new AgregarBebidaFrame(bebidas,yo );
				agregar.setVisible(true);
			}
		});
		btnAgregar.setForeground(new Color(248, 248, 255));
		btnAgregar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAgregar.setBackground(new Color(188, 143, 143));
		btnAgregar.setBounds(369, 380, 100, 30);
		contentPane.add(btnAgregar);
		
//		JButton btnActualizar = new JButton("Actualizar");
//		btnActualizar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				actualizarCombo();
//				
//			}
//		});
//		btnActualizar.setForeground(new Color(248, 248, 255));
//		btnActualizar.setFont(new Font("Arial", Font.BOLD, 12));
//		btnActualizar.setBackground(new Color(188, 143, 143));
//		btnActualizar.setBounds(233, 380, 100, 30);
//		contentPane.add(btnActualizar);
	
	
		
		}
}
