package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service
@SN (registryID = "SNGG20240069", logicalID = "simulations")
@VN (vnn = "v0")
@Path ("/v0")

public class SrvHelloWorld implements ISrvHelloWorld {
	@Autowired
	IBSrvHelloWorld business;
	@POST
	//@Path("/simulations")
	@Path("/simulations/{nuip}")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMGG20240679", logicalID = "simulations")
	@Override
	public  ServiceResponseCreated<DtoOut> simulations(@Valid DtoIn dtoIn, @PathParam("nuip") String nuip) {
		ISrvHelloWorldMapper mapper = Mappers.getMapper(ISrvHelloWorldMapper.class);
		dtoIn.setNuip(nuip);
		DtoOut dtoOut = mapper.mapOut(business.mapBusiness(mapper.mapIn(dtoIn)));
		return ServiceResponseCreated.data(dtoOut).build();
	}
}