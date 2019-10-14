package com.example.demo;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xufei.utils.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	//测试初始数据
	@Test
	public void contextLoads() {
		File file = new File("src/test/resources/初始数据.txt");
		File[] listFiles = file.listFiles();
		boolean number = false;
		for (File file2 : listFiles) {
			String name = file2.getName();
			String path = file2.getPath();
			number = StringUtils.isNumber(name);
		}
		System.out.println(number);
	}

}
