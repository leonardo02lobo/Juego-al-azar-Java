package Paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Juego_Ventana extends JPanel{
    
    public Juego_Ventana(){
        super.setLayout(null);
        Init();
    }
        
    private void Init() {
        Componentes_GUI();
    }

    private void Componentes_GUI() {
        CambiarCarta.setText("Cambiar Carta");
        CambiarCarta.setBounds(500,20,150,30);
        add(CambiarCarta);
        //Agregando el panel que se va a encagar de rotar las paginas
        add(cartas);
        CambiarCarta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartas.remove(cartas);
                cartas.CambiarCarta();
                cartas.revalidate();
                cartas.repaint();
            }
        });
    }
    
    
    
    JButton CambiarCarta = new JButton();
    Cartas_Panel cartas = new Cartas_Panel();
}
