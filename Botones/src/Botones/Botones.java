package Botones;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones {
    static JFrame window = new JFrame();

    static JPanel panel = new JPanel();

    public static void setPanel() {
        //NORTE,SUR,ESTE,OESTE, CENTRO
        panel.setLayout(new BorderLayout());

    }

    public static void setWindow() {
        window.setTitle("Programa Botones");
        window.setBackground(Color.RED);
        window.getContentPane().add(panel);
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static  void agregarBotones() {

        BotonActionListener botonAction = new BotonActionListener();
        JButton boton = new JButton("NORTH");
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setActionCommand("norte");
        boton.addActionListener(botonAction);
        panel.add(boton, BorderLayout.NORTH);

        boton = new JButton("SOUTH");
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setActionCommand("sur");
        boton.addActionListener(botonAction);
        panel.add(boton, BorderLayout.SOUTH);

        boton = new JButton("EAST");
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setActionCommand("este");
        boton.addActionListener(botonAction);
        panel.add(boton, BorderLayout.EAST);

        boton = new JButton("WEST");
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setActionCommand("Oeste");
        boton.addActionListener(botonAction);
        panel.add(boton, BorderLayout.WEST);

        boton = new JButton("CENTER");
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setActionCommand("Centro");
        boton.addActionListener(botonAction);
        panel.add(boton, BorderLayout.CENTER);
    }

    public static void crearMuestraGui(){
        setWindow();
        setPanel();
        agregarBotones();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
crearMuestraGui();
            }
        });
    }
}