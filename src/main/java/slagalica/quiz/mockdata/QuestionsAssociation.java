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
        columnA.add("kisa");

        List<String> columnB = new ArrayList<>();
        columnB.add("sunce");
        columnB.add("more");
        columnB.add("drvo");
        columnB.add("livada");
        columnB.add("cvet");

        List<String> columnC = new ArrayList<>();
        columnC.add("planina");
        columnC.add("reka");
        columnC.add("šuma");
        columnC.add("trava");
        columnC.add("ptica");

        List<String> columnD = new ArrayList<>();
        columnD.add("grad");
        columnD.add("automobil");
        columnD.add("beton");
        columnD.add("ulica");
        columnD.add("svetlo");

        return AssociationEntity.builder()
                .columnA(columnA)
                .columnB(columnB)
                .columnC(columnC)
                .columnD(columnD)
                .build();
    }

    public static AssociationEntity getMockAssociation2() {
        List<String> columnA = new ArrayList<>();
        columnA.add("plavo");
        columnA.add("nebo");
        columnA.add("letenje");
        columnA.add("ptica");
        columnA.add("visina");

        List<String> columnB = new ArrayList<>();
        columnB.add("žuto");
        columnB.add("sunce");
        columnB.add("toplota");
        columnB.add("energija");
        columnB.add("svetlost");

        List<String> columnC = new ArrayList<>();
        columnC.add("zeleno");
        columnC.add("drvo");
        columnC.add("priroda");
        columnC.add("ozelenjavanje");
        columnC.add("svežina");

        List<String> columnD = new ArrayList<>();
        columnD.add("crveno");
        columnD.add("ljubav");
        columnD.add("strast");
        columnD.add("vatromet");
        columnD.add("energično");

        return AssociationEntity.builder()
                .columnA(columnA)
                .columnB(columnB)
                .columnC(columnC)
                .columnD(columnD)
                .build();
    }

}

