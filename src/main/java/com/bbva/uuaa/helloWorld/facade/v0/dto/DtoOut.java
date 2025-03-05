package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DtoOut implements Serializable {
    private String id;
    private String nuip;
    private Details details;
}
