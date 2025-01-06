package homework_27;

/*
Реализуйте Enum для определения четырех времен года с методами,
 возвращающими среднюю температуру для каждого времени года.
 */

public enum Seasons {
    WINTER(7),
    SPRING(18),
    SUMMER(33),
    AUTUMN(16);

    private int averageTemperature;

    public String test() {
        return String.format("%s - средняя температура: %d",
                this.name(),
                this.averageTemperature);
    }


    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
