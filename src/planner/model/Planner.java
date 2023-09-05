package planner.model;

import java.awt.Color;
import javax.swing.JFrame;
import planner.view.TelaInicial;

public class Planner {

    public static void main(String[] args) {
        TelaInicial telIni = new TelaInicial();
        telIni.setVisible(true);
        telIni.setSize(400,500);
        telIni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
}
