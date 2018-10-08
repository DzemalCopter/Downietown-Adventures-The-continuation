package control;

<<<<<<< Updated upstream
import model.DealerQuiz.LevelQuestions;
import model.DealerQuiz.Question;

public class QuestionHandler {

    private LevelQuestions[] allLevelQuestions;

    public QuestionHandler(){
        allLevelQuestions = new LevelQuestions[5];
=======
import model.Auftrag;
import model.Level;

public class QuestionHandler {

    private Level[] allLevels;

    public QuestionHandler(){
        allLevels = new Level[5];
>>>>>>> Stashed changes
        createAllLevels();

    }

    private void createAllLevels(){
<<<<<<< Updated upstream
        for(int i=0; i < allLevelQuestions.length; i++){
            allLevelQuestions[i] = new LevelQuestions(i+1);
=======
        for(int i=0; i < allLevels.length; i++){
            allLevels[i] = new Level(i+1);
>>>>>>> Stashed changes
        }
    }


<<<<<<< Updated upstream
    public String[] getRandomQuestion(int level){
        LevelQuestions lq = allLevelQuestions[level];
        Question question = lq.getRandomQuestion();
        String[] output = new String[6];
        output[0] = question.getQuestion();
        output[1] = question.getAnswers()[0];
        output[2] = question.getAnswers()[1];
        output[3] = question.getAnswers()[2];
        output[4] = question.getAnswers()[3];
        output[5] = question.getCorrectAnswer();
        
=======
    public String[] getRandomChoices(int level){
        Level lq = allLevels[level];
        Auftrag question = lq.getRandomAuftrag();
        String[] output = new String[3];
        output[0] = question.getScenario();
        output[1] = question.getChoice()[0];
        output[2] = question.getChoice()[1];
        output[3] = question.getChoice()[2];



>>>>>>> Stashed changes
        return output;
    }
}
