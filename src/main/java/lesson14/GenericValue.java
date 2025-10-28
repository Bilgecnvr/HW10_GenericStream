package lesson14;

public class GenericValue<T> {
    private T value;

    // Constructor
    public GenericValue(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }

    // Tipine göre özel mesajla yazdırma
    public void printValue() {
        if (value instanceof String) {
            System.out.println("String değer: " + value);
        } else if (value instanceof Integer) {
            System.out.println("Integer değer: " + value);
        } else {
            System.out.println("Genel değer: " + value);
        }
    }
}
