package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;

public class Büro extends JFrame {

    private MainController mC;

    public Büro(MainController mainController) {
        mC = mainController;

        this.setLocation(1050,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("Büro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}
