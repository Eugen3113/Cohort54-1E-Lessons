package homework_21.task2;

public class ComponentsApp {

    public static void main(String[] args) {

        Processor processor = new Processor("AMD","Ryzen 9 7900X3D");
        Memory memory = new Memory("Asus", " 16GB");
        Storage storage = new Storage("LGH", " 1TB");

        Computer computer = new Computer(processor, storage, memory);

        System.out.println(computer);

    }
}
