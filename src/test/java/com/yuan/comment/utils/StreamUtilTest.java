package com.yuan.comment.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.yuan.common.utils.StreamUtil;

public class StreamUtilTest {
	@Test
	public void testCloseAll() {
		
	}
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new FileInputStream("D:/git/aa.txt"));
		
		System.out.println(string);
	}
	@Test
	public void testReadTextFileStream() {
		String string = StreamUtil.readTextFile(new File("D:/git/aa.txt"));
			
		System.out.println(string);
	}

}
