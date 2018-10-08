package view;

import control.MainController;

import javax.swing.*;

public class GamePanelHandler extends JPanel
{

    private JTextArea textArea1;
    private JPanel tKA;
    private JLabel name;
    private JLabel level;
    private JButton töten;
    private JButton streiten;
    private JButton feuern;
    private JButton colorslider;
    private MainController mC;
    private String playerName;
    private int playerlevel;

    public GamePanelHandler(MainController mC, String playername, int level){
        this.mC = mC;
        ColorSlider cs = new ColorSlider();
        this.playerlevel = level;
        playerName = playername;
        updateButtons();


    }

    public void updateButtons(){
        String[] s = mC.getAuftragAndChoices();
        textArea1.setText(s[0]);
        töten.setText(s[1]);
        feuern.setText(s[2]);
        streiten.setText(s[3]);
        name.setText(playerName);
        level.setText("" + playerlevel);
    }

    public void updatePictureFrame(){

    }
    public JPanel getPanel(){
        return tKA;
    }
}
