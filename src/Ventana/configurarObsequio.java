package Ventana;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;

public class configurarObsequio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textObsequio1;
	private JTextField textObsequio2;
	private JTextField textObsequio3;
	String  obsequio1, obsequio2,obsequio3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarObsequio frame = new configurarObsequio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public configurarObsequio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(configurarObsequio.class.getResource("/Imagenes/logo.page.png")));
		setTitle("Configurar un obsequio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CONFIGURA LOS OBSEQUIOS");
		lblNewLabel_6.setBounds(10, 10, 300, 24);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		JLabel lblObsequio1 = new JLabel("OBSEQUIO 1 ");
		lblObsequio1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblObsequio1.setBounds(35, 72, 144, 30);
		contentPane.add(lblObsequio1);
		
		JLabel lblObsequio2 = new JLabel("OBSEQUIO 2");
		lblObsequio2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblObsequio2.setBounds(35, 124, 144, 30);
		contentPane.add(lblObsequio2);
		
		JLabel lblObsequio3 = new JLabel("OBSEQUIO 3");
		lblObsequio3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblObsequio3.setBounds(35, 185, 144, 30);
		contentPane.add(lblObsequio3);
		
		textObsequio1 = new JTextField();
		textObsequio1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textObsequio1.setBounds(176, 78, 130, 30);
		contentPane.add(textObsequio1);
		textObsequio1.setColumns(10);
		
		textObsequio2 = new JTextField();
		textObsequio2.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textObsequio2.setColumns(10);
		textObsequio2.setBounds(176, 130, 130, 30);
		contentPane.add(textObsequio2);
		
		textObsequio3 = new JTextField();
		textObsequio3.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textObsequio3.setColumns(10);
		textObsequio3.setBounds(176, 185, 130, 30);
		contentPane.add(textObsequio3);
		
		textObsequio1.setText("Cafe Americano");
		textObsequio2.setText("Cappuccino");
		textObsequio3.setText("Latte");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.setForeground(new Color(248, 248, 255));
		btnAceptar.setBackground(new Color(188, 143, 143));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obsequio1=getNuevoObsequio1();
				obsequio2=getNuevoObsequio2();
				obsequio3=getNuevoObsequio3();		
				
				JOptionPane.showMessageDialog(null,"Obsequios modificados", "Configuracion de obsequios",JOptionPane.INFORMATION_MESSAGE);
				
				textObsequio1.setEditable(false);
				textObsequio2.setEditable(false);
				textObsequio3.setEditable(false);
			}
			
			String getNuevoObsequio1() {
				return textObsequio1.getText();
			}
			String getNuevoObsequio2() {
				return textObsequio2.getText();
			}
			String getNuevoObsequio3() {
				return textObsequio3.getText();
			}
			
		});
		
		btnAceptar.setBounds(422, 55, 100, 30);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar ");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setBackground(new Color(188, 143, 143));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal vprincipal = new Vprincipal();
				vprincipal.setVisible(true);
			}
			
		});
		btnCancelar.setBounds(422, 108, 100, 30);
		contentPane.add(btnCancelar);
		
	
	}

}
