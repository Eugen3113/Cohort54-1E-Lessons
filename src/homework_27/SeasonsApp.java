package homework_27;

public class SeasonsApp {

    public static void main(String[] args) {

        for (Seasons enumSeasons : Seasons.values()) {
            System.out.println("season: " + enumSeasons);
            System.out.println("average temperature: " + enumSeasons.getAverageTemperature());
            System.out.println(enumSeasons.test());
            System.out.println("\n=============\n");


        }
    }
}
