package com.example.questionMaster.model;

import javax.persistence.*;

@Entity
@Table(name = "one_question_one_ans")
public class OneQuestionOneAns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "question")
    String question;

    @JoinColumn(name = "answer_id")
    @OneToOne(fetch = FetchType.LAZY)
    OneAnswer answer;

    public OneQuestionOneAns() {
    }

    public OneQuestionOneAns(long id, String question, OneAnswer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public OneAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(OneAnswer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "OneQuestionOneAns{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
