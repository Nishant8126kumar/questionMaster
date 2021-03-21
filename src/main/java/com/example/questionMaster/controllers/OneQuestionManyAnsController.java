package com.example.questionMaster.controllers;

import com.example.questionMaster.model.OneQuestionOneAns;
import com.example.questionMaster.services.OneQuestionOneAnsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/many/ans")
public class OneQuestionManyAnsController {

    @Autowired
    OneQuestionOneAnsServices oneQuestionOneAnsServices;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createQuestion(@RequestBody OneQuestionOneAns qObject) {
        return ResponseEntity.ok(oneQuestionOneAnsServices.createQuestion(qObject));
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllQuestion() {
        return ResponseEntity.ok(oneQuestionOneAnsServices.getAllQuestion());
    }

    @GetMapping(value = "/result", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getResult(@RequestBody OneQuestionOneAns oneQuestionOneAns) {
        return ResponseEntity.ok(oneQuestionOneAnsServices.getResult(oneQuestionOneAns));
    }
}
