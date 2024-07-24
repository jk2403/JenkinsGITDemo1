package one;

	import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ExcelWrite {
		
		public static void main(String[] args) throws IOException {

					XSSFWorkbook workbook = new XSSFWorkbook();
					XSSFSheet sheet = workbook.createSheet("Sheet1");
					sheet.createRow(0);
					sheet.getRow(0).createCell(0).setCellValue("URL");
					sheet.getRow(0).createCell(1).setCellValue("Username");
					sheet.getRow(0).createCell(2).setCellValue("Password");
					
					sheet.createRow(1);
					sheet.getRow(1).createCell(0).setCellValue("https://www.google.co.in");
					sheet.getRow(1).createCell(1).setCellValue("JayaTestUser");
					sheet.getRow(1).createCell(2).setCellValue("JayaTestPwd");
					String filePath = "C:\\Users\\jrayala\\OneDrive - Infor\\Desktop\\Others\\Java\\helloworld_jk\\JenkinsSeleniumTest\\Data55.xlsx";
			 
					File xls = new File(filePath);
					FileOutputStream fos = new FileOutputStream(xls);
					
					workbook.write(fos);
					workbook.close();
					fos.flush();
					fos.close();
					
					System.out.println("Test Completed Successfully");
			 
		}

	}
