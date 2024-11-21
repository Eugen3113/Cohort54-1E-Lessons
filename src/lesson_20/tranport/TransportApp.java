package lesson_20.tranport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.11.2024
 */

public class TransportApp {
    public static void main(String[] args) {

        lesson_20.tranport.Bus bus = new lesson_20.tranport.Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println("\n=======================\n");

        lesson_20.tranport.Train train = new lesson_20.tranport.Train("Train-M1", 2024, 4, 15);

        System.out.println(train.toString());
        System.out.println(train.getModel());
        System.out.println(train.getYear());

        System.out.println("train capacity: " + train.getCapacity());
        train.setCountWagons(6);
        System.out.println("train capacity: " + train.getCapacity());
        train.setCountWagons(1);
        System.out.println("train capacity: " + train.getCapacity());

        System.out.println("\n======================\n");
        lesson_20.tranport.Bus bus1 = new lesson_20.tranport.Bus("Bus-B2", 2024, 3);
        System.out.println(bus1.takePassengers());
        System.out.println("2. =================");
        System.out.println(bus1.takePassengers());
        System.out.println("3. =================");
        System.out.println(bus1.takePassengers());
        System.out.println("4. =================");
        System.out.println(bus1.takePassengers());


        System.out.println("count: " + bus1.getCountPassengers());

        System.out.println("1." + bus1.dropPassengers());
        System.out.println("2." + bus1.dropPassengers());
        System.out.println("3." + bus1.dropPassengers());
        System.out.println("4." + bus1.dropPassengers());
        System.out.println("count: " + bus1.getCountPassengers());

        System.out.println("\n=================\n");

        // UML схемы
        /*
        Unified Modeling Language -  Единый язык моделирования

        Диаграмма классов
         */

        lesson_20.tranport.InternationalBus internationalBus =
                new lesson_20.tranport.InternationalBus("MAN-I1", 2000, 40,
                        new String[] {"Italy", "France", "Spain", "Monaco"});


        System.out.println("year: " + internationalBus.getYear()); // метод и поле из Vehicle
        System.out.println("take Pass: " + internationalBus.takePassengers());  // метод из Bus
        System.out.println("toString: " + internationalBus.toString()); // метод из Vehicle
        System.out.println("capacity: " + internationalBus.getCapacity()); // метод и поле из Bus
        internationalBus.goToRoute(); // метод из InternationalBus

        System.out.println("\n=========================\n");
        String[] strings = {"Italy", "France", "Spain", "Monaco"}; // Явная инициализация (укороченная)
        //String[] strings = new String[]{"Italy", "France", "Spain", "Monaco"}; // Явная инициализация (полная)
        //  strings = {"Java", "Python"}; - присвоение новой ссылки - так не работает

        strings = new String[]{"Java", "Python"};




    }
}

