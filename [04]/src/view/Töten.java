package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Töten extends JPanel
{
    private JPanel panel;
    private JTextArea textArea1;
    private JButton aufDemTischButton;
    private JButton imSchrankButton;
    private JButton nächsterRaumButton;
    private Arbeitsplatz ap;
    private boolean found;

    public Töten(Arbeitsplatz ap){
        this.ap = ap;

        aufDemTischButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }




}
