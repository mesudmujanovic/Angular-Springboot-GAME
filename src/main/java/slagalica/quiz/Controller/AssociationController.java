package slagalica.quiz.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import slagalica.quiz.Enitity.AssociationEntity;
import slagalica.quiz.Service.AssociationService;
import slagalica.quiz.infrastucture.Request.AssociationRequest;
import slagalica.quiz.infrastucture.Response.AssociationResponse;
import slagalica.quiz.infrastucture.dto.AssociationDto;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/assoc")
@CrossOrigin("*")
public class AssociationController {

    @Autowired
    private AssociationService associationService;

    @PostMapping("/save")
    public ResponseEntity<AssociationResponse> saveAssociation(@RequestBody AssociationRequest associationRequest){
        AssociationDto associationDto = AssociationDto.fromRequestToDto(associationRequest);
        AssociationDto associationDtoSave = associationService.saveAssociation(associationDto);
        return ResponseEntity.ok(associationDtoSave.fromDtoToAssociationResponse());
    }

    @GetMapping("/all")
    public ResponseEntity<List<AssociationResponse>> getAll(){
        List<AssociationDto> associationDtos = associationService.getAll();
        return ResponseEntity.ok(associationDtos.stream().map(AssociationDto::fromDtoToAssociationResponse).collect(Collectors.toList()));
    }
}
