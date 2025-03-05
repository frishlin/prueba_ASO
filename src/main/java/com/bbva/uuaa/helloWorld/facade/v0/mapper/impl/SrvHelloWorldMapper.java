package com.bbva.uuaa.helloWorld.facade.v0.mapper.impl;

import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.springframework.stereotype.Service;

@Service
public class SrvHelloWorldMapper {
        //implements ISrvHelloWorldMapper {

    //@Override
    public DtoOut map(DtoIn dtoIn) {
        DtoOut dtoOut = new DtoOut();
        dtoOut.setNuip(dtoIn.getNuip());
        dtoOut.setDetails(dtoIn.getDetails());
        return dtoOut;
    }
}
