package com.question.QuestionService.controller;
import com.question.QuestionService.entitis.Question;
import com.question.QuestionService.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController
{
    private final QuestionService questionService;

    @PostMapping("/add")
    public Question add(@RequestBody Question question)
    {
        return questionService.add(question);
    }

    @GetMapping("/get/{id}")
    public Question getById(@PathVariable long id)
    {
        return questionService.findById(id);
    }

    @GetMapping("/get-all")
    public List<Question> getAll()
    {
        return questionService.findAll();
    }
    @GetMapping("/get-by-quiz/{id}")
    public List<Question> getAllbyQuiz(@PathVariable long id)
    {
        return questionService.findAllbyQuizId(id);
    }

}
