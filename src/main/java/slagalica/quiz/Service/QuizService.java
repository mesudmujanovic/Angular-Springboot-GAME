package slagalica.quiz.Service;

import slagalica.quiz.Enitity.QuizEntity;
import slagalica.quiz.infrastucture.dto.QuizDTO;

import java.security.PublicKey;
import java.util.List;

public interface QuizService {
  public QuizDTO createQuizWithRandomNumbers();

  public List<QuizDTO> getAllQuiz();

}

