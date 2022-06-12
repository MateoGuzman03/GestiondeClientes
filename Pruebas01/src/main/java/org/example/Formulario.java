package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Formulario extends JFrame {

    private JPanel panelMain;
    private JTextField txtNombre;
    private JButton btnGuardar;
    private JList<String> listClientes;

    DefaultListModel datos;

    private List<String> nombres = new ArrayList<>();

    public Formulario() {
        btnGuardar.addActionListener(e -> {
            nombres.add(this.txtNombre.getText());
            actualizarLista();
        });
    }

    private void actualizarLista(){
        datos = new DefaultListModel();
        for (String nombre : nombres) {
            datos.addElement( nombre );
        }
        this.listClientes.setModel(datos);
    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setContentPane(formulario.panelMain);
        formulario.setTitle("Gestion de Clientes");
        formulario.setSize(400,400);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}