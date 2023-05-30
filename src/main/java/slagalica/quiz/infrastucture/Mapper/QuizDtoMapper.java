package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.QuizEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.QuizDTO;

public enum QuizDtoMapper implements DtoMapper<QuizDTO, QuizEntity> {
    INSTANCE;


    @Override
    public QuizDTO apply(QuizEntity quizEntity) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setId(quizEntity.getId());
        quizDTO.setNumber4(quizEntity.getNumber4());
        quizDTO.setNumber3(quizEntity.getNumber3());
        quizDTO.setNumber2(quizEntity.getNumber2());
        quizDTO.setNumber1(quizEntity.getNumber1());
        quizDTO.setResult(quizEntity.getResult());
        return quizDTO;
    }
}
