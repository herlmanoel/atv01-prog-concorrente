package entities;

import java.time.Duration;
import java.time.LocalTime;

public class CalculatorTime {
    private String nameThread;
    private LocalTime start;
    private LocalTime end;

    public CalculatorTime() {}

    public LocalTime getStart() {
        return start;
    }

    public void setStart() {
        this.start = LocalTime.now();
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd() {
        this.end = LocalTime.now();
    }

    public Duration getTime() {
        return Duration.between(start, end);
    }

    public String getNameThread() {
        return nameThread;
    }

    public void setNameThread(String nameThread) {
        this.nameThread = nameThread;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "CalculatorTime {" +
                "nameThread='" + nameThread + '\'' +
                "time='" + getTime().getSeconds() + '\'' +
                '}';
    }
}
