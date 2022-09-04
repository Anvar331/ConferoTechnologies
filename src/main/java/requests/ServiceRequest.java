package requests;

import java.util.ArrayList;

public class ServiceRequest {

    private String personalId;
    private String dateOfBirth;
    ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
