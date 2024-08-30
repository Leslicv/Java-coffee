package Ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Vender extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textPrecio;
	public JTextField textCantidad;
	public int contador=0;
	public  double imptotal0, imptotal1, imptotal2, imptotal3, imptotal4;
	public double sumporc=0;
	public int nventas0=0, nventas1=0, nventas2=0, nventas3=0, nventas4=0;
	public int  porcentaje;
	public  String bebidaelegida="";
	public int cantidad0=0,cantidad1=0,cantidad2=0,cantidad3=0,cantidad4=0;
	public double cuotaDiaria=1000.0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setResizable(false);
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vender.class.getResource("/Imagenes/logo.page.png")));
		setBounds(100, 100, 823, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("VENTA DE BEBIDAS");
		lblNewLabel_6.setBounds(33, 5, 335, 24);
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setForeground(new Color(188, 143, 143));
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Eliga la cantidad de bebidas para generar la boleta de venta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_1.setBounds(20, 40, 350, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBebida = new JLabel("Bebida:");
		lblBebida.setIcon(new ImageIcon(Vender.class.getResource("/Imagenes/vasobucks.jpg")));
		lblBebida.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBebida.setBounds(15, 62, 80, 45);
		contentPane.add(lblBebida);
		
		JLabel lblPrecio = new JLabel("Precio ($.) ");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));		
		lblPrecio.setBounds(15, 110, 70, 30);
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCantidad.setBounds(15, 150, 70, 30);
		contentPane.add(lblCantidad);
		
		JComboBox cboBebida = new JComboBox();
		cboBebida.setFont(new Font("Monospaced", Font.PLAIN, 13));
		cboBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String precio;
//				int  tipo;
//				tipo=leerTipo();
//				mostrarPrecio(tipo);
				
				if (cboBebida.getSelectedItem().equals("Matcha Frappuccino")) {
					precio="16.00";	
					bebidaelegida="Matcha Frappuccino";
				}
				else if (cboBebida.getSelectedItem().equals("Caramel Frappuccino")) {
					precio="15.00";
					bebidaelegida="Caramel Frappuccino";
				}
				else if (cboBebida.getSelectedItem().equals("Americano ")) {
					precio="9.00";	
					bebidaelegida="Americano ";
				}
				else if (cboBebida.getSelectedItem().equals("Capuccino")) {
					precio="14.00";	
					bebidaelegida="Capuccino";
				}
				else {
					precio="14.50";
					bebidaelegida="Latte Frio";
				}
				
				textPrecio.setText(precio);
//				
				}
			
