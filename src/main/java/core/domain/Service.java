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
        if (service.getPersonalId() != null && service.getDateOfBirth() != null) {
            services.add(service);
            System.out.println("Service is added");
        } else {
            System.out.println("Service is not added, please check if all entries are entered");
        }

    }

}
