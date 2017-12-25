package com.fourstay.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screen2image {
	static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

	public static void screenShot() throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) Driver.getInstance();
		// calling getScreenshotAs method with output paramater as File
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		Calendar now = Calendar.getInstance();
		// creating a destination file
		File destination = new File("/Users/bogdanlutsenko/Desktop/screenShot" + formatter.format(now.getTime()));
		FileUtils.copyFile(file, destination);
	}
	public static void screenShot(String filePath) throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) Driver.getInstance();
		// calling getScreenshotAs method with output paramater as File
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		Calendar now = Calendar.getInstance();
		// creating a destination file
		File destination = new File(filePath + formatter.format(now.getTime()));
		FileUtils.copyFile(file, destination);
	}
}
