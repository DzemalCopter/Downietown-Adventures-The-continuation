package control;

import model.Player;
import sun.applet.Main;
import view.Arbeitsplatz;
import view.GamePanelHandler;
import view.MainView;

public class MainController {

    private String rightAnswer;
    //Referenzen
   private Player player;
   private AuftragHandler qh;
   private Arbeitsplatz ap;
   private QuestionHandler th;
   private MainView mV;




    public MainController(){
     qh = new AuftragHandler();

    }

    public void setMainView(MainView mV){
        this.mV = mV;
    }

    public void creatArbeitsplatz(int p,GamePanelHandler gph){
        ap = new Arbeitsplatz(this,p,gph );
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
    public String[] getQuestionAndAnswers(){
        String[] questions = th.getRandomQuestion(getPlayerLevel());
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
    public void updateMainView(){
        player.setLevel(getPlayerLevel()+1);



    }


}
