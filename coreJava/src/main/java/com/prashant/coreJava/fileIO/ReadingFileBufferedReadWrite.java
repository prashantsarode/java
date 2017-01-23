package com.prashant.coreJava.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadingFileBufferedReadWrite {

	private static String NEWLINE = System.getProperty("line.separator");
	private static String ENCODING = "UTF-8";
	private static String FILEPATH = "src/main/java/resources/";

	public static void main(String[] args) {

		int maxLines = 100;
		int count = 0;

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(FILEPATH + "bigfile.txt"), ENCODING));) {

			String line = null;
			StringBuilder builder = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(NEWLINE);

				if (++count % maxLines == 0) {
					try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
							new FileOutputStream(FILEPATH + "smallFile_" + (count / maxLines) + ".txt"), ENCODING));) {
						writer.write(builder.toString());
						builder.setLength(0);
					}
				}
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

}
