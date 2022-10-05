package StepDefinitions;

import Pages.POM;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class firstCaseSteps {

    POM pom = new POM();

    @Given("Navigate to a{int}.com")
    public void navigateToACom(int arg0) {
        GWD.getDriver().get("https://www.a101.com.tr/");
        GWD.getDriver().manage().window().maximize();
        pom.findAndClick("acceptCookies");
    }

    @When("go to the knee socks section")
    public void goToTheKneeSocksSection() {
        pom.findAndClick("searchButton");
        pom.findAndClick("giyimAksesuar");
        pom.findAndClick("kadinicGiyim");
        pom.findAndClick("dizaltiCorap");
    }

    @Then("Verify that the product is black in color")
    public void verifyThatTheProductIsBlackInColor() {
        pom.findAndClick("pentiSiyahCorap");
        pom.findAndContainsText("verifyBlack","SİYAH");
    }

    @And("add to cart and confirm")
    public void addToCartAndConfirm() {
        pom.findAndClick("addToBasket");
        pom.findAndClick("showBasket");
        pom.findAndClick("confirmCart");
        pom.findAndClick("uyeOlmadanDevamEt");
        pom.findAndSend("inputEmail","esargl148@gmail.com");
        pom.findAndClick("devamEt");
        pom.findAndClick("newAddress");

        pom.findAndSend("adresBaslik","home adress");
        pom.findAndSend("first_name","Ebubekir");
        pom.findAndSend("last_name","Sarigul");
        pom.findAndSend("phone_number","05523109552");

        pom.selectMenu("city","BURSA");
        pom.selectMenu("township","NİLÜFER");
        pom.selectMenu("district","KARAMAN MAH");
        pom.findAndSend("line","karaman mh kale sokak numara 45 daire 12 nilüfer");
        pom.findAndClick("kaydet");

        pom.findAndClick("mng");
        pom.findAndClick("kaydetveDevamEt");

        pom.findAndSend("name","Ebubekir Sarıgül");
        pom.findAndSend("cardNumber","5168404102984219");
        pom.selectMenuValue("cardMonth","1");
        pom.selectMenuValue("cardYear","2025");
        pom.findAndSend("cardCvv","842");
        pom.findAndClick("siparisiTamamla");

    }

    @Then("verify that you are on the payment page")
    public void verifyThatYouAreOnThePaymentPage() {

        pom.findAndContainsText("siparisiTamamla","Siparişi Tamamla");

    }
}
