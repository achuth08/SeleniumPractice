package mavinproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	public static void main(String[] args) {
		
	}
		
		public static void capture(WebDriver driver,int testid ) throws IOException {
			
			
			// Get current system date and time
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM--dd--HH--mm--ss");		
			Date date=new Date();
			
			String dateTime=sdf.format(date);
			
			
			//Create a filename 
			String Screenshot=dateTime+"_"+testid;
			// Take ScreenShot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			//save Screenshot to file 
			File dest=new File("C:\\Users\\Abhishek\\eclipse-workspace\\AmazonFramework\\test-output\\ScreenShots\\testid.png");
		    FileHandler.copy(source, dest);	
			
		}
		
		private static final String File_Name="src\\main\\resources\\testdata\\Batchno4.xlsx";
	public static String FetchData(String sheetName,int row ,int cell) {
		String data=null;
		FileInputStream file=null;
		Workbook 
		
		try {
			file=new FileInputStream(File_Name);
			workbook=new XSSFWorkbook(file);
			Sheet sheet=workbook.getSheet(sheetName);
			Row rowObj=sheet.getRow(row);
			Cell cellObj=rowObj.getCell(cell);
			data=cellObj.getStringCellValue();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(data!=null) {
					file.close();
				}
				if(workbook!=null) {
					file.close();
				}
				if(file!=null) {
					file.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return data;
	
	}

