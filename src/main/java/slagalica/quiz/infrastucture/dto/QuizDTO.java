package slagalica.quiz.infrastucture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import slagalica.quiz.infrastucture.Request.QuizRequest;
import slagalica.quiz.infrastucture.Response.QuizResponse;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDTO {

    private Long id;
    private int number1;
    private int number2;
    private int number3;
    private int number4;

    private int result;

    public static QuizDTO fromRequestToDto(QuizRequest quizRequest){
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setResult(quizRequest.getResult());
        return quizDTO;
    }

    public QuizResponse fromDtoToResponse(){
        QuizResponse quizResponse = new QuizResponse();
        quizResponse.setId(this.getId());
        quizResponse.setNumber1(this.getNumber1());
        quizResponse.setNumber2(this.getNumber2());
        quizResponse.setNumber3(this.getNumber3());
        quizResponse.setNumber4(this.getNumber4());
        quizResponse.setResult(this.getResult());
        return quizResponse;
    }
}
