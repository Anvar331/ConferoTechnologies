package core;

import controllers.AddServiceController;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void addServiceTest() {

    AddServiceController firstService = new AddServiceController();
    firstService.addService("230992-1931","23-09-1992");

    String idOfFirstService = firstService.getPersonalId();
    String dateOfBirthOfFirstService = firstService.getDateOfBirth();

    assertTrue(idOfFirstService == "230992-1931");
    assertTrue(idOfFirstService != "230992-1932");

    assertTrue(dateOfBirthOfFirstService == "23-09-1992");
    assertTrue(dateOfBirthOfFirstService != "23-09-1993");

    }

}