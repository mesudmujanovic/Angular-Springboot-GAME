package slagalica.quiz.infrastucture.Response;

import lombok.Data;

@Data
public class QuizResponse {
    private Long id;

    private int number1;

    private int number2;

    private int number3;

    private int number4;

    private int result;
}
