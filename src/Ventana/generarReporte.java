package Ventana;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Toolkit;


public class generarReporte extends JFrame {

	private static final long serialVersionUID = 1L;
	public JTextArea textAreareporte;
	public JPanel contentPane;
	int cantOptima=50;
	int ntotal=0;
	double precioPromedio=0;
	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generarReporte frame = new generarReporte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	String obtenerMformateado(String bebida,int venta, int cantidad, double total, double cuota ) {
		return  "\n BEBIDA             \t\t:"+bebida+"\n"+
            	"Cantidad de ventas(u) \t\t:"+ venta+"\n"+ 
            	"Cantidad de unidades vendidas  \t:"+cantidad +"\n"+
                "Importe total vendido($.) \t:"+ total+ "\n"+
            	"Aporte a la cuota diaria \t:"+cuota+ " "+" %"+ "\n";
	}
	public generarReporte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(generarReporte.class.getResource("/Imagenes/logo.page.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Generar Reporte");
		setBounds(100, 100, 544, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de reporte");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 12, 120, 13);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 500, 340);
		contentPane.add(scrollPane);
		
		JTextArea textAreareporte = new JTextArea();
		textAreareporte.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(textAreareporte);
		scrollPane.setBorder(new LineBorder(new Color(188, 143, 143)));
		textAreareporte.setEditable(false);
		
		
		
		JComboBox cboReporte = new JComboBox();
		cboReporte.setFont(new Font("Monospaced", Font.PLAIN, 12));
		cboReporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reporte=cboReporte.getSelectedIndex();
				String bebida1="";
				String bebida2="";
				String bebida3="";
				String bebida4="";
				String bebida5="";
				int nventas1=0, nventas2=0, nventas3=0, nventas4=0,nventas5=0;				
				int namericano=0,nmatcha=0,ncaramel=0,ncapu=0,nlatte=0;
				double montovendido=0;
				double totalamer=0,totalmatcha=0, totalcaramel=0,totalcapu=0,totallate=0;
				
				double cuotaamer=0,cuotamatcha=0,cuotacaramel=0,cuotacapu=0,cuotalatte=0;
				double precio1=0, precio2=0, precio3=0, precio4=0, precio5=0;
////				
//				Vprincipal.ventas= new ArrayList<Venta>();
//				Vprincipal.ventas.add(new Venta("Americano ", 9.00, 2 ));
//				
//				Vprincipal.ventas.add(new Venta("Americano ", 9.00, 4 ));
//				Vprincipal.ventas.add(new Venta("Americano ", 9.00, 8 ));
//				Vprincipal.ventas.add(new Venta("Matcha Frappuccino", 16.00, 7 ));
//				Vprincipal.ventas.add(new Venta("Capuccino", 15.00, 7 ));
//				Vprincipal.ventas.add(new Venta("Latte Frio", 16.00, 2 ));

				
				for (int i=0; i<Vprincipal.ventas.size(); i++ ) {
					Venta pedido=Vprincipal.ventas.get(i);
					
					 if (pedido.getBebida().equals("Matcha Frappuccino")) {
						 bebida1=pedido.getBebida();
						 nmatcha+=pedido.getNumero();
						 precio1=pedido.getPrecio();
						 totalmatcha=pedido.getPrecio()*nmatcha;
						 nventas1+=1;
						 
						 
					 }
					 else if (pedido.getBebida().equals("Caramel Frappuccino")) {
						 bebida2=pedido.getBebida();
						 ncaramel+=pedido.getNumero();
						 precio2=pedido.getPrecio();
						 totalcaramel=pedido.getPrecio()*ncaramel;
						 nventas2+=1;
					 }
					 else if (pedido.getBebida().equals("Americano ")) {
						 bebida3=pedido.getBebida();
						 namericano+=pedido.getNumero();
						 precio3=pedido.getPrecio();
						 totalamer=pedido.getPrecio()*namericano;
						 nventas3+=1;
					 }
					 else if (pedido.getBebida().equals("Capuccino")) {
						 bebida4=pedido.getBebida();
						 ncapu+=pedido.getNumero();
						 precio4=pedido.getPrecio();
						 totalcapu=pedido.getPrecio()*ncapu;
						 nventas4+=1;
					 }
					 else {
						 bebida5=pedido.getBebida();
						 nlatte+=pedido.getNumero();
						 precio5=pedido.getPrecio();
						 totallate=pedido.getPrecio()*nlatte;
						 nventas5+=1;
					 }
					 Double cuotaDiaria=1000.0;
					montovendido=(totallate+totalcapu+totalcaramel+totalmatcha+totalamer);
					cuotalatte=Double.parseDouble(String.format("%.2f", totallate/cuotaDiaria*100));
					cuotaamer=Double.parseDouble(String.format("%.2f",totalamer/cuotaDiaria*100));
					cuotacapu=Double.parseDouble(String.format("%.2f",totalcapu/cuotaDiaria*100));
					cuotamatcha=Double.parseDouble(String.format("%.2f",totalmatcha/cuotaDiaria*100));
					cuotacaramel=Double.parseDouble(String.format("%.2f",totalcaramel/cuotaDiaria*100));
				}
				
				
				switch (reporte) {
                case 0:
                	textAreareporte.setText("VENTAS POR MODELO"+ "\n");
                	if (nventas1>0) {
                		String message = obtenerMformateado(bebida1,nventas1,nmatcha, totalmatcha,cuotamatcha);
                		
                		textAreareporte.append(message);
                		}
                	if (nventas2>0) {               		
                		String message = obtenerMformateado(bebida2,nventas2,ncaramel,totalcaramel,cuotacaramel);
                		
                		textAreareporte.append(message);
                	}
                	if (nventas3>0) {
                		String message = obtenerMformateado(bebida3,nventas3, namericano ,totalamer,cuotaamer);
                		
                		textAreareporte.append(message);
                	}
                	if (nventas4>0) {
                		String message = obtenerMformateado(bebida4,nventas4,ncapu,totalcapu,cuotacapu);
                		
                		textAreareporte.append(message);
                	}
                	if(nventas5>0) {
                		String message = obtenerMformateado(bebida5,nventas5,nlatte,totallate,cuotalatte);
                		
                		textAreareporte.append(message);
                	}
                    
                   break;
                case 1:
                	ntotal=nventas1+nventas2+nventas3+nventas4+nventas5;
                	ArrayList<Pair<String,Integer>> listVentas=new ArrayList<>();
                	listVentas.add(new Pair<>(bebida1,nmatcha));
                	listVentas.add(new Pair<>(bebida2,ncaramel ));
                	listVentas.add(new Pair<>(bebida3,namericano));
                	listVentas.add(new Pair<>(bebida4,ncapu));
                	listVentas.add(new Pair<>(bebida5,nlatte));
                	
                	Collections.sort(listVentas, new Comparator <Pair<String,Integer>>(){
                		public int compare(Pair<String,Integer> o1, Pair<String,Integer> o2) {
                            return o2.getValue().compareTo(o1.getValue());
                		}});
                	
                	textAreareporte.setText("VENTAS EN RELACION A LA VENTA MAS OPTIMA \n");
                	
                    
                	for (Pair<String,Integer> item:listVentas) {
                		String Bebida=item.getKey();
                		int numero=item.getValue();

                		String mensaje="";
                		if (numero==cantOptima){
                			mensaje=" igual a la cantidad optima.";
                		}
                		else if (numero<cantOptima) {
                			mensaje="("+" "+(cantOptima-numero)+" menos que la cantidad optima).";
                		}
                		else {
                			mensaje="("+" "+(numero-cantOptima)+" mas que la cantidad optima).";
                		}
                		
                		if (numero>0) {
                			textAreareporte.append("\n BEBIDA:                " + Bebida + "\n" +
                                    " Numero total vendido: " + numero + mensaje + " \n" );
                		}
                		
                	
                	System.out.println(listVentas);
                	
                	}
                    
                    break;
                case 2:
                	ArrayList<Pair<String,Double>> precios = new ArrayList<>();
                    
            		precios.add(new Pair<>(bebida1,precio1));
            		precios.add(new Pair<>(bebida2,precio2));
            		precios.add(new Pair<>(bebida3,precio3));
            		precios.add(new Pair<>(bebida4,precio4));
            		precios.add(new Pair<>(bebida5,precio5));

            		Collections.sort(precios, new Comparator <Pair<String,Double>>(){
                		public int compare(Pair<String,Double> o1, Pair<String,Double> o2) {
                            return o2.getValue().compareTo(o1.getValue());
                		}});
            		
            		textAreareporte.setText("VENTAS EN RELACION AL PRECIO PROMEDIO \n \n");
            		precioPromedio=13.5;
            		for (Pair<String,Double> item:precios) {
            			String beb=item.getKey();
            			Double prec=item.getValue();            		
//            			20605044591

            			String mens="";
            			
            			if (prec==precioPromedio){
                			mens=" igual al precio promedio.";
                		}
                		else if (precioPromedio<prec) {
                			mens=" (MAYOR que el precio promedio)";
                		}
                		else {
                			mens=" (MENOR que el precio promedio)";
                		}
                		
                		if (prec>0) {
                			textAreareporte.append("\n BEBIDA \t \t :" + beb + "\n" +
                                    "Precio \t: " + prec + mens + " \n" );
                		}
                			
            	System.out.print(precio1+""+precio2+" precios ");	
            	
            		}
                	break;
                case 3:
                	

                	ArrayList<Pair<String,Double>> preciosmayores = new ArrayList<>();
                    
                	preciosmayores.add(new Pair<>(bebida1,precio1));
                	preciosmayores.add(new Pair<>(bebida2,precio2));
                	preciosmayores.add(new Pair<>(bebida3,precio3));
                	preciosmayores.add(new Pair<>(bebida4,precio4));
                	preciosmayores.add(new Pair<>(bebida5,precio5));
            		
                    textAreareporte.setText(" PROMEDIO, PRECIO MAYOR Y MENOR "+"\n"+"\n");
                    
           		 double mayor = 0;
                 double menor = 10000;
                     precioPromedio=13.5;
                    	for (Pair<String, Double> selector : preciosmayores) {

                			Double preci=selector.getValue();
														
                    		if (preci>mayor) {
                    			mayor=preci;                   	
                    	}
                    		if (preci<menor && preci!=0 ){
                    			menor=preci;
                        	}

                    	}
                		textAreareporte.append("Precio promedio\t  : "+(String.format("%.2f",precioPromedio))+"\n");
                		textAreareporte.append("Precio mayor\t  : "+String.format("%.2f", mayor)+"\n");
                        textAreareporte.append("Precio menor\t  : "+menor);
                    	
                    
                    break;		
				
					}
				}
			
		});
		cboReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relacion a la venta optima", "Precios en relacion al precio promedio", "Promedios mayores y menores"}));
		cboReporte.setBounds(164, 9, 350, 18);
		contentPane.add(cboReporte);
		
		
		
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
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrar.setBounds(184, 391, 140, 60);
		contentPane.add(btnCerrar);
	
	}



}
