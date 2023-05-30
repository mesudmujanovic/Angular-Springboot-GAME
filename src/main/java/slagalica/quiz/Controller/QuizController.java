package slagalica.quiz.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import slagalica.quiz.Service.Impl.QuizServiceImpl;
import slagalica.quiz.infrastucture.Request.QuizRequest;
import slagalica.quiz.infrastucture.Response.QuizResponse;
import slagalica.quiz.infrastucture.dto.QuizDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {

    private final QuizServiceImpl quizService;

    public QuizController(QuizServiceImpl quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/create")
    public ResponseEntity<QuizResponse> createQuizWithRandomNumbers(@RequestBody QuizRequest quizRequest) {
        QuizDTO quizDTO = QuizDTO.fromRequestToDto(quizRequest);
        QuizDTO saveQuizDTO = quizService.createQuizWithRandomNumbers();
        return ResponseEntity.ok(saveQuizDTO.fromDtoToResponse());
    }

    @GetMapping("getAllQuiz")
    public ResponseEntity<List<QuizResponse>> getAllQuiz(){
        List<QuizDTO> quizDTOS = quizService.getAllQuiz();
        return ResponseEntity.ok(quizDTOS.stream().map(QuizDTO::fromDtoToResponse).collect(Collectors.toList()));
    }
}
