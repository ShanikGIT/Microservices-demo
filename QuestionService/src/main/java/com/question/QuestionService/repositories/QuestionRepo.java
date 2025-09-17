package com.question.QuestionService.repositories;

import com.question.QuestionService.entitis.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long>
{
    List<Question> findByQuizId( Long quizId);
}
