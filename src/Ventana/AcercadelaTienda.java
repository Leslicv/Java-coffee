package Ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class AcercadelaTienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercadelaTienda frame = new AcercadelaTienda();
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
	public AcercadelaTienda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AcercadelaTienda.class.getResource("/Imagenes/logo.page.png")));
		setResizable(false);
		setTitle("Acerca de la Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIENDA");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(188, 24, 109, 38);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 60, 440, 2);
		separator.setForeground(new Color(188, 143, 143));
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 51, 0));
		lblNewLabel_1.setBounds(198, 70, 67, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lesli Caldas Verde");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(170, 100, 120, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBackground(new Color(188, 143, 143));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal vprincipal=new Vprincipal();
				vprincipal.setVisible(true);
			}
			
		});
		btnCerrar.setBounds(177, 200, 100, 30);
		btnCerrar.setForeground(new Color(248, 248, 255));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnCerrar);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AcercadelaTienda.class.getResource("/Imagenes/Facebook.png")));
		lblNewLabel_3.setBounds(158, 130, 37, 47);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(AcercadelaTienda.class.getResource("/Imagenes/Instagram.png")));
		lblNewLabel_3_1.setBounds(208, 130, 37, 47);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(AcercadelaTienda.class.getResource("/Imagenes/Whatsapp (2).png")));
		lblNewLabel_3_1_1.setBounds(260, 130, 37, 47);
		contentPane.add(lblNewLabel_3_1_1);
	}
}
