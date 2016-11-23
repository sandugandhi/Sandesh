package com.zensar.sandesh.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Time complexity for this code is BIG-O-OF-LOGN O(logn)
 * 
 * This is very basic code for the problem statement for the time.
 * */
public class ProblemTwo {

	static String txReferenceNumber = "e148bbd1e5";

	static int countINFO = 0, countWARN = 0, countERROR = 0, countDEBUG = 0;

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E://ZensarWorkspace//Sandesh//src//server.log");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			
			String strLine;
			/* read log line by line */
			while ((strLine = bufferedReader.readLine()) != null) {
				if (strLine.contains(txReferenceNumber)) {
					if (strLine.contains("INFO"))
						countINFO++;
					if (strLine.contains("WARN"))
						countWARN++;
					if (strLine.contains("DEBUG"))
						countDEBUG++;
					if (strLine.contains("ERROR"))
						countERROR++;
				}
			}
			System.out.println("Tx reference number "+txReferenceNumber+" has");
			System.out.println("INFO = "+countINFO);
			System.out.println("WARN = "+countWARN);
			System.out.println("DEBUG = "+countDEBUG);
			System.out.println("ERROR = "+countERROR);
			
			bufferedReader.close();
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
