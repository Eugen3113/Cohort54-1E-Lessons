package homework_15_02;

public class FigureSkaterMain {
    public static void main(String[] args) {

        FigureSkater figureSkater = new FigureSkater("Betty", "New York", 5);


        figureSkater.skate();
        figureSkater.training();
        figureSkater.jump();
        System.out.println();

        FigureSkater figureSkater1 = new FigureSkater("Sita","Ulm");
        figureSkater1.info();

        FigureSkater figureSkater2 = new FigureSkater("Bob", "San Antoni", 2);
        figureSkater2.info();

        figureSkater.info();
    }
}
