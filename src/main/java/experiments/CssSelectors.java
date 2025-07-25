package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorHomePage() {
        driver.get("https://demoqa.com/");
        //   driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getAttribute("class"));

        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println("Tag name element -->" + imgTools.getTagName());
        System.out.println("Attribute Element -->" + imgTools.getAttribute("src"));

        pause(4000);
        driver.quit();
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
