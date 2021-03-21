package com.example.questionMaster.services.impl;

import com.example.questionMaster.model.OneAnswer;
import com.example.questionMaster.model.OneQuestionOneAns;
import com.example.questionMaster.repositories.OneQuestionOneAnsRepository;
import com.example.questionMaster.services.OneQuestionOneAnsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OneQuestionOneAnsServiceImpl implements OneQuestionOneAnsServices {
    @Autowired
    OneQuestionOneAnsRepository oneQuestionOneAnsRepository;

    @Override
    public Map<String, Object> createQuestion(OneQuestionOneAns oneQuestionOneAns) {
        Map<String, Object> response = new HashMap();
        OneQuestionOneAns oneQuestionOneAns1 = oneQuestionOneAnsRepository.save(oneQuestionOneAns);
        response.put("massage", "question created successfully");
        response.put("data", oneQuestionOneAns1);
        return response;

    }

    @Override
    public Map<String, Object> getAllQuestion() {
        Map<String, Object> response = new HashMap();
        List<OneQuestionOneAns> qList = new ArrayList();
        qList = oneQuestionOneAnsRepository.findAll();
        response.put("data", qList);
        return response;
    }

    @Override
    public Map<String, Object> getResult(OneQuestionOneAns oneQuestionOneAns) {
        Optional<OneQuestionOneAns> optional = oneQuestionOneAnsRepository.findById(oneQuestionOneAns.getId());
        OneAnswer studentAns = oneQuestionOneAns.getAnswer();
        Map<String, Object> response = new HashMap();
        if (optional.isPresent()) {
            OneQuestionOneAns oneQuestionOneAns1 = optional.get();
            OneAnswer answer = oneQuestionOneAns1.getAnswer();
            if (answer.getAnswer().equals(studentAns.getAnswer())) {
                response.put("result", "Correct Answer");
            } else {
                response.put("result", "Incorrect Answer");
            }
            return response;
        } else {
            response.put("massage", "wrong question");
        }
        return response;
    }
}
