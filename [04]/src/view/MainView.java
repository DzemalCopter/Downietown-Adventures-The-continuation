package view;

import control.MainController;

import javax.swing.*;

public class MainView extends JFrame {


    MainController mainController;
    private JPanel startPanel, gamePanel;


    public MainView(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("Quit-Game-Template");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void  play(String name) {
        mainController.creatPlayer(name);
        String noName = "";
        if (name.equals(noName)) {
        }else {

            this.getContentPane().removeAll();
            this.getContentPane().invalidate();

            this.gamePanel = new GamePanelHandler(mainController, mainController.getPlayerName(), mainController.getPlayerLevel()).getPanel();
            this.getContentPane().add(gamePanel);
            this.getContentPane().revalidate();
        }


    }


}
