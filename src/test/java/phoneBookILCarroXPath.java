import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class phoneBookILCarroXPath {

    WebDriver driver = new ChromeDriver();

    @Test
    public void xpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));//css div[id='root']
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);
        System.out.println("=====================");
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("zxc_test123@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Qwer123!");
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();



        driver.close();
    }

    @Test
    public void iLCarroXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        WebElement InputName = driver.findElement(By.xpath("//input[@id='name']"));
        InputName.sendKeys("Michael");
        WebElement InputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        InputLastName.sendKeys("Aseev");
        WebElement InputEmail = driver.findElement(By.xpath("//input[@ng-reflect-name='email']"));
        InputEmail.sendKeys("mamon300396@gmail.com");
        WebElement InputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
        InputPassword.sendKeys("Ercbdn300396$");
        WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        checkBox.click();
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();
    }

    
}
