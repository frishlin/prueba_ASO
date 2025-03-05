package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Details {
    @Pattern(regexp = "[A-Z]+", message = "offerType debe estar en MAYÚSCULAS")
    private String offerType;
    @NotNull
    private LimitAmount limitAmount;
    private MinimumAmount minimumAmount;
    private MaximumAmount maximumAmount;
    @NotNull
    private Product product;
}
