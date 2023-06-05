package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.AssociationEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.AssociationDto;

public enum AssociationMapper implements DtoMapper<AssociationEntity, AssociationDto> {
    INSTANCE;

    @Override
    public AssociationEntity apply(AssociationDto associationDto) {
        AssociationEntity associationEntity = new AssociationEntity();
        associationEntity.setId(associationDto.getId());
        associationEntity.setColumnA(associationDto.getColumnA());
        associationEntity.setColumnB(associationDto.getColumnB());
        associationEntity.setColumnC(associationDto.getColumnC());
        associationEntity.setColumnD(associationDto.getColumnD());
        associationEntity.setSolutions(associationDto.getSolutions());
        associationEntity.setFinallSolutions(associationDto.getFinallSolutions());
        return associationEntity;
    }
}
