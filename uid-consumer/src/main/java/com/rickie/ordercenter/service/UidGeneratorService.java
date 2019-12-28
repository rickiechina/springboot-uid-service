package com.rickie.ordercenter.service;

import com.baidu.fsg.uid.UidGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UidGeneratorService {
    @Resource
    private UidGenerator uidGenerator;

    public long getUid() {
        System.out.println(uidGenerator.getClass().getName());
        return uidGenerator.getUID();
    }

    public String parseUID(long uid) {
        return uidGenerator.parseUID(uid);
    }
}
