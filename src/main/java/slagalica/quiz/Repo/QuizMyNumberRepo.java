package slagalica.quiz.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import slagalica.quiz.Enitity.QuizMyNumberEntity;

@Repository
public interface QuizMyNumberRepo extends JpaRepository<QuizMyNumberEntity,Long> {
}
