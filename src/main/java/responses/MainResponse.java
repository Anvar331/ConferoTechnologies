package responses;

public class MainResponse {

    private final String status;
    private final Integer code;

    public MainResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }
}
