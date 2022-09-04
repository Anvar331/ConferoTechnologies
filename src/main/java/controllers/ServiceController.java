package controllers;

import org.springframework.web.bind.annotation.*;
import requests.ServiceRequest;
import responses.MainResponse;

@RestController
@RequestMapping("/service")
public class ServiceController {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public MainResponse showStatus() {
        return new MainResponse(SUCCESS_STATUS,1);
    }

    @PostMapping
    public MainResponse add(@RequestParam(value = "key") String key, @RequestBody ServiceRequest request) {

        final MainResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            String personalId = request.getPersonalId();
            String dateOfBirth = request.getDateOfBirth();
            response = new MainResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new MainResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;

    }

}
