package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Component;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPassword;
	private JTextField textUsser;
	private JSeparator separator;
	private JSeparator separator_1;
	private JButton btnLogin;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imagenes/starbucks-logo.png")));
		setTitle("Login ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 509);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(SystemColor.window, 2, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN ");
		lblNewLabel.setIconTextGap(10);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/usser.png")));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(SystemColor.activeCaptionBorder);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(126, 20, 177, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 129, 95, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 176, 94, 13);
		contentPane.add(lblNewLabel_2);
		
		textPassword = new JTextField();
		textPassword.setBorder(new LineBorder(new Color(169, 169, 169)));
		textPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		textPassword.setBackground(new Color(248, 248, 255));
		textPassword.setBounds(161, 167, 185, 30);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		textUsser = new JTextField();
		textUsser.setBorder(new LineBorder(new Color(211, 211, 211)));
		textUsser.setFont(new Font("Arial", Font.PLAIN, 14));
		textUsser.setBackground(new Color(248, 248, 255));
		textUsser.setColumns(10);
		textUsser.setBounds(161, 114, 185, 30);
		contentPane.add(textUsser);
		
		separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setForeground(new Color(105, 105, 105));
		separator.setBounds(30, 242, 320, 2);
		contentPane.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(105, 105, 105));
		separator_1.setBackground(Color.DARK_GRAY);
		separator_1.setBounds(30, 340, 320, 2);
		contentPane.add(separator_1);
		
		btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(SystemColor.controlShadow));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usser=textUsser.getText();
				String password=textPassword.getText();
				if (usser.equals("ADMIN") && password.equals("12345")) {
					Vprincipal principal= new Vprincipal();
					principal.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "credenciales incorrectas");
					
				}
			}
		});
		btnLogin.setForeground(new Color(248, 248, 255));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogin.setBackground(new Color(0, 100, 0));
		btnLogin.setBounds(50, 260, 120, 60);
		contentPane.add(btnLogin);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsser.setText("");
				textPassword.setText("");
				
			}
		});
		btnLimpiar.setForeground(new Color(248, 248, 255));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 16));
		btnLimpiar.setBorder(new LineBorder(SystemColor.controlShadow));
		btnLimpiar.setBackground(new Color(0, 100, 0));
		btnLimpiar.setBounds(224, 254, 120, 60);
		contentPane.add(btnLimpiar);
	}
}
