package com.h3ll3m4.dashboardIoT;

/* 
 * The app connect to the device and check for a reading
 * Each reading includes a time stamp, data from RGB sensor and other data
 * Spring Boot create a Tomcat server with the endpoint:
 * http://localhost:8080/freeboard
 * Freeboard was used to create a dashboard:   
 * dashboard.json to be imported in Freeboard  
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardIoTApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardIoTApplication.class, args);
	}
	


}
