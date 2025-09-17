package com.quiz.services;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService
{
    private final QuizRepo quizRepo;
    private final QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz)
    {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizes =  quizRepo.findAll();
        List<Quiz> newQuizes = quizes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getAllbyQuiz(quiz.getId()));
            return quiz;
                }).collect(Collectors.toList());
        return newQuizes;
    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz =  quizRepo.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getAllbyQuiz(quiz.getId()));
        return quiz;
    }
}
