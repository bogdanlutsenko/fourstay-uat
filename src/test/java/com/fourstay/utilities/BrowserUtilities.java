package com.fourstay.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
	public static String getCurrentTime(){
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
		Date date=new Date();
		String date1=dateFormat.format(date);
		return date1;
		
		
	}

	public static void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.se-pre-con")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void switchTab(String url) {
		String defaultTab = Driver.getInstance().getWindowHandle();
		for (String windowHandle : Driver.getInstance().getWindowHandles()) {
			Driver.getInstance().switchTo().window(windowHandle);
			if (Driver.getInstance().getCurrentUrl().contains(url)) {
				return;
			}
		}
		Driver.getInstance().switchTo().window(defaultTab);
	}

}
