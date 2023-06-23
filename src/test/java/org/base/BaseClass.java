package org.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void Windowmaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
		// System.out.println(title);
	}

	public static String pageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
		// System.out.println(Url);

	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);

	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement ele) {
		ele.click();

	}

	public static void ScreenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgname.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCurser(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragWebElement, WebElement dropwebElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropwebElement).perform();

	}

	public static JavascriptExecutor js;

	public static void ScrollThePage(WebElement targetWebele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].scrollIntoView(true)", targetWebele);
	}

	public static void Scroll(WebElement targetWebele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].scrollIntoView(false)", targetWebele);
	}

	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\maveninstallation\\ExcelFiles\\Book1.xlsx");
		FileInputStream fls = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fls);
		Sheet mysheet = wb.getSheet("sheet1");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType == 1) {
			String Value1 = c.getStringCellValue();
			System.out.println(Value1);
		} else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date date = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
			String value2 = s.format(date);
			System.out.println(value2);
		} else {
			double numvalue = c.getNumericCellValue();
			long l = (long) numvalue;
			String value3 = String.valueOf(l);
			System.out.println(value3);
		}
	}

	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\maveninstallation\\ExcelFiles\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.createSheet("sheet1");
		Row r = mysheet.createRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fls = new FileOutputStream(f);
		wb.write(fls);

	}

	public static void createCell(int getRow, int createCell, String newData) throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\maveninstallation\\ExcelFiles\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.getSheet("sheet1");
		Row r = mysheet.createRow(getRow);
		Cell c = r.createCell(createCell);
		c.setCellValue(newData);
		FileOutputStream fls = new FileOutputStream(f);
		wb.write(fls);
	}

	public static void createRow(int creRow, int createCell, String newData) throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\maveninstallation\\ExcelFiles\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.getSheet("sheet1");
		Row r = mysheet.createRow(creRow);
		Cell c = r.createCell(createCell);
		c.setCellValue(newData);
		FileOutputStream fls = new FileOutputStream(f);
		wb.write(fls);
	}

	public static void updateDataToParticularCell(int getRow, int getCell, String existingData, String writeNewData)
			throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\maveninstallation\\ExcelFiles\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.getSheet("sheet1");
		Row r = mysheet.getRow(getRow);
		Cell c = r.getCell(getCell);

		String strdata = c.getStringCellValue();
		if (strdata.equals(existingData)) {
			strdata.equals(writeNewData);

		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}
}
