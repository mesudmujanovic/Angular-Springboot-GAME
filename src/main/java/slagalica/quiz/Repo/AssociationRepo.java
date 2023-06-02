package slagalica.quiz.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import slagalica.quiz.Enitity.AssociationEntity;

public interface AssociationRepo extends JpaRepository<AssociationEntity, Long> {
}
