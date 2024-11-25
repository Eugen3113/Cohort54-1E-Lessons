package homework_21.task2;

public class Computer {

    private Processor processor; // процессор
    private Memory memory;       // память
    private Storage storage;// накопитель

    public Computer(Processor processor, Storage storage, Memory memory) {
        this.processor = processor;
        this.storage = storage;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", storage=" + storage +
                '}';
    }

    public void setProcessor(Processor processor) {

        this.processor = processor;
    }

    public void setMemory(Memory memory) {

        this.memory = memory;
    }
}
