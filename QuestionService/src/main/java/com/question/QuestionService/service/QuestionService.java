package com.question.QuestionService.service;

import com.question.QuestionService.entitis.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService
{
    Question add(Question question);
    List<Question> findAll();
    Question findById(long id);
    List<Question> findAllbyQuizId(long quizId);
}
