package slagalica.quiz.Enitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "association")
@Builder
public class AssociationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> columnA;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> columnB;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> columnC;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> columnD;

    @ElementCollection(fetch = FetchType.LAZY)
    @Column(name = "solution")
    private List<String> solutions;


    public void addSolution(String solution) {
        if (solutions == null) {
            solutions = new ArrayList<>();
        }
        solutions.add(solution);
    }


}

