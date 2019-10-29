package com.h3ll3m4.dashboardIoT;

//import java.io.IOException;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Iterator;
//import com.opencsv.CSVReader;
//import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.CsvBindByName;

public class Reading {
    @CsvBindByName(column = "time_stamp")
    private String timestamp;

    @CsvBindByName(column = "pulsometer_readout", required = true)
    private long counter;

    @CsvBindByName(column = "engine_efficiency", required = true)
    private float efficiency;

    @CsvBindByName(column = "red_value", required = true)
    private int red;
    
    @CsvBindByName(column = "blue_value", required = true)
    private int blue;
    
    @CsvBindByName(column = "green_value", required = true)
    private int green;  
    
	public String getTimestamp() {
		return timestamp;
	}

	public long getCounter() {
		return counter;
	}

	public float getEfficiency() {
		return efficiency;
	}

	public int getRed() {
		return red;
	}

	public int getBlue() {
		return blue;
	}

	public int getGreen() {
		return green;
	}



}
