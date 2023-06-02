package slagalica.quiz.Enitity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> columnA;

    public static AssociationEntity getMockAssociation() {
        List<String> columnA = new ArrayList<>();
        columnA.add("sssssss");
        columnA.add("qqqqqqqqq");
        columnA.add("sssssssss");
        return  builder()
                .columnA(columnA)
                .build();
    }


}
