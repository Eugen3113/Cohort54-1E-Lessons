package lesson_25.generics;

// T - type, E - element, K - key, V-value
public class GenericBox <T> {

    private T value;  // T == String

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox: {" +
                "value=" + value +
                '}';
    }
}