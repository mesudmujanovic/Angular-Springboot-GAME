package slagalica.quiz.Service.Impl;

import org.springframework.stereotype.Service;
import slagalica.quiz.Enitity.QuizEntity;
import slagalica.quiz.Repo.QuizGameRepo;
import slagalica.quiz.Service.QuizService;
import slagalica.quiz.infrastucture.Mapper.QuizDtoMapper;
import slagalica.quiz.infrastucture.Mapper.QuizMapper;
import slagalica.quiz.infrastucture.dto.QuizDTO;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuizGameRepo quizRepository;

    public QuizServiceImpl(QuizGameRepo quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public QuizDTO createQuizWithRandomNumbers() {
        QuizDTO quizDTO = generateQuizDTOWithRandomNumbers();
        QuizEntity quizEntity = QuizMapper.INSTANCE.apply(quizDTO);
        quizEntity = quizRepository.save(quizEntity);
        return QuizDtoMapper.INSTANCE.apply(quizEntity);
    }

    private QuizDTO generateQuizDTOWithRandomNumbers() {
        Random random = new Random();
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setNumber1(random.nextInt(9) + 1);
        quizDTO.setNumber2(random.nextInt(9) + 1);
        quizDTO.setNumber3(random.nextInt(9) + 1);
        quizDTO.setNumber4(random.nextInt(9) + 1);
        return quizDTO;
    }

    @Override
    public List<QuizDTO> getAllQuiz() {
        List<QuizEntity> quizEntityList = quizRepository.findAll();
        return quizEntityList.stream().map(QuizDtoMapper.INSTANCE::apply).collect(Collectors.toList());
    }
}
