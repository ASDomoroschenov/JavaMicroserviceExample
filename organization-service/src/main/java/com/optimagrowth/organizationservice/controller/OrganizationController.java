package com.optimagrowth.organizationservice.controller;

import com.optimagrowth.organizationservice.model.Organization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/organization")
public class OrganizationController {
    @RequestMapping(value="/{organizationId}",method = RequestMethod.GET)
    public ResponseEntity<Organization> getOrganization(@PathVariable("organizationId") String organizationId) {
        return ResponseEntity.ok(Organization.builder()
                .contactEmail("asdomoroschenov@mail.ru")
                .id("0")
                .contactPhone("89687175030")
                .contactName("Alexandr")
                .name("Alexandr")
                .build());
    }
}
