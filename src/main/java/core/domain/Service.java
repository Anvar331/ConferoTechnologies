package core.domain;

import java.util.ArrayList;

public class Service {

    private String personalId;
    private String dateOfBirth;
    ArrayList<Service> services = new ArrayList<>();

    public String getPersonalId() {
        return personalId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Service(String personalId, String dateOfBirth) {
        this.personalId = personalId;
        this.dateOfBirth = dateOfBirth;
    }

    public void addService(Service service) {
        services.add(service);
    }


}
