package helpers.backend;

import java.util.Date;

public class DataElementMinutely {

    private Date time;
    private Double precipIntensity;
    private Double precipProbability;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    @Override
    public String toString() {
        return "DataElementMinutely{" +
                "time=" + time +
                ", precipIntensity=" + precipIntensity +
                ", precipProbability=" + precipProbability +
                '}';
    }
}
