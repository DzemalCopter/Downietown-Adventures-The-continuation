package control;

import model.Auftrag;
import model.Level;
import model.Auftrag;

public class AuftragHandler
{

    private Level[] allLevels;

    public AuftragHandler(){
        allLevels = new Level[5];
        createAllLevels();

    }

    private void createAllLevels(){
        for(int i=0; i < allLevels.length; i++){
            allLevels[i] = new Level(i+1);
        }
    }


    public String[] getRandomChoices(int level){
        Level lq = allLevels[level];
        Auftrag auftrag = lq.getRandomAuftrag();
        String[] output = new String[4];
        output[0] = auftrag.getScenario();
        output[1] = auftrag.getChoice()[0];
        output[2] = auftrag.getChoice()[1];
        output[3] = auftrag.getChoice()[2];



        return output;
    }
}
