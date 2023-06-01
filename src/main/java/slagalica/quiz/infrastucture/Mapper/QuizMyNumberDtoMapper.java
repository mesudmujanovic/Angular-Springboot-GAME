package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.QuizMyNumberEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.QuizMyNumberDTO;

public enum QuizMyNumberDtoMapper implements DtoMapper<QuizMyNumberDTO, QuizMyNumberEntity> {
    INSTANCE;


    @Override
    public QuizMyNumberDTO apply(QuizMyNumberEntity quizEntity) {
        QuizMyNumberDTO quizDTO = new QuizMyNumberDTO();
        quizDTO.setId(quizEntity.getId());
        quizDTO.setNumber4(quizEntity.getNumber4());
        quizDTO.setNumber3(quizEntity.getNumber3());
        quizDTO.setNumber2(quizEntity.getNumber2());
        quizDTO.setNumber1(quizEntity.getNumber1());
        quizDTO.setNumber5(quizEntity.getNumber5());
        quizDTO.setNumber6(quizEntity.getNumber6());
        quizDTO.setResult(quizEntity.getResult());
        return quizDTO;
    }
}
