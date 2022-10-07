package entities;

public class CalculatorTime {
    private String serviceName;
    private long start;
    private long end;

    public CalculatorTime() {
    }

    public CalculatorTime(String serviceName) {
        this.serviceName = serviceName;
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "{serviceName: \"" + serviceName + "\", time: \"" + getTime() + " ms\"}";
    }
}
