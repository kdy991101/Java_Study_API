package com.iu.io.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		try {
			fr.read();
			fw.Write();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
