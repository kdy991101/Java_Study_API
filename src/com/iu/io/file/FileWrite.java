package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {

	public void Write() throws Exception {
		File file = new File("c:\\Study", "test.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("new String\r\n");//\r은 뒤로 당긴다..?
		fw.flush();//버퍼에 있는 것을 강제로 미룸..?
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
	}
}
