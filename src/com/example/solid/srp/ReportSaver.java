package com.example.solid.srp;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
	public void saveToFile(Report report, String filename) {
		try(FileWriter writer = new FileWriter(filename)) {
			
			writer.write(report.getTitle() + "\n" + report.getContent());
            System.out.println("Report saved to: " + filename);
		}catch(IOException e) {
			System.out.println("Failed to save report: " +e.getMessage());
		}
	}

}
