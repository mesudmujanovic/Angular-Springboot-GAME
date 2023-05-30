package slagalica.quiz.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import slagalica.quiz.Enitity.QuizEntity;

@Repository
public interface QuizGameRepo extends JpaRepository<QuizEntity,Long> {
}
