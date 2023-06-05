package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.AssociationEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.AssociationDto;

public enum AssociationDtoMapper implements DtoMapper<AssociationDto, AssociationEntity> {
    INSTANCE;

    @Override
    public AssociationDto apply(AssociationEntity associationEntity) {
        AssociationDto associationDto = new AssociationDto();
        associationDto.setId(associationEntity.getId());
        associationDto.setColumnA(associationEntity.getColumnA());
        associationDto.setColumnB(associationEntity.getColumnB());
        associationDto.setColumnC(associationEntity.getColumnC());
        associationDto.setColumnD(associationEntity.getColumnD());
        associationDto.setSolutions(associationEntity.getSolutions());
        associationDto.setFinallSolutions(associationEntity.getFinallSolutions());
        return associationDto;
    }
}
