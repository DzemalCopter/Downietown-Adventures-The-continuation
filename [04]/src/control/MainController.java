package control;

import model.Auftrag;
import model.Player;
import model.Levels;

public class MainController {

    private String rightAnswer;
    //Referenzen
   private Player player;
   private QuestionHandler qh;


    public MainController(){
     qh = new QuestionHandler();
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

    public String[] getAuftragAndChoices(){
        String[] questions = qh.getRandomChoices(getPlayerLevel());



        String [] output = new String[5];
        for(int i = 0; i < 5;i++){
            output[i] = questions[i];
        }

        return output;
     }


}
