package com.robinvandenhurk.servicecars;

import com.robinvandenhurk.servicecars.domain.ServiceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service")
public class ServiceController {

    @GetMapping
    public ServiceInfo getServiceInfo() {
        return new ServiceInfo("service-cars", "0.1");
    }

}
