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
        FirstTest.pause(5);
       // WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
       // btnRegistration.click();
        WebElement btnLoginInPageLogin = driver.findElement(By.xpath("//*[text()='Login']"));
        btnLoginInPageLogin.click();
        WebElement btnADD = driver.findElement(By.xpath("//a[@href='/add']"));
        btnADD.click();
        WebElement InputName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        InputName.sendKeys("Michael");
        WebElement InputLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        InputLastName.sendKeys("Aseev");
        WebElement InputPhone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
        InputPhone.sendKeys("0537847775");
        WebElement InputEmailInPageAdd = driver.findElement(By.xpath("//input[@placeholder='email']"));
        InputEmailInPageAdd.sendKeys("mamon30@gmail.com");
        WebElement InputAddress = driver.findElement(By.xpath("//input[@placeholder='Address']"));
        InputAddress.sendKeys("Holon");
        WebElement InputDescription = driver.findElement(By.xpath("//input[@placeholder='description']"));
        InputDescription.sendKeys("qweer");
        FirstTest.pause(3);




        driver.close();
    }

    @Test
    public void iLCarroRegistrationXpath(){
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
        FirstTest.pause(3);

        driver.close();
    }

    @Test
    public void iLCarroLoginXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLogIn = driver.findElement(By.xpath("//a[@href='/login?url=%2Fsearch']"));
        btnLogIn.click();
        WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        InputEmail.sendKeys("mamon300396@gmail.com");
        WebElement InputPassword = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        InputPassword.sendKeys("Ercbdn300396$");
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();
        WebElement btnLetTheCarWork = driver.findElement(By.xpath("//a[@href='/let-car-work']"));
        btnLetTheCarWork.click();
        WebElement InputLocation = driver.findElement(By.xpath("//input[@id='pickUpPlace']"));
        InputLocation.sendKeys("Israel");
        WebElement InputManufacture = driver.findElement(By.xpath("//form/div[3]/input"));
        InputManufacture.sendKeys("Japan");
        WebElement InputModel = driver.findElement(By.xpath("//form/div[4]/input"));
        InputModel.sendKeys("Toyota");
        WebElement InputYear = driver.findElement(By.xpath("//form/div[5]/input"));
        InputYear.sendKeys("2020");
        WebElement btnFuel = driver.findElement(By.xpath("//*[@ng-reflect-name='fuel']"));
        btnFuel.click();
        FirstTest.pause(5);
        WebElement btnFuelList = driver.findElement(By.xpath("//*[@ng-reflect-value='Hybrid']"));
        btnFuelList.click();
        FirstTest.pause(5);
        WebElement InputSeats = driver.findElement(By.xpath("//form/div[7]/input"));
        InputSeats.sendKeys("4");
        WebElement InputCarClass = driver.findElement(By.xpath("//form/div[8]/input"));
        InputCarClass.sendKeys("mid-size car");
        WebElement InputCarRegistrationNumber = driver.findElement(By.xpath("//form/div[9]/input"));
        InputCarRegistrationNumber.sendKeys("23565");
        WebElement InputPrice = driver.findElement(By.xpath("//form/div[10]/input"));
        InputPrice.sendKeys("1000");
        FirstTest.pause(3);
        WebElement InputAbout = driver.findElement(By.xpath("//*[@placeholder='About (max 500 chars)']"));
        InputAbout.sendKeys("The car is in good condition. Low fuel consumption");
        WebElement btnPhotosOfYouCar = driver.findElement(By.xpath("//label[@for='photos']"));
        btnPhotosOfYouCar.click();
        FirstTest.pause(3);
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        btnSubmit.click();

        FirstTest.pause(3);
        driver.close();

    }

    
}
