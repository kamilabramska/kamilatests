package helpers.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Flags {

    private List<String> sources;
    @JsonProperty("meteoalarm-license")
    private String meteoalarmLicense;
    @JsonProperty("nearest-station")
    private Double nearestStation;
    private String units;

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getMeteoalarmLicense() {
        return meteoalarmLicense;
    }

    public void setMeteoalarmLicense(String meteoalarmLicense) {
        this.meteoalarmLicense = meteoalarmLicense;
    }

    public Double getNearestStation() {
        return nearestStation;
    }

    public void setNearestStation(Double nearestStation) {
        this.nearestStation = nearestStation;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Flags{" +
                "sources=" + sources +
                ", meteoalarmLicense='" + meteoalarmLicense + '\'' +
                ", nearestStation=" + nearestStation +
                ", units='" + units + '\'' +
                '}';
    }
}
