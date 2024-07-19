package mirzapur_project_core_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Mirzapur Project ! ");

        KaleenBhaiya kaleenBhaiya = new KaleenBhaiya(75,85, 95, 95);
        GudduPandit gudduPandit = new GudduPandit(95, 80, 80, 45);
        MunnaTripathi munnaTripathi = new MunnaTripathi(65, 80, 80, 65);
        SharadShukla sharadShukla = new SharadShukla(70, 65, 70, 75);

//        System.out.println("Kaleen Bhaiya : " + kaleenBhaiya.getAveragePower());
//        System.out.println("Guddu Pandit : "+ gudduPandit.getAveragePower());
//        System.out.println("Munna Tripathi : "+ munnaTripathi.getAveragePower());
//        System.out.println("Sharad Shukla : "+ sharadShukla.getAveragePower());

        List<Bahubali> team1 = new ArrayList<>();
        team1.add(munnaTripathi);
        team1.add(sharadShukla);

        List<Bahubali> team2 = new ArrayList<>();
        team2.add(gudduPandit);
        team2.add(kaleenBhaiya);

        whoWins(team1,team2);

    }

    public static void whoWins(List<Bahubali> team1, List<Bahubali> team2){
        int averagePowerTeam1 = 0;
        int averagePowerTeam2 = 0;

        for (Bahubali bahubali : team1){
            averagePowerTeam1 = averagePowerTeam1 + bahubali.getAveragePower();
        }

        for (Bahubali bahubali : team2){
            averagePowerTeam2 = averagePowerTeam2 + bahubali.getAveragePower();
        }

        if (averagePowerTeam1 > averagePowerTeam2)
            System.out.println("Team 1 Wins!!! " + averagePowerTeam1 + " " + averagePowerTeam2);
        else
            System.out.println("Team 2 Wins!!!" + averagePowerTeam1 + " " + averagePowerTeam2);
    }
}
