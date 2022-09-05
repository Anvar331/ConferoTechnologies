package core.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    public void positiveResultForAddingServiceTest() {

        String personalId = "220393-13145";
        String dateOfBirth = "22.03.1993";

        Service firstService = new Service(personalId, dateOfBirth);
        ArrayList<Service> allServices = new ArrayList<>();
        allServices.add(firstService);

        assertTrue(firstService.getPersonalId() == "220393-13145");
        assertTrue(firstService.getDateOfBirth() == "22.03.1993");
        assertTrue(allServices.contains(firstService));
    }

    @Test
    public void negativeResultForAddingServiceTest() {

        String personalId = "220393-13145";
        String dateOfBirth = "";

        Service firstService = new Service(personalId, dateOfBirth);
        ArrayList<Service> allServices = new ArrayList<>();
        allServices.add(firstService);

        assertFalse(allServices.contains(firstService.getDateOfBirth()));
    }


}