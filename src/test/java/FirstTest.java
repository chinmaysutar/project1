import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://demo.opencart.com");

		String act_Title =driver.getTitle();
		String exp_Title="Your Store";

		if(act_Title.equals(exp_Title)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
