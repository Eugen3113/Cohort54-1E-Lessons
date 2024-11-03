package homework_15_03;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Stiven", "Schillerschool", 14);


        student.skippingclasses();
        student.writtingoff();
        student.sport();
        student.sick();

        System.out.println();

        student.info();
    }
}
