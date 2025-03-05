package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter

public class DtoIn implements Serializable {
    @NotNull
    private String nuip;
    @NotNull
    private Details details;
}
