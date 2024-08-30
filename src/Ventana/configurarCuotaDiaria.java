package Ventana;

import java.awt.Color;
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

public class configurarCuotaDiaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCuotaDiaria;
	double  cuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarCuotaDiaria frame = new configurarCuotaDiaria();
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
	public configurarCuotaDiaria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(configurarCuotaDiaria.class.getResource("/Imagenes/logo.page.png")));
		setTitle("Configurar cuota Diaria ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CONFIGURA LA CUOTA DIARIA");
		lblNewLabel_6.setBounds(10, 10, 300, 24);
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCuotaDiaria = new JLabel("Cuota diaria esperada ($.):");
		lblCuotaDiaria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCuotaDiaria.setBounds(10, 50, 200, 33);
		contentPane.add(lblCuotaDiaria);
		
	
		
		textCuotaDiaria = new JTextField();
		textCuotaDiaria.setFont(new Font("Monospaced", Font.BOLD, 12));
		textCuotaDiaria.setBounds(194, 52, 100, 30);
		contentPane.add(textCuotaDiaria);
		textCuotaDiaria.setColumns(10);				
		textCuotaDiaria.setText("1000.0");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.setForeground(new Color(248, 248, 255));
		btnAceptar.setBackground(new Color(188, 143, 143));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cuotaDiaria=getNuevaCuotaDiaria();

				JOptionPane.showMessageDialog(null,"Cuota diaria modificada","Configuracion de la cuota diaria", JOptionPane.INFORMATION_MESSAGE);
				textCuotaDiaria.setEditable(false);				
			}
			
			double getNuevaCuotaDiaria() {
				return Double.parseDouble(textCuotaDiaria.getText());
			}
			
		});
		
		btnAceptar.setBounds(405, 50, 100, 35);
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
		btnCancelar.setBounds(516, 50, 100, 35);
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setBackground(new Color(188, 143, 143));
		contentPane.add(btnCancelar);
		
	
	}

}
