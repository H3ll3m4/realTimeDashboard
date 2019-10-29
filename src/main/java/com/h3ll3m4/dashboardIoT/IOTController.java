package com.h3ll3m4.dashboardIoT;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOTController {
    Device instrument;
	
	public IOTController() {
		instrument = new Device();
	}

	@CrossOrigin
    @RequestMapping("/freeboard")// 
    public Reading reading() {
 		return instrument.getAllReadout();
    }
}
