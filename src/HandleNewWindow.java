import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/FirefoxDriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/table-pagination-demo");
//        //get text from cell
//        String val = driver.findElement(By.xpath("//table//tbody//tr[1]//td[3]")).getText();
//        System.out.println(val);
//        List<WebElement> listRow1 = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
//        List<String> listText = new ArrayList<>();
//        for(WebElement element : listRow1){
//            listText.add(element.getText());
//        }
      //  System.out.println(listText);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                String val = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[" + j + "]")).getText();
                System.out.println(val);

            }

        }
            }
        }

