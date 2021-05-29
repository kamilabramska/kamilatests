package helpers;

public class RequestBody {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RequestBody(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "helpers.RequestBody{" +
                "address='" + address + '\'' +
                '}';
    }
}
