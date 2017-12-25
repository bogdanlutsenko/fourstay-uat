package com.fourstay.step_definitions;

import org.openqa.selenium.By;
import com.fourstay.utilities.BrowserUtilities;
import com.fourstay.utilities.Driver;
import com.fourstay.utilities.ExcelUtils;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		String date1=BrowserUtilities.getCurrentTime();
		String outputFilePath = "/Users/bogdanlutsenko/Desktop/Workbook"+date1+".xlsx";
		ExcelUtils.createExcelFile(outputFilePath, "Sheet1");
		ExcelUtils.openExcelFile(outputFilePath, "Sheet1");
		ExcelUtils.setCellData("requestor", 0, 0);
		ExcelUtils.setCellData("firstname", 0, 1);
		ExcelUtils.setCellData("check", 0, 2);
		String url = "https://sanctionssearch.ofac.treas.gov";
		String path = "/Users/bogdanlutsenko/Desktop/Workbook2.xlsx";
		ExcelUtils.openExcelFile(path, "Sheet1");
		int rowsCount = ExcelUtils.getUsedRowsCount();
		for (int i = 1; i < rowsCount; i++) {
			ExcelUtils.openExcelFile(path, "Sheet1");
			if (ExcelUtils.getCellData(i, 2).equals("1.0")) {
				String requestor = ExcelUtils.getCellData(i, 0);
				String firstName = ExcelUtils.getCellData(i, 1);
				Driver.getInstance().get(url);
				Driver.getInstance().findElement(By.id("ctl00_MainContent_txtLastName")).clear();
				Driver.getInstance().findElement(By.id("ctl00_MainContent_txtLastName")).sendKeys(firstName);
				Driver.getInstance().findElement(By.id("ctl00_MainContent_btnSearch")).click();
				
				ExcelUtils.openExcelFile(outputFilePath, "Sheet1");
				int rowsCount2 = ExcelUtils.getUsedRowsCount();
				ExcelUtils.setCellData(requestor, rowsCount2, 0);
				ExcelUtils.setCellData(firstName, rowsCount2, 1);
				try {
					if (Driver.getInstance().findElement(By.id("ctl00_MainContent_lblMessage")).isDisplayed()) {
						String result = "review not needed";
						ExcelUtils.setCellData(result, rowsCount2, 2);
					}
				} catch (Exception e) {
					String result2 = "review needed";
					ExcelUtils.setCellData(result2, rowsCount2, 2);
				}
			}
		}
		Driver.getInstance().close();
	}
}
