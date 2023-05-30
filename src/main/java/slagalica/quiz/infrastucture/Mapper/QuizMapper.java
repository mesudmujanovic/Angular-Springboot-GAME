package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.QuizEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.QuizDTO;

public enum QuizMapper implements DtoMapper<QuizEntity, QuizDTO> {
    INSTANCE;

    @Override
    public QuizEntity apply(QuizDTO quizDto) {
        QuizEntity quizEntity = new QuizEntity();
        quizEntity.setId(quizDto.getId());
        quizEntity.setNumber1(quizDto.getNumber1());
        quizEntity.setNumber2(quizDto.getNumber2());
        quizEntity.setNumber3(quizDto.getNumber3());
        quizEntity.setNumber4(quizDto.getNumber4());
        quizEntity.setResult(quizDto.getResult());
        return quizEntity;
    }
}
