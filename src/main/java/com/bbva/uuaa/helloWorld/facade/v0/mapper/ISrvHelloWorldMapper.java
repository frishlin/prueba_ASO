package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ISrvHelloWorldMapper {
    //ESTO YA QUE SE LLEGUE AL PASO DE BUSINESS

    @Mapping(target = "nuip", source = "dtoIn.nuip")
    @Mapping(target = "details", source = "dtoIn.details")
    BDtoIn mapIn(DtoIn dtoIn);

    @Mapping(target = "nuip", source = "bDtoOut.nuip")
    @Mapping(target = "details", source = "bDtoOut.details")
    DtoOut mapOut(BDtoOut bDtoOut);

}
