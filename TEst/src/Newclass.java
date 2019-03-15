import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
       String parent= driver.getWindowHandle();
       System.out.println("1st window name"+parent);
       Set<String> allwindows=driver.getWindowHandles();
       int n=allwindows.size();
       System.out.println(n);
       for(String child:allwindows)
       {
    	if(!parent.equalsIgnoreCase(child))   
    	{
    		driver.switchTo().window(child);
    		driver.close();
    	}
       }
       driver.switchTo().window(parent);
	}

}
