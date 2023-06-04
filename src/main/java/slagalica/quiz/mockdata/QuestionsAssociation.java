package slagalica.quiz.mockdata;

import slagalica.quiz.Enitity.AssociationEntity;

import java.util.ArrayList;
import java.util.List;

public class QuestionsAssociation {
    public static AssociationEntity getMockAssociation() {
        List<String> columnA = new ArrayList<>();
        columnA.add("poplava");
        columnA.add("voda");
        columnA.add("nebo");
        columnA.add("duga");

        List<String> columnB = new ArrayList<>();
        columnB.add("sunce");
        columnB.add("more");
        columnB.add("drvo");
        columnB.add("livada");


        List<String> columnC = new ArrayList<>();
        columnC.add("planina");
        columnC.add("reka");
        columnC.add("šuma");
        columnC.add("trava");

        List<String> columnD = new ArrayList<>();
        columnD.add("grad");
        columnD.add("automobil");
        columnD.add("beton");
        columnD.add("ulica");

        AssociationEntity entity = AssociationEntity.builder()
                .columnA(columnA)
                .columnB(columnB)
                .columnC(columnC)
                .columnD(columnD)
                .build();

        entity.addSolution("columnA_solution kisa");
        entity.addSolution("columnB_solution cvet");
        entity.addSolution("columnC_solution ptica");
        entity.addSolution("columnD_solution svetlo");

        return entity;
    }

    public static AssociationEntity getMockAssociation2() {
        List<String> columnA = new ArrayList<>();
        columnA.add("plavo");
        columnA.add("nebo");
        columnA.add("letenje");
        columnA.add("ptica");


        List<String> columnB = new ArrayList<>();
        columnB.add("žuto");
        columnB.add("sunce");
        columnB.add("toplota");
        columnB.add("energija");


        List<String> columnC = new ArrayList<>();
        columnC.add("zeleno");
        columnC.add("drvo");
        columnC.add("priroda");
        columnC.add("ozelenjavanje");


        List<String> columnD = new ArrayList<>();
        columnD.add("crveno");
        columnD.add("ljubav");
        columnD.add("strast");
        columnD.add("vatromet");


        AssociationEntity entity = AssociationEntity.builder()
                .columnA(columnA)
                .columnB(columnB)
                .columnC(columnC)
                .columnD(columnD)
                .build();

        entity.addSolution("columnA_solution visina");
        entity.addSolution("columnB_solution svetlost");
        entity.addSolution("columnC_solution svezina");
        entity.addSolution("columnD_solution energija");

        return entity;
    }

}

