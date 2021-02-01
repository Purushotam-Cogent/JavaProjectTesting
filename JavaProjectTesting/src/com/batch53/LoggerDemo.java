package com.batch53;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {

	public static void main(String[] args) throws SecurityException, IOException {
	Date date=new Date();
	String current_date=date.getDate()+"."+(date.getMonth()+1) +"."+(1900+date.getYear());
	System.out.println(current_date);
	FileHandler fileHandler=new FileHandler("E:\\Logger\\"+current_date+"_"+System.currentTimeMillis()+".log");
	fileHandler.setFormatter(new SimpleFormatter());
	//fileHandler.setFormatter(new XML);
	Logger logger=Logger.getLogger(LoggerDemo.class.getName());
	logger.addHandler(fileHandler);
	
	
	System.out.println("File Handler logger created...");
	System.out.println("util.Logger files Demo");
	logger.severe("Top-Level  Error message on console" );
	logger.warning("Top Level-2 Warning shows to Administrator" );
	logger.info("Top Level-3 shows information on Console ");
	logger.config("Top Level-4 shows hardware configurations to admin");
	logger.fine("Top Level-5 Fine some tracing info");
	logger.finer("Top Level-6 Finer some tracing info.....");
	logger.finest("Top Level-7 Finest some tracing info.............");
	try {
		System.out.println(2/0);
	}catch(Exception e)
	{
		logger.info(e.toString());
		System.out.println(e);
	}
	
	logger.log(Level.SEVERE, "Level.Severe Message ");
	logger.log(Level.INFO, "Level.info messge ");
	logger.log(Level.WARNING,"Level.warning message ");
	
	System.out.println("LoggerDemo.main() End ");
	

	}

}
