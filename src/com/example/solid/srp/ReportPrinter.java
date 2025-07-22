package com.example.solid.srp;

public class ReportPrinter {
	
	public void print(Report report) {
		System.out.println("===" + report.getTitle() + " ====");
		System.out.println(report.getContent());
	}

}
