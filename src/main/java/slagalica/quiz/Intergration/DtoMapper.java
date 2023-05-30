package slagalica.quiz.Intergration;

public interface DtoMapper <T, C>{
    public <T> T apply(C c);
}