package Botones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = ((JButton) actionEvent.getSource()).getActionCommand();
        if (command.equals("norte")) {
            //INVOCACION AL METODO PARA SALVAR LOS DATOS EN LA BASE DE DATOS
            JOptionPane.showMessageDialog(null, "mensaje Norte", "Titulo Norte", JOptionPane.INFORMATION_MESSAGE);
        }
        //INVOCACION AL PROCESO DE LIMPIEZA DE PANTALLA
        if (command.equals("sur")) {
            JOptionPane.showMessageDialog(null, "mensaje Sur", "Titulo Sur", JOptionPane.INFORMATION_MESSAGE);
        }
        //INVOCACION AL METODO MOSTRAR REPORTE
        if (command.equals("este")) {
            JOptionPane.showMessageDialog(null, "mensaje Este", "Titulo Este", JOptionPane.INFORMATION_MESSAGE);
        }
        if (command.equals("Oeste")) {
            JOptionPane.showMessageDialog(null, "mensaje Oeste", "Titulo Oeste", JOptionPane.INFORMATION_MESSAGE);
        }
        if (command.equals("Centro")) {
            JOptionPane.showMessageDialog(null, "mensaje Centro", "Titulo Centro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
