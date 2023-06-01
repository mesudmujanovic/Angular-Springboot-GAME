package slagalica.quiz.Service;
import slagalica.quiz.infrastucture.dto.QuizMyNumberDTO;
import java.util.List;

public interface QuizMyNumberService {
  public QuizMyNumberDTO createQuizWithRandomNumbers();

  public List<QuizMyNumberDTO> getAllQuiz();

}

