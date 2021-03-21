package com.example.questionMaster.services;

import com.example.questionMaster.model.OneQuestionOneAns;

import java.util.Map;

public interface OneQuestionOneAnsServices {

    Map<String, Object> createQuestion(OneQuestionOneAns oneQuestionOneAns);

    Map<String, Object> getAllQuestion();

    Map<String, Object> getResult(OneQuestionOneAns oneQuestionOneAns);
}
