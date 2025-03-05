package com.bbva.uuaa.helloWorld.facade.v0.dto;

import java.io.Serializable;

public class Hello implements Serializable {
	String message;

	//Se elimina constructor para usarlo como dto de entrada
	
	public String getMessage () {
		return message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
}
