import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;

public class PhoneBookSelectors {
    WebDriver driver = new ChromeDriver();


    @Test
    public void phoneBookTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //home Work
        FirstTest.pause(5);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        WebElement div = driver.findElement(By.cssSelector("div [class='about_main__2Uv5W']"));
        String divText = div.getText();
        System.out.println(divText);
        WebElement h1 = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W'] h1"));
        System.out.println("h1--> " + h1.getText());

        FirstTest.pause(5);
        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        //WebElement InputEmail = driver.findElement(By.cssSelector("*[name='email']"));
        inputEmail.sendKeys("studiesaseev@gmail.com");
        FirstTest.pause(3);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputPassword.sendKeys("Ecbdn300396$");
        FirstTest.pause(3);
//        WebElement butnRegistration = driver.findElement(By.cssSelector("button[name='registration']"));
//        butnRegistration.click();
//        FirstTest.pause(3);
        WebElement butnLogin = driver.findElement(By.cssSelector("button[name='login']"));
        butnLogin.click();
        FirstTest.pause(3);
        WebElement btnADD = driver.findElement(By.cssSelector("a[href='/add']"));
        btnADD.click();
        FirstTest.pause(3);
        WebElement inputName = driver.findElement(By.cssSelector("input[placeholder='Name']"));
        inputName.sendKeys("Michael");
        FirstTest.pause(3);
        WebElement inputLastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        inputLastName.sendKeys("Aseev");
        FirstTest.pause(3);
        WebElement inputPhone = driver.findElement(By.cssSelector("input[placeholder='Phone']"));
        inputPhone.sendKeys("0537847775");
        FirstTest.pause(3);
        WebElement inputEmailADD = driver.findElement(By.cssSelector("input[placeholder='email']"));
        inputEmailADD.sendKeys("mamon300397@gmail.com");
        FirstTest.pause(3);
        WebElement inputAddress = driver.findElement(By.cssSelector("input[placeholder='Address']"));
        inputAddress.sendKeys("Petah Tikva");
        FirstTest.pause(3);
        WebElement inputDescription = driver.findElement(By.cssSelector("input[placeholder='description']"));
        inputDescription.sendKeys("qwrrt");
        FirstTest.pause(3);
//        WebElement butnSave = driver.findElement(By.cssSelector("button['Save']"));
//        butnSave.click();


    }
}
