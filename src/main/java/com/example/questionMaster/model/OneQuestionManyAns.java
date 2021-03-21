package com.example.questionMaster.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "one_question_many_ans")
public class OneQuestionManyAns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "question")
    String question;
    @JoinColumn(name = "answer_id")
    @OneToMany
    List<ManyAnswer> answer;

    public OneQuestionManyAns() {
    }

    public OneQuestionManyAns(long id, String question, List<ManyAnswer> answer) {
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

    public List<ManyAnswer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<ManyAnswer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "OneQuestionManyAns{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
