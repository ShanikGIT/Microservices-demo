package com.quiz.repositories;
import com.quiz.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizRepo extends JpaRepository<Quiz, Integer>
{
    Optional<Quiz> findById(Long id);
}

