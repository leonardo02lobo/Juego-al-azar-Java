package Paneles;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cartas_Panel extends JPanel {

    public Cartas_Panel() {
        super.setLayout(null);
        super.setSize(400, 400);
        super.setLocation(130, 150);
        init();
    }

    private void init() {
        Imagenes();
    }

    private void Imagenes() {
        ImagenCarta.setBounds(0, 0, 400, 400);
        add(ImagenCarta);
    }
    
    public void CambiarCarta(){
        int Azar = (int) (Math.random()*(cartas.length+1));
        int anterior = 0;
        if(anterior != Azar){
            ImageIcon CartaAlAzar = new ImageIcon(getClass().getResource(cartas[Azar]));
            carta.setImage(CartaAlAzar.getImage());
            anterior = Azar;
        }
    }
    
    
    String[] cartas = {"../Imagenes/carta_trasera.png", "../Imagenes/carta_A.png",
        "../Imagenes/carta_2.png", "../Imagenes/carta_3.png", "../Imagenes/carta_4.png"};
    ImageIcon carta = new ImageIcon(getClass().getResource(cartas[0]));
    JLabel ImagenCarta = new JLabel(carta);
}
