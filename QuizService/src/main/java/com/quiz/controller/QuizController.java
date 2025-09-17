package com.quiz.controller;


import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
@RequiredArgsConstructor
public class QuizController
{
    private final QuizService quizService;

    //create
    @PostMapping("/add")
    public Quiz createQuiz(@RequestBody Quiz quiz)
    {
        return quizService.add(quiz);
    }

    //get all
    @GetMapping("/get-all")
    public List<Quiz> getQuizzes()
    {
        return quizService.getAll();
    }

    //get
    @GetMapping("/get/{id}")
    public Quiz getQuizById(@PathVariable Long id)
    {
        return quizService.get(id);
    }
}
