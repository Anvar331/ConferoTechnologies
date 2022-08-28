package core;

public class AddServiceRequest {

    private Service service;

    public AddServiceRequest(Service service){
        this.service = service;
    }

    public AddServiceRequest() { }

    public Service getService(){
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
}
