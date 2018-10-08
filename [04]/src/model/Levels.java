package model;

public class Levels {

    private Auftrag[] questions;
    private String[] answers;
    private String question;
    private String correctAnswer;

    public Levels(int level) {
        createQuestions(level);
    }

    private void createQuestions(int level){
        answers = new String[4];
        switch(level){
            case 1: questions = new Auftrag[2];
                questions[0] = new Auftrag("Wie heißt dein Inf-Lk Lehrer",new String[]{"Herr Kneblewski","Herr Ambrolord","Herr Abmbrösius","Herr Ambrosius"},"D" );
                questions[1] = new Auftrag("Wo findet der Inf-Lk statt",new String[]{"Stg","KKG","HHG","MKG"},"B" );
                break;
            case 2: questions = new Auftrag[3];
                questions[0] = new Auftrag("Welches Land regiert Donald T.?",new String[]{"Entenhausen","USA","Deutschland","Mexico"},"B" );
                questions[1] = new Auftrag("In welchem Bundesland liegt Freiburg?",new String[]{"Mallorca","Bayern","Baden-Württemberg","Deutschland"},"C" );
                questions[2] = new Auftrag("Wann fand die Völkerschlacht von Leipzig statt? ",new String[]{"1813","1933","2009","1412"},"A" );
                break;
            case 3: questions = new Auftrag[1];
                questions[0] = new Auftrag("Welche Säure ist HCL",new String[]{"Salpetersäure","Schwefelsäure","Salzsäure","Ameisensäure"},"C" );

                break;
            case 4:
               questions = new Auftrag[2];
                questions[0] = new Auftrag("Wo fanden die olympischen Winterspiele 2018 statt? ",new String[]{"Tokyo","Kuala Lumpur","Stalingrad","Pyeongchang "},"D" );
                questions[1] = new Auftrag("Bei welchem Elektronegativitätswert findet eine polare Bindung statt ",new String[]{">0,4","<1,7",">1,7","1,5 "},"A" );
                break;
            case 5:
                questions = new Auftrag[1];
                questions[0] = new Auftrag("Wer hat Downietown Adventures programmiert? ",new String[]{"Keiner","Ibrahim & Felix & Timo & Markus ","Nur Ibrahim mit einer Hand"," Nur Markus"},"C" );


        }
    }

    public Auftrag getRandomQuestion(){
        //Typecast: Java wird aufgefordert, aus einem Datentypen
        //          einen anderen zu machen. Hierbei wird eine
        //          Dezimalzahl "hart" abgerundet. D.h, aus
        //          5.87 wird 5.
        int r= (int) (Math.random()*questions.length);
        return questions[r];
    }
}
