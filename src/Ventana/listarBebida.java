package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.util.ArrayList;

public class listarBebida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String bebida0,bebida2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listarBebida frame = new listarBebida();
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
	public listarBebida() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(listarBebida.class.getResource("/Imagenes/logo.page.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Listar Bebidas");
		setBounds(100, 100, 828, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 380, 380);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("ToolBar.light"));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(textArea);

		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal principal=new Vprincipal();
				principal.setVisible(true);
						
			}
		});
		
		
		contentPane.setLayout(null);
		btnCerrar.setForeground(new Color(248, 248, 255));
		btnCerrar.setBackground(new Color(188, 143, 143));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrar.setBounds(400, 387, 100, 30);
		contentPane.add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			

//				textArea.setText("LISTADO DE BEBIDAS"+"\n");
//				textArea.append("\n");
//				textArea.append("Bebida\t: Matcha Frappuccino"+"\n");
//				textArea.append("Precio\t: $. 16.00"+"\n");
//				textArea.append("Tamano\t: Grande"+"\n");
//				textArea.append("Shots\t: 1"+"\n");
//				textArea.append("Leche\t: Evaporada"+"\n");
//				textArea.append("Crema\t: Matcha"+"\n");
//				textArea.append("\n");
//				textArea.append("Bebida\t: Caramel Frappuccino"+"\n");
//				textArea.append("Precio\t: $. 15.00"+"\n");
//				textArea.append("Tamano\t: Grande"+"\n");
//				textArea.append("Shots\t: 2"+"\n");
//				textArea.append("Leche\t: Evaporada"+"\n");
//				textArea.append("Crema\t: Caramelo"+"\n");
//				textArea.append("\n");
//				textArea.append("Bebida\t: Americano"+"\n");
//				textArea.append("Precio\t: $. 9.00"+"\n");
//				textArea.append("Tamano\t: Grande"+"\n");
//				textArea.append("Shots\t: 2"+"\n");
//				textArea.append("Leche\t: Ninguno"+"\n");
//				textArea.append("Crema\t: Ninguno"+"\n");
//				textArea.append("\n");
//				textArea.append("Bebida\t: Cappuccino"+"\n");
//				textArea.append("Precio\t: $. 14.00"+"\n");
//				textArea.append("Tamano\t: Grande"+"\n");
//				textArea.append("Shots\t: 2"+"\n");
//				textArea.append("Leche\t: Evaporada"+"\n");
//				textArea.append("Crema\t: Leche"+"\n");
//				textArea.append("\n");
//				textArea.append("Bebida\t: Latte Frio"+"\n");
//				textArea.append("Precio\t: $. 14.50"+"\n");
//				textArea.append("Tamano\t: Grande"+"\n");
//				textArea.append("Shots\t: 1"+"\n");
//				textArea.append("Leche\t: Semidescremada"+"\n");
//				textArea.append("Crema\t: Avena"+"\n");
//				textArea.append("\n");
				listarBebidas();	
				
						
			}
			void listarBebidas() {
				for (int i=0; i< ModificarBebidaFrame.bebidas.size(); i++) {
					Bebida listadeBebidas=ModificarBebidaFrame.bebidas.get(i);
					mostrarLista(listadeBebidas);
		
				}
			}
			void mostrarLista(Bebida bebida) {
				
				  imprimir( "Bebida \t:" + bebida.nombre);
	              imprimir( "Precio \t$: " + bebida.precio);
	              imprimir( "Shots \t:" + bebida.shots);
	              imprimir( "Leche \t:" + bebida.leche);
	              imprimir( "Crema \t: " + bebida.crema+"\n");
	                     
			}
			private void imprimir(String texto) {
				
				textArea.append(texto+"\n");
			}
		});
		
		btnListar.setForeground(new Color(248, 248, 255));
		btnListar.setBackground(new Color(188, 143, 143));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnListar.setBounds(400, 347, 100, 30);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(listarBebida.class.getResource("/Imagenes/fondolista1.jpg")));
		lblNewLabel_1_1.setBounds(533, 206, 328, 236);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(listarBebida.class.getResource("/Imagenes/fondolista1.jpg")));
		lblNewLabel.setBounds(388, 10, 328, 236);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LISTA DE BEBIDAS ");
		lblNewLabel_1.setForeground(new Color(188, 143, 143));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 10, 240, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Visualizacion del menu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(169, 169, 169));
		lblNewLabel_2.setBounds(30, 40, 186, 13);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
