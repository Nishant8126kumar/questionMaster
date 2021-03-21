package com.example.questionMaster.services.impl;

import com.example.questionMaster.model.ManyAnswer;
import com.example.questionMaster.model.OneAnswer;
import com.example.questionMaster.model.OneQuestionManyAns;
import com.example.questionMaster.model.OneQuestionOneAns;
import com.example.questionMaster.repositories.OneQuestionManyAnsRepository;
import com.example.questionMaster.repositories.OneQuestionOneAnsRepository;
import com.example.questionMaster.services.OneQuestionManyAnsServices;
import com.example.questionMaster.services.OneQuestionOneAnsServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

public class OneQuestionManyAnsServiceImpl implements OneQuestionManyAnsServices {
    @Autowired
    OneQuestionManyAnsRepository oneQuestionManyAnsRepository;

    @Override
    public Map<String, Object> createQuestion(OneQuestionManyAns oneQuestionManyAns) {
        Map<String, Object> response = new HashMap();
        OneQuestionManyAns oneQuestionManyAns1 = oneQuestionManyAnsRepository.save(oneQuestionManyAns);
        response.put("massage", "question created successfully");
        response.put("data", oneQuestionManyAns1);
        return response;

    }

    @Override
    public Map<String, Object> getAllQuestion() {
        Map<String, Object> response = new HashMap();
        List<OneQuestionManyAns> qList = new ArrayList();
        qList = oneQuestionManyAnsRepository.findAll();
        response.put("data", qList);
        return response;
    }

    @Override
    public Map<String, Object> getResult(OneQuestionManyAns oneQuestionManyAns) {
        Map<String, Object> response = new HashMap();
        long percentage = 0;
        List<ManyAnswer> studentanswer = new ArrayList<>(oneQuestionManyAns.getAnswer());
        Optional<OneQuestionManyAns> optional = oneQuestionManyAnsRepository.findById(oneQuestionManyAns.getId());
        if (optional.isPresent()) {
            OneQuestionManyAns fromDbQuestion = optional.get();
            List<ManyAnswer> fromDbAnswer = new ArrayList<>(fromDbQuestion.getAnswer());
            fromDbAnswer.forEach(it -> {
                studentanswer.stream().filter(std -> std.getAnswer().equals(it.getAnswer()));
            });

        } else {

        }
        return response;
    }

    public static void main(String[] args) {
        ManyAnswer m1 = new ManyAnswer();
        ManyAnswer m2 = new ManyAnswer();
        ManyAnswer m3 = new ManyAnswer();
        ManyAnswer m4 = new ManyAnswer();

        m1.setAnswer("aman");
        m2.setAnswer("Suraj");
        m3.setAnswer("abhay");
        m4.setAnswer("Aditya");
        List<ManyAnswer> l1 = new ArrayList();
        List<ManyAnswer> l2 = new ArrayList();
        l1.add(m1);
        l1.add(m2);
        l2.add(m3);
        l2.add(m4);
        l2.forEach(it->
        {
            l2.remove()
        });
//        System.out.println(l1);
        System.out.println(l2);


    }
}


