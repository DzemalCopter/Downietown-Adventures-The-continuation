package control;

import model.Auftrag;
import model.Levels;
import model.Auftrag;

public class QuestionHandler {

    private Levels[] allLevels;

    public QuestionHandler(){
        allLevels = new Levels[5];
        createAllLevels();

    }

    private void createAllLevels(){
        for(int i=0; i < allLevels.length; i++){
            allLevels[i] = new Levels(i+1);
        }
    }


    public String[] getRandomChoices(int level){
        Levels lq = allLevels[level];
        Auftrag question = lq.getRandomQuestion();
        String[] output = new String[3];
        output[0] = question.getScenario();
        output[1] = question.getChoice()[0];
        output[2] = question.getChoice()[1];
        output[3] = question.getChoice()[2];



        return output;
    }
}
