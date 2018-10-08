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

    public DealerQuiz(MainController mc, Arbeitsplatz ap)
    {
        this.mc = mc;
        this.ap = ap;
        counter = 0;
        updateQuestionsAndAnswers();
    }

    private void createButtons(){
        answerA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("A");

                if(counter < 4){

                    feedback("A");
                }




            }
        });
        answerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(counter <= 4) {
                    feedback("B");
                }

            }
        });
        answerC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(counter <= 4){
                    feedback("C");
                }
            }
        });
        answerD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

        }else if(counter < 4){

        }

    }

    public void updateQuestionsAndAnswers(){
        mc.getQuestionAndAnswers();
        String[] answerAndQuestions = mc.getQuestionAndAnswers();

        questionArea.setText(answerAndQuestions[0]);
        answerA.setText(answerAndQuestions[1]);
        answerB.setText(answerAndQuestions[2]);
        answerC.setText(answerAndQuestions[3]);
        answerD.setText(answerAndQuestions[4]);


    }

    public JPanel getPanel()
    {
        return panel;
    }
}
