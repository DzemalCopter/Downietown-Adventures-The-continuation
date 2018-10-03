package control;


import model.Player;


public class MainController {


    //Referenzen
    private Player player;



    public MainController(){

    }

    public void creatPlayer(String name){
        player = new Player(name);
    }

    public String getPlayerName(){
        return player.getName();
    }

    public int getPlayerLevel(){
        return player.getLevel();
    }


}
