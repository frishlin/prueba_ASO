package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class Subproduct {
    @Size(max = 2, message = "subproduct.id solo puede tener de 0 a 2 caracteres")
    private String id;
}
