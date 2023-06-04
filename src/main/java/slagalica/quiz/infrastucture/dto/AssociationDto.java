package slagalica.quiz.infrastucture.dto;

import lombok.Data;
import slagalica.quiz.infrastucture.Request.AssociationRequest;
import slagalica.quiz.infrastucture.Response.AssociationResponse;
import java.util.List;

@Data
public class AssociationDto {

    private Long id;
    private List<String> columnA;

    private List<String> columnB;

    private List<String> columnC;

    private List<String> columnD;

    private List<String> solutions;


    public static AssociationDto fromRequestToDto(AssociationRequest associationRequest){
        AssociationDto associationDto = new AssociationDto();
        associationDto.setColumnA(associationRequest.getColumnA());
        associationDto.setColumnB(associationRequest.getColumnB());
        associationDto.setColumnC(associationRequest.getColumnC());
        associationDto.setColumnD(associationRequest.getColumnD());
        associationDto.setSolutions(associationRequest.getSolutions());
        return associationDto;
    }

    public AssociationResponse fromDtoToAssociationResponse(){
        AssociationResponse associationResponse = new AssociationResponse();
        associationResponse.setId(this.getId());
        associationResponse.setColumnA(this.getColumnA());
        associationResponse.setColumnB(this.getColumnB());
        associationResponse.setColumnC(this.getColumnC());
        associationResponse.setColumnD(this.getColumnD());
        associationResponse.setSolutions(this.getSolutions());
        return associationResponse;
    }

}
