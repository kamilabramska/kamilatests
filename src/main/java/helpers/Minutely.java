package helpers;

import java.util.List;

public class Minutely {

    private String summary;
    private String icon;
    List<DataElementMinutely> data;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<DataElementMinutely> getData() {
        return data;
    }

    public void setData(List<DataElementMinutely> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Minutely{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
