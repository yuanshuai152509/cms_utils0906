package com.yuan.comment.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yuan.common.utils.DateUtil;

public class DateUtilTest {
	@Test
	public void getDateBYInitMonth() {
		Calendar c = Calendar.getInstance();  
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	@Test
	public void getDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
