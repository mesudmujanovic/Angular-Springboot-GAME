package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.QuizMyNumberEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.QuizMyNumberDTO;

public enum QuizMyNumberMapper implements DtoMapper<QuizMyNumberEntity, QuizMyNumberDTO> {
    INSTANCE;

    @Override
    public QuizMyNumberEntity apply(QuizMyNumberDTO quizDto) {
        QuizMyNumberEntity quizEntity = new QuizMyNumberEntity();
        quizEntity.setId(quizDto.getId());
        quizEntity.setNumber1(quizDto.getNumber1());
        quizEntity.setNumber2(quizDto.getNumber2());
        quizEntity.setNumber3(quizDto.getNumber3());
        quizEntity.setNumber4(quizDto.getNumber4());
        quizEntity.setNumber5(quizDto.getNumber5());
        quizEntity.setNumber6(quizDto.getNumber6());
        quizEntity.setResult(quizDto.getResult());
        return quizEntity;
    }
}
