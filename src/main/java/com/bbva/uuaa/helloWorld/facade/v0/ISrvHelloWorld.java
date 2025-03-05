package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;


public interface ISrvHelloWorld {

	//ServiceResponse<DtoIn> helloWorld ();
	//ServiceResponseCreated<DtoOut> login (DtoIn dtoIn);
	//ServiceResponseCreated<DtoOut>simulations(String nuip, DtoIn dtoIn);
	ServiceResponseCreated<DtoOut>simulations(DtoIn dtoIn, String nuip);
	//ServiceResponseCreated<DataOut> helloWorldPost(DataIn dataIn, String nuip);
}
