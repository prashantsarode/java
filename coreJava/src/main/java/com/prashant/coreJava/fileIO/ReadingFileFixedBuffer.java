package com.prashant.coreJava.fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadingFileFixedBuffer {

	private static String FILEPATH = "src/main/java/resources/";
	private static int SIZE = 1024;

	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile(FILEPATH + "bigfile.txt", "r");

			FileChannel inChannel = file.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(SIZE);
			while (inChannel.read(buffer) > 0) {
				buffer.flip();
				int size = buffer.limit();
				byte[] rawBytes = new byte[size];
				buffer.get(rawBytes, 0, size);
				String data = new String(rawBytes);
				System.out.println(data);
				buffer.clear();
			}
			inChannel.close();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
