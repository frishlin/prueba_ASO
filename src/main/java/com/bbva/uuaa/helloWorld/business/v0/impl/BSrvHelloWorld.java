package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.SecureRandom;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
    private static final int ID_LENGTH = 10;
    private static final SecureRandom random = new SecureRandom();

    @Override
    //CREAR MÉTODO PARA EL MAPPER
    public BDtoOut mapBusiness(BDtoIn dtoIn) {
        BDtoOut dtoOut = new BDtoOut();
        BDetails details = new BDetails();
        BLimitAmount limitAmount = dtoIn.getDetails().getLimitAmount();
        BMinimumAmount minimumAmount = new BMinimumAmount();
        BMaximumAmount maximumAmount = new BMaximumAmount();
        BProduct product = dtoIn.getDetails().getProduct();

        dtoOut.setId(generateRandomId());

        dtoOut.setNuip(dtoIn.getNuip());
        details.setOfferType(dtoIn.getDetails().getOfferType());
        details.setLimitAmount(limitAmount);

        //10%
        BigDecimal amount = new BigDecimal(limitAmount.getAmount());
        BigDecimal minAmount = amount.multiply(BigDecimal.valueOf(0.90));
        minimumAmount.setAmount(minAmount.intValue());
        minimumAmount.setCurrency(limitAmount.getCurrency());

        //5%
        BigDecimal maxAmount = amount.multiply(BigDecimal.valueOf(1.05));
        maximumAmount.setAmount(maxAmount.intValue());
        maximumAmount.setCurrency(limitAmount.getCurrency());

        //asignando valores obtenidos a details
        details.setMinimumAmount(minimumAmount);
        details.setMaximumAmount(maximumAmount);
        details.setProduct(product);

        dtoOut.setDetails(details);
        return dtoOut;
    }

    private String generateRandomId() {
        StringBuilder sb = new StringBuilder(ID_LENGTH);
        for(int i = 0; i < ID_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

}
