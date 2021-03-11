package com.robinvandenhurk.serviceemail;

import com.robinvandenhurk.serviceemail.domain.ServiceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service")
public class ServiceController {

    @GetMapping
    public ServiceInfo getServiceInfo() {
        return new ServiceInfo("service-email", "0.1");
    }

}
