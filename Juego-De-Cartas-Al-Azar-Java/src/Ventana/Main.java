package Ventana;

import Paneles.Juego_Ventana;
import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        Juego_Ventana panel = new Juego_Ventana();
        miVentana.add(panel);
        miVentana.setSize(700,700);
        miVentana.setLocationRelativeTo(null);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
    }
}
