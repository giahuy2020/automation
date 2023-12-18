package huytester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;

public class BTQ {
    @Test
    //Check error message when user leave email blank
    public void TestCase01() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("huy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8133432322");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='main-struggle']")).sendKeys("huy test");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@id='isConsentForm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        WebElement errorElement = driver.findElement(By.xpath("//p[contains(text(),'*Email is required')]"));
        if (errorElement.isDisplayed()) {
            //print error message
            System.out.println("Error message when user leave email blank => " + errorElement.getText());
        } else {
            System.out.println("No error message found.");
        }
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    //Check error message when user leave user name blank
    public void TestCase02() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("huytruong@mgisolutions.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8133432322");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='main-struggle']")).sendKeys("huy test");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@id='isConsentForm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        WebElement errorElement = driver.findElement(By.xpath("//p[normalize-space()='*Name is required']"));
        if (errorElement.isDisplayed()) {
            //Print error message
            System.out.println("Error message when user leave user name blank => " + errorElement.getText());
        } else {
            System.out.println("No error message found.");
        }
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    //Check error message when inputting Invalid email format
    public void TestCase03() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("huy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mgisolutions.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8133432322");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='main-struggle']")).sendKeys("huy test");
        WebElement element = driver.findElement(By.xpath("//input[@id='isConsentForm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        WebElement errorElement = driver.findElement(By.xpath("//p[contains(text(),'*Invalid email address format')]"));
        if (errorElement.isDisplayed()) {
            //Print error message
            System.out.println("Error message when inputting Invalid email format => " + errorElement.getText());
        } else {
            System.out.println("No error message found.");
        }
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    //Check error message when inputting your name wrong format
    public void TestCase04() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("huy}");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("huy.truong@mgisolutions.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8133432322");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='main-struggle']")).sendKeys("huy test");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@id='isConsentForm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(1000);
        WebElement errorElement = driver.findElement(By.xpath("//p[contains(text(),'*Name must only contain letters and space')]"));
        if (errorElement.isDisplayed()) {
            //Print error message
            System.out.println("Error message when inputting your name wrong format => " + errorElement.getText());
        } else {
            System.out.println("No error message found.");
        }
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    //Check submit form successfully
    public void TestCase05() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("huy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("huy.truong@mgisolutions.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8133432322");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='main-struggle']")).sendKeys("huy test");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@id='isConsentForm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(1000);
        try {
            Thread.sleep(5000); // waiting 5 minutes for submit process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/main[1]/div[1]/div[3]/a[1]"));
        if (button.isDisplayed()) {
            System.out.println("Input valid all field => Form submission successful!");
        } else {
            System.out.println("Input valid all field => Form submission failed!");
        }
        driver.quit();
    }

    @Test
    //Exit quiz hyperlink
    public void TestCase06() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        String currentUrlBeforeClick = driver.getCurrentUrl();
        driver.findElement(By.xpath("//span[contains(text(),'Exit Quiz')]")).click();
        String currentUrlAfterClick = driver.getCurrentUrl();
        Thread.sleep(1000);
        if (!currentUrlBeforeClick.equals(currentUrlAfterClick)) {
            System.out.println(" Exit Hyperlink working.");
        } else {
            System.out.println("Exit Hyperlink not working.");
        }
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    //Drberg logo hyperlink
    public void TestCase07() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        String currentUrlBeforeClick = driver.getCurrentUrl();
        driver.findElement(By.xpath("//header/div[1]/div[2]/img[1]")).click();
        String currentUrlAfterClick = driver.getCurrentUrl();
        Thread.sleep(1000);
        if (!currentUrlBeforeClick.equals(currentUrlAfterClick)) {
            System.out.println("Dr.Berg Logo Hyperlink working.");
        } else {
            System.out.println("Dr.Berg Logo Hyperlink not working.");
        }
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    //Check open pop-up abandon the quiz
    public void TestCase08() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        WebElement popupTrigger = driver.findElement(By.xpath("//header/div[1]/div[1]/img[1]"));
        popupTrigger.click();
        if (isPopupPresent(driver)) {
            System.out.println("Pop-up abandon the quiz is present.");
        } else {
            System.out.println("Pop-up abandon the quiz is not present.");
        }
        Thread.sleep(3000);
        driver.quit();
    }

    private static boolean isPopupPresent(WebDriver driver) {
        try {
            return driver.getWindowHandles().size() >= 1;
        } catch (Exception e) {
            return false;
        }
    }

    @Test
    //Check click yes pop-up abandon the quiz
    public void TestCase09() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    //Check click No pop-up abandon the quiz
    public void TestCase10() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    //Check Teams and conditions and Privacy Policy hyperlink
    public void TestCase11() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/truonggiahuy/Downloads/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devdrbergstorage.z20.web.core.windows.net/body-type-quiz");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Men')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='day-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day-30']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='month-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='month-Apr']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='year-combobox']//img[@class='w-5 svelte-sfz381']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year-2013']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='svelte']/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'5-10 pounds')]//p[contains(@class,'font-bold text-base text-center')][normalize-space()='Need to lose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Fatigue']//div//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Bloating')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Pain / Inflammation')]//img[contains(@class,'svelte-qicjxh')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        try {
            WebElement element = driver.findElement(By.linkText("Terms & Conditions"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
            element.click();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Privacy Policy")).click();
            Thread.sleep(2000);
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                driver.switchTo().window(windowHandle);
                System.out.println("Window/Tab Title: " + driver.getTitle());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
