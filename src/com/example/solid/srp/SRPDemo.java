package com.example.solid.srp;

public class SRPDemo {
	public static void main(String[] args) {
		Report report = new Report("Monthly Report", "All systems operational.");
		
		ReportPrinter printer = new ReportPrinter();
		printer.print(report);
		
		ReportSaver saver = new ReportSaver();
		saver.saveToFile(report, "report.txt");
	}

}
