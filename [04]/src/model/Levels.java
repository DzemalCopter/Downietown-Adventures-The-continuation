package model;

public class Levels {

    private Auftrag[] auftrag;
    private String[] scenario;
    private String question;
    private String correctAnswer;

    public Levels(int level) {
        createQuestions(level);
    }

    private void createQuestions(int level){
        scenario = new String[4];
        switch(level){
            case 1: auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Du bist der Boss einer Firma und sitzt an einem schönen, sonnigen Tag in deinem Büro und schaust in die Firmenrechnung. Aufeinmal merkst du, dass dein Manager Geld veruntreut  hat. Was machst du?",new String[]{"Töten","Steuererklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Dein Chef hat zum dritten mal an diesem Tag deinen Kaffee geklaut. Deine Aggression verleitet dich zu...",new String[]{"Töten","Steuererklärung schreiben","Streiten"});
                break;
            case 2: auftrag = new Auftrag[3];
                auftrag[0] = new Auftrag("Du unterhälst dich mit einer Arbeitskollegin und sie 'friendzoned' dich. Du bist traurig. Was willst du tuen?",new String[]{"Töten","Steuererklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Dein Kollege verabschiedet sich mit den Worten 'Bruder muss Los', obwohl er weiß, dass er noch eine Steuererklärung machen muss.",new String[]{"Töten","Steuererklärung schreiben","Streiten"});
                auftrag[2] = new Auftrag("",new String[]{"Töten","Steuererklärung schreiben","Streiten"});
                break;
            case 3: auftrag = new Auftrag[1];
                auftrag[0] = new Auftrag("Welche Säure ist HCL",new String[]{"Salpetersäure","Schwefelsäure","Salzsäure","Ameisensäure"},"C" );

                break;
            case 4:
               auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Wo fanden die olympischen Winterspiele 2018 statt? ",new String[]{"Tokyo","Kuala Lumpur","Stalingrad","Pyeongchang "},"D" );
                auftrag[1] = new Auftrag("Bei welchem Elektronegativitätswert findet eine polare Bindung statt ",new String[]{">0,4","<1,7",">1,7","1,5 "},"A" );
                break;
            case 5:
                auftrag = new Auftrag[1];
                auftrag[0] = new Auftrag("Wer hat Downietown Adventures programmiert? ",new String[]{"Keiner","Ibrahim & Felix & Timo & Markus ","Nur Ibrahim mit einer Hand"," Nur Markus"},"C" );


        }
    }

    public Auftrag getRandomQuestion(){
        //Typecast: Java wird aufgefordert, aus einem Datentypen
        //          einen anderen zu machen. Hierbei wird eine
        //          Dezimalzahl "hart" abgerundet. D.h, aus
        //          5.87 wird 5.
        int r= (int) (Math.random()* auftrag.length);
        return auftrag[r];
    }
}
