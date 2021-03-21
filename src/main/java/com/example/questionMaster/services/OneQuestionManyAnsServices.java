package com.example.questionMaster.services;

import com.example.questionMaster.model.OneQuestionManyAns;
import com.example.questionMaster.model.OneQuestionOneAns;

import java.util.Map;

public interface OneQuestionManyAnsServices {
    Map<String, Object> createQuestion(OneQuestionManyAns oneQuestionOneAns);

    Map<String, Object> getAllQuestion();

    Map<String, Object> getResult(OneQuestionManyAns oneQuestionOneAns);
}
