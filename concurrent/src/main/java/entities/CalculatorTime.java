package entities;

public class CalculatorTime {
    private String threadName;
    private long start;
    private long end;

    public CalculatorTime() {
    }

    public CalculatorTime(String threadName) {
        this.threadName = threadName;
    }

    public long getStart() {
        return start;
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public long getEnd() {
        return end;
    }

    public void setEnd() {
        this.end = System.currentTimeMillis();
    }

    public long getTime() {
        return end - start;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "{threadName: \"" + threadName + "\", time: \"" + getTime() + " ms\"}";
    }
}
