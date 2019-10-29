package com.h3ll3m4.dashboardIoT;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class Device{
	private String path = ".\\..\\dashBoardData.csv";
	Iterator<Reading> csvReadingIterator;
	
	public Device() {
		Reader reader;
		try {
			reader = Files.newBufferedReader(Paths.get(path));
			@SuppressWarnings({ "unchecked", "rawtypes" })
			CsvToBean<Reading> csvToBean = new CsvToBeanBuilder(reader)
	                .withType(Reading.class)
	                .withIgnoreLeadingWhiteSpace(true)
	                .build();

	        csvReadingIterator = csvToBean.iterator();         

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Reading getAllReadout() {
		if (csvReadingIterator.hasNext()) {
	    	Reading r = csvReadingIterator.next();
	        System.out.println("Timestamp : " + r.getTimestamp());
	        System.out.println("Counter : " + r.getCounter());
	        System.out.println("Efficiency : " + r.getEfficiency());
	        System.out.println("B : " + r.getBlue());
	        System.out.println("R : " + r.getRed());
	        System.out.println("G : " + r.getGreen());
	        System.out.println("==========================");
	        return r;
		}
		return null;
	}
		
}
