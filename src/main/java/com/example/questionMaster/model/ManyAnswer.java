package com.example.questionMaster.model;

import javax.persistence.*;

@Entity
@Table(name = "many_question_ans")
public class ManyAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "que_answer")
    String answer;

    @Column(name = "answer_value")
    long answerValue;

    public ManyAnswer() {
    }

    public ManyAnswer(long id, String answer, long answerValue) {
        this.id = id;
        this.answer = answer;
        this.answerValue = answerValue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(long answerValue) {
        this.answerValue = answerValue;
    }

    @Override
    public String toString() {
        return "ManyAnswer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", answerValue=" + answerValue +
                '}';
    }
}
