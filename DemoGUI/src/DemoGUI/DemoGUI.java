package DemoGUI;

import javafx.embed.swt.SWTFXUtils;

import javax.swing.*;

public class DemoGUI {
    public DemoGUI(){
        JFrame f = new JFrame("Titulo de la ventana");
        //f.setTitle("Titulo2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,250);
        f.setVisible(true);
    }

    private static void crearMostrarGUI(){
       System.out.println("Created GUI on EDT?"+ SwingUtilities.isEventDispatchThread());
       JFrame f = new JFrame("ventana de demostrar GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,250);
        f.setVisible(true);
    }

     public static void main(String[] args) {
       // DemoGUI dGUI = new DemoGUI();
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                crearMostrarGUI();
             }
         });
    }
}
