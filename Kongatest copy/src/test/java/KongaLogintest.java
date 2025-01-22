import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IExecutionListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;





    public class KongaLogintest {
        //import selenium webdriver
        private WebDriver driver;

      @Test
        public void Start() throws InterruptedException {
            //locate webdriver
            System.setProperty("webdriver.chrome.driver", "RESOURCES/chromedriver");
            //1) open chrome browser
            driver = new ChromeDriver();
            //2)Visit the URL Konga
            driver.get("https://konga.com");
            Thread.sleep(5000);
            //3)maximize page
            driver.manage().window().maximize();
            //4)  Attempt to login. click on login/signup
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
            //5) input Email in emailaddress/phonemun field
            driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("okeowoalaba23@gmail.com");
            //6)input password in password field
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Halimat003");
            //7)Sign in to Konga Successfully (click login)
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            //8)  click on the “Computers and Accessories”
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]"));Thread.sleep(5000);
            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]"));
            actions.moveToElement(element).perform();
            Thread.sleep(5000);
            //9) Click on the Laptop SubCategory
            WebElement subElement = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
            subElement.click();
            Thread.sleep(5000);
            //10 select Apple Macbook
            WebElement suElement = driver.findElement(By.xpath("//main[@id='mainContent']/section[@class='_8d917_1ixfS']/section[@class='_58fc0_2UVzP']//section[@class='_7d295_SvW4q']//ul[@class='f0597_2FrP0']//a[@href='/category/laptops-5230?']/ul[@class='_9136e_29Ql8']//span[.='Apple MacBooks']"));
            suElement.click();
            Thread.sleep(5000);
            //11 select Apple Macbook image
            WebElement macBook = driver.findElement(By.xpath("//img[@title='Pro With M1 Pro Chip - 1TB HDD - 16GB RAM - 14.2\" - Late 2021 - Space Grey.']"));
            macBook.click();
            //12) Add an item to the cart
            WebElement addCart = driver.findElement(By.xpath("/div[contains(@class,'_841f1_1RZK9 c67d6_fW9F4 fa349_iMSgI')]//button[@type='submit'][normalize-space()='Add To Cart']"));
            addCart.click();
            Thread.sleep(5000);
            //13) Select Mycart
            WebElement myCart = driver.findElement(By.xpath("//span[normalize-space()='My Cart']"));
            myCart.click();
            Thread.sleep(5000);
            //14)select checkout
            WebElement checkOut = driver.findElement(By.xpath("//div[contains(@class,'f082d_safAL')]//a[@class='_0a08a_3czMG'][normalize-space()='Continue to Checkout']"));
            checkOut.click();
            //15)Select pay now
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
            // 16)select continue to payment
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
            // 17)select card payment
            driver.findElement(By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[3]/button")).click();
            //18) input card number
            driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("1234567890");
            //19)select paynow
            driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
            //20) Print Out the error message: Invalid card number
            // error message=[@id="card-number_unhappy"]
            //21)Close the iFrame that displays the input card Modal
            driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
        }

        @AfterTest
        public void closekongaweb() {
            //15)Quit the browser.
            driver.quit();

        }


    }



