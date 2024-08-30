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

public class configurarCantidadOptima extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidadOptima;
	double  cantidadOptima;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarCantidadOptima frame = new configurarCantidadOptima();
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
	public configurarCantidadOptima() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(configurarCantidadOptima.class.getResource("/Imagenes/logo.page.png")));
		setTitle("Configuracion de Cantidad Optima ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidadOptima = new JLabel("Cantidad optima de unidades vendidas:");
		lblCantidadOptima.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCantidadOptima.setBounds(10, 50, 270, 33);
		contentPane.add(lblCantidadOptima);
		
		JLabel lblNewLabel_6 = new JLabel("CONFIGURA LA CANTIDAD OPTIMA");
		lblNewLabel_6.setBounds(10, 10, 300, 24);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
	
		
		textCantidadOptima = new JTextField();
		textCantidadOptima.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textCantidadOptima.setBounds(250, 50, 100, 30);
		contentPane.add(textCantidadOptima);
		textCantidadOptima.setColumns(10);
		
	
		
		textCantidadOptima.setText("20");

		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(248, 248, 255));
		btnAceptar.setBackground(new Color(188, 143, 143));
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cantidadOptima=getNuevaCantidadOptima();

				JOptionPane.showMessageDialog(null,"Cantidad Optima modificada","Configuracion de cantidad optima", JOptionPane.INFORMATION_MESSAGE);
				textCantidadOptima.setEditable(false);	
			}
			
			double getNuevaCantidadOptima() {
				return Double.parseDouble(textCantidadOptima.getText());
			}
	
		});
		
		btnAceptar.setBounds(373, 50, 100, 30);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar ");
		btnCancelar.setBackground(new Color(188, 143, 143));
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal vprincipal = new Vprincipal();
				vprincipal.setVisible(true);
			}
			
		});
		btnCancelar.setBounds(482, 50, 100, 30);
		contentPane.add(btnCancelar);
		
	}

}
