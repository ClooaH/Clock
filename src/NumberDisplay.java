public class NumberDisplay {

    private int limit = 0;
    private int value = 0;

    public NumberDisplay(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (0 <= value && value < limit) {
            this.value = value;
        }
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public void increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }
}
