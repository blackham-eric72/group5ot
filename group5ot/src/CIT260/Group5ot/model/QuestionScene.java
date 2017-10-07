/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author crims
 */
public class QuestionScene implements Serializable{
    
    //class instance variables
   private String noToAnswer;
   private String bonus;
   private QuestionScene[] questionScene1 = new QuestionScene[3];
   private Question question;

    public QuestionScene() {
    }
   
   

    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.noToAnswer);
        hash = 47 * hash + Objects.hashCode(this.bonus);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionScene other = (QuestionScene) obj;
        if (!Objects.equals(this.noToAnswer, other.noToAnswer)) {
            return false;
        }
        if (!Objects.equals(this.bonus, other.bonus)) {
            return false;
        }
        return true;
    }
    
    
   
   
    
}
