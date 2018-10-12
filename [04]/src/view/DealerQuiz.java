package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DealerQuiz extends JPanel
{
    private JTextArea questionArea;
    private JButton answerA;
    private JButton answerD;
    private JButton answerC;
    private JButton answerB;
    private JPanel panel;
    private MainController mc;
    private Arbeitsplatz ap;
    private int counter;
    private int shootcounter;


    public DealerQuiz(MainController mc, Arbeitsplatz ap)
    {

        this.mc = mc;
        this.ap = ap;
        counter = 0;
        updateQuestionsAndAnswers();
        shootcounter = 0;
        createButtons();

    }

    private void createButtons(){
        answerA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("A");
                questionArea.setText(questionArea.getText()+"Treffer");
                Check();

                if(counter < 4){

                    feedback("A");
                }




            }
        });
        answerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("B");
                if(counter <= 4) {
                    feedback("B");
                }

            }
        });
        answerC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                feedback("C");

                if(counter <= 4){
                    feedback("C");
                }
            }
        });
        answerD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("D");
                if(counter <= 4){
                    feedback("D");

                }
            }
        });
    }
    public void feedback(String ans){
        if(mc.answer(ans) == true && counter < 4 ){
            updateQuestionsAndAnswers();
            counter = counter + 1;

        }else if(counter >= 4){
            schiesserei();

        }

    }

    public void updateQuestionsAndAnswers(){
        String[] answerAndQuestions = mc.getQuestionAndAnswers();

        questionArea.setText(answerAndQuestions[0]);
        answerA.setText(answerAndQuestions[1]);
        answerB.setText(answerAndQuestions[2]);
        answerC.setText(answerAndQuestions[3]);
        answerD.setText(answerAndQuestions[4]);


    }
    public void schiesserei(){
        questionArea.setText("Töte die Person!!!!");
        answerA.setText("Schuss!");
        answerB.setText("Schuss!");
        answerC.setText("Schuss!");
        answerD.setText("Schuss");
    }
    public void Check(){
        shootcounter = shootcounter +1;
        if(shootcounter == 10){
            questionArea.setText("Ja man, er ist tot");
            answerA.setText("Aha");
            answerB.setText("Checker");
            answerC.setText("Lol");
            answerD.setText("LAlala");
            mc.updateMainView();


        }
    }

    public JPanel getPanel()
    {
        return panel;
    }

}
