package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class AddServiceController {

    @Autowired
    private AddService addService;

        @GetMapping(value = "/addSerivce")
        public String showAddServicePage(ModelMap modelMap) {
            modelMap.addAttribute("request", new AddServiceRequest());
            return "addService";

    }

        @PostMapping("/addSerivce")
        public String processAddServiceRequest(@ModelAttribute(value = "request") AddProductRequest request, ModelMap modelMap) {
            AddServiceResponse response = addService.execute(request);
            if (response.hasErrors()) {
                modelMap.addAttribute("errors", response.getErrors());
                return "/addService";
            } else {
                return "index";
            }
        }
    }


