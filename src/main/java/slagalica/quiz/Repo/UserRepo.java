package slagalica.quiz.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import slagalica.quiz.Enitity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
