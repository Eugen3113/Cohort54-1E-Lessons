package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.11.2024
 */

public class BusDriver {
    private static int idCounter = 100; // ставим 100 , чтобы не повторялся с другими id одного класса (например с Autobus)
                                        // на static переменную ненадо  get-еры  и  set-еры давать.
    private final int id;

    private String name;
    private String licenseNumber;

    public BusDriver(String name, String licenseNumber) {
        this.id = idCounter++;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}

