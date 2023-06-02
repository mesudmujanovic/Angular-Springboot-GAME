package slagalica.quiz.mockdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import slagalica.quiz.Enitity.AssociationEntity;
import slagalica.quiz.Service.AssociationService;
import slagalica.quiz.infrastucture.Mapper.AssociationDtoMapper;

@Component
public class AssocConfigMock implements CommandLineRunner {

    public AssocConfigMock(AssociationService associationService) {
        this.associationService = associationService;
    }

    @Autowired
    private AssociationService associationService;
    @Override
    public void run(String... args) throws Exception {
     associationService.saveAssociation(AssociationDtoMapper.INSTANCE.apply(AssociationEntity.getMockAssociation()));
    }
}
