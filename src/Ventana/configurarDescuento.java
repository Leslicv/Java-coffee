package Ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class configurarDescuento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPorcentaje1;
	private JTextField textPorcentaje2;
	private JTextField textPorcentaje3;
	private JTextField textPorcentaje4;
	double  porcentaje1, porcentaje2,porcentaje3,porcentaje4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarDescuento frame = new configurarDescuento();
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
	public configurarDescuento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(configurarDescuento.class.getResource("/Imagenes/logo.page.png")));
		setResizable(false);
		setTitle("Configurar porcentaje de descuentos ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CONFIGURA LOS DESCUENTOS");
		lblNewLabel_6.setBounds(10, 10, 300, 24);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblPorcentaje1 = new JLabel("1 a 5 unidades ");
		lblPorcentaje1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPorcentaje1.setBounds(35, 72, 144, 30);
		contentPane.add(lblPorcentaje1);
		
		JLabel lblA = new JLabel("6 a 10 unidades ");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblA.setBounds(35, 124, 144, 30);
		contentPane.add(lblA);
		
		JLabel lblA_2 = new JLabel("11 a 15 unidades ");
		lblA_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblA_2.setBounds(35, 185, 144, 30);
		contentPane.add(lblA_2);
		
		JLabel lblA_2_1 = new JLabel("Mas de 15 unidades ");
		lblA_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblA_2_1.setBounds(35, 244, 144, 30);
		contentPane.add(lblA_2_1);
		
		textPorcentaje1 = new JTextField();
		textPorcentaje1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textPorcentaje1.setBounds(176, 78, 130, 30);
		contentPane.add(textPorcentaje1);
		textPorcentaje1.setColumns(10);
		
		textPorcentaje2 = new JTextField();
		textPorcentaje2.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textPorcentaje2.setColumns(10);
		textPorcentaje2.setBounds(176, 130, 130, 30);
		contentPane.add(textPorcentaje2);
		
		textPorcentaje3 = new JTextField();
		textPorcentaje3.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textPorcentaje3.setColumns(10);
		textPorcentaje3.setBounds(176, 185, 130, 30);
		contentPane.add(textPorcentaje3);
		
		textPorcentaje4 = new JTextField();
		textPorcentaje4.setColumns(10);
		textPorcentaje4.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textPorcentaje4.setBounds(176, 233, 130, 30);
		contentPane.add(textPorcentaje4);
		
		JLabel lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(320, 89, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("%");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(320, 133, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("%");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(320, 194, 45, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("%");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(320, 241, 45, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textPorcentaje1.setText("5.0");
		textPorcentaje2.setText("7.0");
		textPorcentaje3.setText("10.0");
		textPorcentaje4.setText("12.0");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				porcentaje1=getNuevoPorcentaje1();
				porcentaje2=getNuevoPorcentaje2();
				porcentaje3=getNuevoPorcentaje3();
				porcentaje4=getNuevoPorcentaje4();
				
				JOptionPane.showMessageDialog(null,"Porcentajes modificados","Configuracion de descuentos", JOptionPane.INFORMATION_MESSAGE);

				textPorcentaje1.setEditable(false);
				textPorcentaje2.setEditable(false);
				textPorcentaje3.setEditable(false);
				textPorcentaje4.setEditable(false);
				
			}
			
			double getNuevoPorcentaje1() {
				return Double.parseDouble(textPorcentaje1.getText());
			}
			double getNuevoPorcentaje2() {
				return Double.parseDouble(textPorcentaje2.getText());
			}
			double getNuevoPorcentaje3() {
				return Double.parseDouble(textPorcentaje3.getText());
			}
			double getNuevoPorcentaje4() {
				return Double.parseDouble(textPorcentaje4.getText());
			}
			
			
		});
		
		btnAceptar.setBounds(431, 89, 100, 30);
		btnAceptar.setBackground(new Color(188, 143, 143));
		btnAceptar.setForeground(new Color(248, 248, 255));
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar ");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vprincipal vprincipal = new Vprincipal();
				vprincipal.setVisible(true);
			}
			
		});
		btnCancelar.setBounds(541, 89, 100, 30);
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setBackground(new Color(188, 143, 143));
		contentPane.add(btnCancelar);
		
	}
}
