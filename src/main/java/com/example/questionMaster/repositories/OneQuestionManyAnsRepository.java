package com.example.questionMaster.repositories;

import com.example.questionMaster.model.OneQuestionManyAns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OneQuestionManyAnsRepository extends JpaRepository<OneQuestionManyAns,Long> {
}
