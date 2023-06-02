package slagalica.quiz.Service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slagalica.quiz.Enitity.AssociationEntity;
import slagalica.quiz.Repo.AssociationRepo;
import slagalica.quiz.Service.AssociationService;
import slagalica.quiz.infrastucture.Mapper.AssociationDtoMapper;
import slagalica.quiz.infrastucture.Mapper.AssociationMapper;
import slagalica.quiz.infrastucture.dto.AssociationDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssociationServiceImpl implements AssociationService {

    @Autowired
    private AssociationRepo associationRepo;

    @Autowired
    private ObjectMapper objectMapper;


    @Override
    public AssociationDto saveAssociation(AssociationDto associationDto) {
        AssociationEntity associationEntity = AssociationMapper.INSTANCE.apply(associationDto);
        AssociationEntity associationEntitySave = associationRepo.save(associationEntity);
        return AssociationDtoMapper.INSTANCE.apply(associationEntitySave);
    }

    @Override
    public List<AssociationDto> getAll() {
        List<AssociationEntity> associationEntities = associationRepo.findAll();
        return associationEntities.stream().map(AssociationDtoMapper.INSTANCE::apply).collect(Collectors.toList());
    }


}
