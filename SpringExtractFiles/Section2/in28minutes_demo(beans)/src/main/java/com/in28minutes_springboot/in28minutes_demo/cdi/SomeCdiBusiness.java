package com.in28minutes_springboot.in28minutes_demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCDIDAO;

	public SomeCdiDao getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

	
	
}
