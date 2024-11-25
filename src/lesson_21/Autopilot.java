package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.11.2024
 */

public class Autopilot {

    private String softwareVersion;
    // Двунаправленная связь // Autopilot незнал про автобус(автобус знал об Autopilot)
    private Autobus autobus; // делаем связь (добавляем ссылку на автобус и get, set)

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override                // метод возвращающиё строку // Alt + Einfg
    public String toString() {
        return "Autopilot: {" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}

