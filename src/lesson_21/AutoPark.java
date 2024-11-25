package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.11.2024
 */

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-45844564"); // создаём водителя

        Autobus bus = new Autobus(busDriver, 15); // создаём автобус

        System.out.println(bus.toString());  // выводим информацию об автобусе. Создали связь водителя и автобуса (агрегация)
                                             //Autobus: {id=0 , capacity=15, driver=BusDriver: {id: 100, name: John}  //id=0

        BusDriver peter = new BusDriver("Peter", "LN-12348789"); // создаём другого водителя

        bus.setDriver(peter);   // можем поменять водителя- John на Peter

        System.out.println(bus.toString());    // Autobus: {id=0 , capacity=15, driver=BusDriver: {id: 101, name: Peter}  //id=0,поменялся водитель
        System.out.println(busDriver.toString());  // водитель-  BusDriver: {id: 100, name: John}

        System.out.println("\n====================\n");

        BusDriver margo = new BusDriver("Margo", "AE-433453534"); // создаём другого водителя
        Autobus bus1 = new Autobus(margo, 24);  // создаём автобус bus1

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP-gpt6"); // создаём новый автопилот
        System.out.println(bus1.toString());
        margo.setName("Margo-Susana");        // меняем имя margo -> Margo-Susana
        System.out.println(bus1.toString());

        bus1 = null;  // присвоили ссылку null , объект будет вскоре уничтожен!
        System.out.println(margo.toString());  // но марго существует // BusDriver: {id: 102, name: Margo-Susana}

        System.out.println(bus.toString()); //Autobus: {id=0 , capacity=15, driver=BusDriver: {id: 101, name: Peter}, autopilot=Autopilot: {SV: 'AP-v001'}}
        bus.setDriver(margo); // пересадили марго //Autobus: {id=0 , capacity=15, driver=BusDriver:
                                                 // {id: 102, name: Margo-Susana}, autopilot=Autopilot: {SV: 'AP-v001'}}
        System.out.println(bus.toString());

        System.out.println("\n=======================\n");

        Passenger passenger = new Passenger("Alex");  //  создаём пассажиров
        Passenger passenger1 = new Passenger("Max");  //  создаём пассажиров
        System.out.println(passenger.toString());    // выводим на экран  // Passenger: {id=0, name='Alex'}
        System.out.println(passenger1.toString());   // выводим на экран  // Passenger: {id=1, name='Max'}

        bus.takePassenger(passenger);  // take - брать // садим пассажира в автобус
        System.out.println("count pass: " + bus.getCountPassengers());  // смотрим кол-во пассажиров
        bus.takePassenger(passenger1);                 // садим пассажира в автобус
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger);                  // садим пассажира в автобус // Пассажир id: 0 уже в автобусе
        System.out.println("count pass: " + bus.getCountPassengers());   // кол-во пассажиров неизменилось // count pass: 2

    }
}
