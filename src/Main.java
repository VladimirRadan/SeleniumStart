import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    static  WebDriver driver;
    static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    static void typeIn(By locator, String text){
        getElement(locator).sendKeys(text);
    }



    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");


        //driver.findElement(By.cssSelector("input[id='username']"));
        //driver.findElement(By.cssSelector("#username"));


        //WebElement usernameField = driver.findElement(By.id("username"));//bez # uz vrednost atributa id
        getElement(By.id("username")).sendKeys("tomsmith");

        typeIn(By.id("username"), "tomsmith");

        //usernameField.sendKeys("tomsmith");



//        driver.findElement(By.cssSelector("div[class='example']"));
//        driver.findElement(By.cssSelector(".example"));
//        driver.findElement(By.className("example"));

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");


        WebElement loginButton = driver.findElement(By.cssSelector(".fa"));
        loginButton.click();

        WebElement actualTextAndColor = driver.findElement(By.id("flash"));

        String actualText = actualTextAndColor.getText();
        System.out.println(actualText);

        //substring
        //replaceAll
        //regex

        String expectedText = "You logged into a secure area!";

        if (actualText.equals(expectedText)){
            System.out.println("Test je prosao, user je ulogovan!");
        }else {
            System.out.println("Test je pao!!!");
        }


        //driver.close();
        driver.quit();






    }




}