//			int leerTipo() {
//				return cboBebida.getSelectedIndex();
//				
//			}
//			
//			void mostrarPrecio(int tip) {
//				Bebida bebidaPrecio=modificarBebida.bebida.get(tip);
//				textPrecio.setText(String.valueOf(bebidaPrecio.precio));
//				}
	
		});
		cboBebida.setModel(new DefaultComboBoxModel(new String[] {"Matcha Frappuccino", "Caramel Frappuccino", "Americano ", "Capuccino", "Latte Frio"}));
		cboBebida.setBounds(100, 69, 192, 30);
		contentPane.add(cboBebida);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(100, 112, 192, 30);
		textPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		textPrecio.setEditable(false);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(100, 150, 192, 30);
		textCantidad.setFont(new Font("Monospaced", Font.PLAIN, 13));
		contentPane.add(textCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(328, 49, 388, 263);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(188, 143, 143)));
		
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		

		
		
		JButton btnVender = new JButton("Vender");		
		btnVender.addActionListener(new ActionListener() {			
			int numero,bebida;
			double impcompra,imppagar,descuento,precio;
			String obsequio;
			double importegeneral=0;
			double sumporc0= 0;
			double sumporc1= 0;
			double sumporc2= 0;
			double sumporc3= 0;
			double sumporc4= 0;			
			public void actionPerformed(ActionEvent e) {				
				bebida=leerBebida();
				precio=leerPrecio(bebida);
				numero=leerCantidad();
				if (numero<0) {
					JOptionPane.showMessageDialog(null,"valor incorrecto");
					return;
				}
				impcompra=calcularCompra(numero, precio);
				descuento=calcularDescuento(numero,impcompra);
				imppagar=calcularPago(descuento,impcompra);
				obsequio=mostrarObsequio(numero);
				mostrarBoletadeVenta(imppagar);	
				calcularAcumulador(bebida,imppagar, contador,numero);
			
			}
			
		
			int leerBebida() {
				return cboBebida.getSelectedIndex();
			}
			double leerPrecio(int bebid) {
				switch (bebid) {
				case 0:
					return 16.00;
				case 1:
					return 15.00;
				case 2:
					return 9.00;
				case 3:
					return 14.00;
				default:
					return 14.5;
				}
				
			}
			int leerCantidad() {
				return Integer.parseInt(textCantidad.getText());
			}
			double calcularCompra(int can, double pr) {

				return can*pr;
				
			}
			 double calcularDescuento(int can, double ic) {
				 
				 if (can>0 && can<=5) {
//						porcentaje=5;
						return 0.05*ic;					
					}
					else if (can<=6 && can<=10) {
//						porcentaje=7;
						return 0.07*ic;			 
					}
					else if (can<=11 && can<=15) {
//						porcentaje=10;
						return 0.10*ic;					
					}
					else  {
//						porcentaje=12;
						return 0.12*ic;					
					}
					
			 }
			 
			 double calcularPago(double desc, double ic) {
				 return ic-desc;
			 }
			
			String mostrarObsequio(int can) {						
				if (can==1) {
					return "Cafe mericano";
					
				}
				else if (can<=2 && can<=5) {
					return "Cappuccino";
					
				}
				else  {
					return "Latte";					
				}
			}
			
			void mostrarBoletadeVenta(double ipagar) {
			textArea.setText("");
			imprimir("----------------    BOLETA DE VENTA  ----------------"+"\n");
			
			imprimir("Bebida \t \t:"+cboBebida.getSelectedItem());
			imprimir("Precio  \t \t: $."+ precio);
			imprimir("Cantidad \t \t: "+numero+ " u");
			imprimir("Importe de compra \t: $."+impcompra);
			imprimir("Importe de descuento \t: $."+ (String.format("%.2f",descuento)));
			imprimir("Importe a pagar \t \t: $."+imppagar);
			imprimir("Obsequio \t \t: "+obsequio + " (1)");
			}
			void imprimir(String texto) {
				  textArea.append(texto+"\n");

			}
			
			
		void calcularAcumulador(int bebid, double ipgar,int venta, int can) {
			switch(bebid) {
			case 0:
				nventas0++;
				imptotal0+=ipgar;
				cantidad0+=can;
				break;
			case 1:
				nventas1++;
				imptotal1+=ipgar;
				cantidad1+=can;
				break;
			case 2:
				nventas2++;
				imptotal2+=ipgar;
				cantidad2+=can;
				break;
			case 3:
				nventas3++;
				imptotal3+=ipgar;
				cantidad3+=can;
				break;
			default:
				nventas4++;
				imptotal4+=ipgar;
				cantidad4+=can;
			}

			importegeneral=imptotal0+imptotal1+imptotal2+imptotal3+imptotal4;
			sumporc0= (imptotal0/cuotaDiaria)*100;
			sumporc1= (imptotal1/cuotaDiaria)*100;
			sumporc2= (imptotal2/cuotaDiaria)*100;
			sumporc3= (imptotal3/cuotaDiaria)*100;
			sumporc4= (imptotal4/cuotaDiaria)*100;
			
			double sumdeCuotaDiaria=sumporc1+sumporc2+ sumporc3+ sumporc4+ sumporc0;
			contador +=1;
			if (contador %5==0) {
				String resultado="Venta Nro "+contador+"\n"+"Importe total general acumulado: "+String.format("%.2f",importegeneral)+"\n"+
			"Porcentaje de la cuota diaria: "+ String.format("%.2f",sumdeCuotaDiaria)+"%";
				JOptionPane.showMessageDialog(null,resultado,"",JOptionPane.INFORMATION_MESSAGE);

			}
			Venta pedido=new Venta();
			
				pedido.setBebida((String)cboBebida.getSelectedItem());
				pedido.setPrecio(Double.parseDouble(textPrecio.getText()));
				pedido.setNumero(Integer.parseInt(textCantidad.getText()));
				Vprincipal.ventas.add(pedido);
		}
		});
		
		btnVender.setForeground(new Color(248, 248, 255));
		btnVender.setBackground(new Color(188, 143, 143));
		btnVender.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVender.setBounds(521, 338, 120, 40);
		contentPane.add(btnVender);
		
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
		btnCerrar.setBounds(662, 338, 120, 40);
		contentPane.add(btnCerrar);
		
	
	
		
	
		
	}
}
