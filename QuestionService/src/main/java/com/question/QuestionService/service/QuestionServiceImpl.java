package com.question.QuestionService.service;

import com.question.QuestionService.entitis.Question;
import com.question.QuestionService.repositories.QuestionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService
{

    private final QuestionRepo questionRepo;

    @Override
    public Question add(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    @Override
    public Question findById(long id) {
        return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> findAllbyQuizId(long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
