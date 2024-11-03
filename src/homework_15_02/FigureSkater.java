package homework_15_02;

public class FigureSkater {

    String name;
    String city;
    int medals;

    public FigureSkater(String figureSkatesName, String city) {
        name = figureSkatesName;
        this.city = city;
    }


    public FigureSkater(String figureSkaterName, String city, int medals) {
        this.name = figureSkaterName;
        this.city = city;
        this.medals = medals;

    }

    public FigureSkater() {

    }

    public void skate() {
        System.out.println("Я катаюсь на коньках");
    }

    public void training() {
        System.out.println("Я тренируюсь");
    }

    public void jump() {
        System.out.println("Я прыгаю");
    }

    public void info() {
        System.out.printf("Моё имя %s, город: %s, медалей: %d\n", name, city, medals);
    }
}
