package helpers;

import java.util.List;

public class Hourly {

    private String summary;
    private String icon;
    List<DataElementHourly> data;

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

    public List<DataElementHourly> getData() {
        return data;
    }

    public void setData(List<DataElementHourly> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
