package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class VentanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int contador=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vprincipal.class.getResource("/Imagenes/logo.page.png")));
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 655);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new LineBorder(SystemColor.window, 2, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField textUsser = new JTextField();
		textUsser.setBounds(190, 230, 185, 30);
		contentPane.add(textUsser);
		textUsser.setBorder(new LineBorder(new Color(211, 211, 211)));
		textUsser.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textUsser.setBackground(new Color(248, 248, 255));
		textUsser.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(169, 169, 169)));
		passwordField.setFont(new Font("Monospaced", Font.PLAIN, 14));
		passwordField.setBackground(new Color(248, 248, 255));
		passwordField.setBounds(190, 280, 185, 30);
		contentPane.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(188, 143, 143));
		separator.setForeground(new Color(169, 169, 169));
		separator.setBounds(70, 320, 320, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(188, 143, 143));
		separator_1.setBackground(new Color(188, 143, 143));
		separator_1.setBounds(70, 420, 320, 2);
		contentPane.add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(SystemColor.controlShadow));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usser=textUsser.getText();
				String password=null;
				
						password=passwordField.getText();
				if (usser.equals("admin") && password.equals("admin")) {
					
					Vprincipal principal= new Vprincipal();
					principal.setVisible(true);
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "credenciales incorrectas","Login",JOptionPane.WARNING_MESSAGE);
					passwordField.setText("");
					contador++;
					if (contador>=3) {
						
						JOptionPane.showMessageDialog(null, "Cuenta bloqueada por 24 horas...","Login",JOptionPane.WARNING_MESSAGE);
						textUsser.setEditable(false);
						passwordField.setEditable(false);
						
					}
					
				}
				
			}
		});
		btnLogin.setForeground(new Color(248, 248, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBackground(new Color(188, 143, 143));
		btnLogin.setBounds(100, 340, 110, 50);
		contentPane.add(btnLogin);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsser.setText("");
				passwordField.setText("");
				
			}
		});
		btnLimpiar.setForeground(new Color(248, 248, 255));
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLimpiar.setBorder(new LineBorder(SystemColor.controlShadow));
		btnLimpiar.setBackground(new Color(188, 143, 143));
		btnLimpiar.setBounds(250, 340, 110, 50);
		contentPane.add(btnLimpiar);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 228, 225));
		panel.setBackground(new Color(255, 250, 250));
		panel.setBorder(new LineBorder(new Color(188, 143, 143), 2));
		panel.setBounds(37, 124, 395, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("COFFEE ADMIN ");
		lblNewLabel_3.setForeground(new Color(188, 143, 143));
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(98, 23, 218, 38);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Ingresa a tu cuenta de admin para registrar tus ventas ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setBounds(44, 62, 320, 38);
		panel.add(lblNewLabel);	
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setBounds(44, 120, 95, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(44, 160, 94, 13);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		
	
		
		JLabel lblNewLabel_4= new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Vprincipal.class.getResource("/Imagenes/Fondo.principal.png")));
		lblNewLabel_4.setBounds(271, 10, 524, 210);
		getContentPane().add(lblNewLabel_4);
	}
}

