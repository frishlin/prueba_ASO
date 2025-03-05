package com.bbva.uuaa.helloWorld.business.v0.dto;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter

public class BDtoIn {
    @NotNull
    private String nuip;
    @NotNull
    private BDetails details;
}
