package com.rickie.ordercenter.controller;

import com.rickie.ordercenter.service.UidGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UidGeneratorController {
    @Autowired
    private UidGeneratorService uidGenService;

    @GetMapping("/getUid")
    public String getUid() {
        return String.valueOf( uidGenService.getUid() );
    }

    @GetMapping("/parseUid/{uid}")
    public String parseUid(@PathVariable("uid") long uid) {
        String parsedInfo = uidGenService.parseUID(uid);
        return parsedInfo;
    }
}
