package com.syn.training.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileReaderBuffer {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		String fromFile = args[0];
		String toFile = args[1];
		FileInputStream fis = new FileInputStream(fromFile);
		FileOutputStream fos = new FileOutputStream(toFile);
		byte[] buffer = new byte[1024];
		int i = 0;
		while ((i = fis.read(buffer)) != -1) {
			fos.write(buffer);
		}
		fos.flush();
		fos.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time : " + (endTime - startTime));
	}
}
