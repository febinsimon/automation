
	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class firstpage {
		public static void main(String args[])
		{
			System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\StoicsLP-00137\\Desktop\\eclipse\\New folder\\chromedriver_win32\\chromedriver.exe");
			// Instantiate a ChromeDriver class.
			WebDriver driver = new ChromeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// Launch Website
			driver.get("https://www.google.com/");
		}
	}



