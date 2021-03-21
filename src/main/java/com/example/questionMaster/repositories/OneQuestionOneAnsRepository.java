package com.example.questionMaster.repositories;

import com.example.questionMaster.model.OneQuestionOneAns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneQuestionOneAnsRepository extends JpaRepository<OneQuestionOneAns,Long> {
}
