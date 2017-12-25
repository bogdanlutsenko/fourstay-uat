package com.fourstay.step_definitions;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fourstay.utilities.ExcelUtils;

public class CreateExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//./src/test/resources/TestData/AmazonSearchData.xlsx
		String path="/Users/bogdanlutsenko/Desktop/MyFile.xlsx";
		String sheetName="Sheet1";
		//ExcelUtils.createExcelFile(path,sheetName);
		ExcelUtils.openExcelFile(path, sheetName);
		List<String[]> myData=ExcelUtils.getSheetContent();
		for (int i = 0; i < myData.size(); i++) {
	        String[] strings = myData.get(i);
	        for (int j = 0; j < strings.length; j++) {
	            System.out.print(strings[j] + " ");
	        }
	        System.out.println();
	    }
		
		
	}

}
