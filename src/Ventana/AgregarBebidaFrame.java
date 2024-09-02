package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AgregarBebidaFrame extends JFrame {

    private JTextField txtPrecio;
    private JTextField txtTamano;
    private JTextField txtShots;
    private JTextField txtLeche;
    private JTextField txtCrema;
    private JButton btnAgregar;
    private ArrayList<Bebida> bebidas;
	private JTextField txtNombre;
	ModificarBebidaFrame parent;

    public AgregarBebidaFrame(ArrayList<Bebida> bebidas, ModificarBebidaFrame parent) {
        this.bebidas = bebidas;
        this.parent = parent;
        
        setTitle("Agregar Bebida");
        setSize(641, 290);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(7, 5));

        // Crear los componentes
        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();  
        JLabel lblPrecio = new JLabel("Precio:");
        txtPrecio = new JTextField();
        JLabel lblTamano = new JLabel("Tamaño:");
        txtTamano = new JTextField();
        JLabel lblShots = new JLabel("Shots:");
        txtShots = new JTextField();
        JLabel lblLeche = new JLabel("Leche:");
        txtLeche = new JTextField();
        JLabel lblCrema = new JLabel("Crema:");
        txtCrema = new JTextField();
        btnAgregar = new JButton("Agregar");

        // Agregar los componentes al JFrame
        getContentPane().add(lblNombre);
        getContentPane().add(txtNombre);
        getContentPane().add(lblPrecio);
        getContentPane().add(txtPrecio);
        getContentPane().add(lblTamano);
        getContentPane().add(txtTamano);
        getContentPane().add(lblShots);
        getContentPane().add(txtShots);
        getContentPane().add(lblLeche);
        getContentPane().add(txtLeche);
        getContentPane().add(lblCrema);
        getContentPane().add(txtCrema);
        getContentPane().add(btnAgregar);

        // Configurar el botón Agregar
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarBebida();
            }
        });

        setVisible(true);
    }
    void actualizarCombo(){
    	
    }

    private void agregarBebida() {
        
        	String nombre=txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String tamano = txtTamano.getText();
            int shots = Integer.parseInt(txtShots.getText());
            String leche = txtLeche.getText();
            String crema = txtCrema.getText();

//            // Crear la nueva bebida
            Bebida nuevaBebida = new Bebida(nombre,tamano,precio, shots, leche, crema);

            // Agregar la bebida a la lista
            bebidas.add(nuevaBebida);

            // Limpiar los campos después de agregar la bebida
            txtPrecio.setText("");
            txtTamano.setText("");
            txtShots.setText("");
            txtLeche.setText("");
            txtCrema.setText("");

            JOptionPane.showMessageDialog(this, "Bebida agregada exitosamente!");

            System.out.println(bebidas);
            

            parent.actualizarCombo();
  
    }
}
