package helpers.backend;

import java.util.List;

public class Daily {

    private String summary;
    private String icon;
    List<DataElementDaily> data;

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

    public List<DataElementDaily> getData() {
        return data;
    }

    public void setData(List<DataElementDaily> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
