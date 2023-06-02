package slagalica.quiz.infrastucture.dto;

import lombok.Data;
import slagalica.quiz.infrastucture.Request.AssociationRequest;
import slagalica.quiz.infrastucture.Response.AssociationResponse;
import java.util.List;

@Data
public class AssociationDto {

    private Long id;
    private List<String> columnA;

    public static AssociationDto fromRequestToDto(AssociationRequest associationRequest){
        AssociationDto associationDto = new AssociationDto();
        associationDto.setColumnA(associationRequest.getColumnA());
        return associationDto;
    }

    public AssociationResponse fromDtoToAssociationResponse(){
        AssociationResponse associationResponse = new AssociationResponse();
        associationResponse.setId(this.getId());
        associationResponse.setColumnA(this.getColumnA());
        return associationResponse;
    }

}
