package helpers;

public class ErrorBody {

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorBody{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
