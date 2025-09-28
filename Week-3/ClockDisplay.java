public class ClockDisplay {
    private DigitDisplay hours;
    private DigitDisplay minutes;
    private String displayString;

    public ClockDisplay() {
        hours = new DigitDisplay(24);
        minutes = new DigitDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute) {
        hours = new DigitDisplay(24);
        minutes = new DigitDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
