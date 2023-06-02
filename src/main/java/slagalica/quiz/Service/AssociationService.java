package slagalica.quiz.Service;

import org.springframework.stereotype.Service;
import slagalica.quiz.infrastucture.dto.AssociationDto;

import java.util.List;

@Service
public interface AssociationService {

    AssociationDto saveAssociation(AssociationDto associationDto);

    List<AssociationDto> getAll();
}
