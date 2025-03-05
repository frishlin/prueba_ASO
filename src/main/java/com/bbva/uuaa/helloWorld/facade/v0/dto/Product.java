package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Product {
    @Pattern(regexp = "TDC", message = "product.id solo puede ser 'TDC'")
    private String id;
    @NotNull
    private Subproduct subproduct;
}
