package homework_15_01;

public class TeacherMain {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Natalia", "Chemistry", "Rome", 15);

        teacher.calls();
        teacher.write();
        teacher.resting();

        System.out.println();

        String teacherName = teacher.name;
        System.out.println("Имя: " + teacherName);

        int teacherExperience = teacher.experience;
        System.out.println("Стаж: " + teacherExperience);

        System.out.println();

        teacher.info();

    }

}
