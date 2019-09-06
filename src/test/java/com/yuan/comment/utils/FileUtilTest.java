package com.yuan.comment.utils;


import java.io.File;

import org.junit.Test;

import com.yuan.common.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void testGetExtendName() {
		String str = "test.doc.jpg";
		String string = FileUtil.getExtendName(str);
		System.out.println(string);
	}
	
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}
	@Test
	public void testgetUserDriectory() {
		File file = FileUtil.getUserDriectory();
		System.out.println(file);
	}
	

}
