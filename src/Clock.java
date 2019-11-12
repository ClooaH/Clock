public class Clock {

    private NumberDisplay hour;
    private NumberDisplay minute;
    private String displayString = "";

    public Clock() {
        hour = new NumberDisplay(0,24);
        minute = new NumberDisplay(0,60);
    }
    public Clock(int hour, int minute) {
        
    }
    public void timeTick() {
        minute.increment();
        if (minute.getValue() == 0) {
            hour.increment();
        }
    }
    public String getTime() {
        return (hour.getDisplayValue() + ":" + minute.getDisplayValue());
    }

    public static void main(String[] args) {
        NumberDisplay del = new NumberDisplay(54, 60);
        Clock clock = new Clock();
        Clock test = new Clock()
        del.increment();
        System.out.println(del.getDisplayValue());
        System.out.println(clock.getTime());
    }

}
