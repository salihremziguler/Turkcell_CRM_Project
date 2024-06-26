package com.turkcell.accountService.api.client;

import com.turkcell.accountService.configurations.FeignConfig;
import com.turkcell.commonpackage.utils.dto.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "customer-service", url = "http://localhost:9001",configuration = FeignConfig.class)
public interface CustomerServiceClient {

    @GetMapping("/customerservice/api/v1/individualcustomers/customerClient/{id}")
    ClientResponse customerGetById(@PathVariable int id);

    @GetMapping("/customerservice/api/v1/address/addressClient/{id}")
    ClientResponse addressGetById(@PathVariable int id);

}
