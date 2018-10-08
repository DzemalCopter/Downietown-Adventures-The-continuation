package control;

import model.LevelQuestions;
import model.Player;
import model.Question;

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

    public String[] getQuestionAndAnswers(){
        String[] questions = qh.getRandomQuestion(getPlayerLevel());
         rightAnswer = questions[5];


        String [] output = new String[5];
        for(int i = 0; i < 5;i++){
            output[i] = questions[i];
        }

        return output;
     }

    public boolean answer(String chosenAnswer){
        boolean answer = false;
        // chosenAnswer == rigthAnswer --> Prüfung, ob beide String auf einen gemeinsamen Punkt im Arbeitsspeicher zeigen.
        if(chosenAnswer.equals(rightAnswer) ){
            answer = true;
            player.setLevel(getPlayerLevel()+1);
        }
        return answer;
    }
}
