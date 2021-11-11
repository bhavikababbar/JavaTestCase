package utility;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public static int count = 0;
	public static void captureScreenShot(WebDriver driver) throws Exception
	{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // store file to temprary location
		
		String screenshotpath = System.getProperty("user.dir")+"\\src\\test\\java\\screenshot\\errorimage"+count+++".jpeg";
		
		FileUtils.copyFile(scrFile, new File(screenshotpath));

		
	}

}
