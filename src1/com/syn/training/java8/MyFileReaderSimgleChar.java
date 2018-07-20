package com.syn.training.java8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderSimgleChar {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		String fromFile = args[0];
		String toFile = args[1];
		FileReader fr = new FileReader(fromFile);
		FileWriter fw = new FileWriter(toFile);
		int i = 0;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		fw.flush();
		fw.close();
		fr.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time : " + (endTime - startTime));
	}
}
