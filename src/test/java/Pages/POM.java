package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Parent {

    public POM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Kabul Et']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//button/em[@class=\"input-icon icon-search\"]")
    private WebElement searchButton;

    @FindBy(xpath = "(//a[@title=\"GİYİM & AKSESUAR\"])[3]")
    private WebElement giyimAksesuar;

    @FindBy(xpath = "//a[contains (@title,\"Kadın İç Giyim\") and @data-value=\"1565\"]")
    private WebElement kadinicGiyim;

    @FindBy(xpath = "//a[contains (@title,\"Dizaltı Çorap\") and @data-value=\"1567\"]")
    private WebElement dizaltiCorap;

    @FindBy(xpath = "//img[@alt=\"Penti Kadın 50 Denye Pantolon Çorabı Siyah\"]")
    private WebElement pentiSiyahCorap;

    @FindBy(xpath = "//div/span[text()='SİYAH']")
    private WebElement verifyBlack;

    @FindBy(xpath = "//button[contains (@class,\"js-add-basket\") and @data-sku=\"25000759001\"]")
    private WebElement addToBasket;

    @FindBy(linkText = "Sepeti Görüntüle")
    private WebElement showBasket;

    @FindBy(xpath = "(//a[@title=\"Sepeti Onayla\"])[2]")
    private WebElement confirmCart;

    @FindBy(xpath = "//a[@title=\"ÜYE OLMADAN DEVAM ET\"]")
    private WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name=\"user_email\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//button[contains (text(),\"DEVAM\")]")
    private WebElement devamEt;

    @FindBy(xpath = "(//a[@title=\"Yeni adres oluştur\"])[1]")
    private WebElement newAddress;

    @FindBy(name = "title")
    private WebElement adresBaslik;

    @FindBy(name = "first_name")
    private WebElement first_name;

    @FindBy(name = "last_name")
    private WebElement last_name;

    @FindBy(name = "phone_number")
    private WebElement phone_number;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "township")
    private WebElement township;

    @FindBy(name = "district")
    private WebElement district;

    @FindBy(name = "line")
    private WebElement line;

    @FindBy(xpath = "//button[@type=\"button\" and contains(text(),\"KAYDET\")]")
    private WebElement kaydet;

    @FindBy(xpath = "//span[contains (text(),\"MNG\")]")
    private WebElement mng;

    @FindBy(xpath = "//button[contains (text(),\"Kaydet\")]")
    private WebElement kaydetveDevamEt;

    @FindBy(xpath = "//div[@class=\"form-area js-new-creditcard-area\"]//input[@name=\"name\"]")
    private WebElement name;

    @FindBy(xpath = "//input[contains(@class,\"js-masterpassbin-payment-card\")]")
    private WebElement cardNumber;

    @FindBy(xpath = "(//select[@name=\"card_month\"])[2]")
    private WebElement cardMonth;

    @FindBy(xpath = "(//select[@name=\"card_year\"])[2]")
    private WebElement cardYear;

    @FindBy(xpath = "(//input[@name=\"card_cvv\"])[2]")
    private WebElement cardCvv;

    @FindBy(xpath = "//span[@class=\"order-complete\"]")
    private WebElement siparisiTamamla;


    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "acceptCookies": myElement = acceptCookies;break;
            case "searchButton": myElement = searchButton;break;
            case "giyimAksesuar": myElement = giyimAksesuar;break;
            case "kadinicGiyim": myElement = kadinicGiyim;break;
            case "dizaltiCorap": myElement = dizaltiCorap;break;
            case "pentiSiyahCorap": myElement = pentiSiyahCorap;break;
            case "addToBasket": myElement = addToBasket;break;
            case "showBasket": myElement = showBasket;break;
            case "confirmCart": myElement = confirmCart;break;
            case "uyeOlmadanDevamEt": myElement = uyeOlmadanDevamEt;break;
            case "devamEt": myElement = devamEt;break;
            case "newAddress": myElement = newAddress;break;
            case "kaydet": myElement = kaydet;break;
            case "mng": myElement = mng;break;
            case "kaydetveDevamEt": myElement = kaydetveDevamEt;break;
            case "siparisiTamamla": myElement = siparisiTamamla;break;
        }
        clickFunction(myElement);
    }


    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "inputEmail" : myElement =inputEmail; break;
            case "adresBaslik" : myElement =adresBaslik; break;
            case "first_name" : myElement =first_name; break;
            case "last_name" : myElement =last_name; break;
            case "phone_number" : myElement =phone_number; break;
            case "line" : myElement =line; break;
            case "name" : myElement =name; break;
            case "cardNumber" : myElement =cardNumber; break;
            case "cardCvv" : myElement =cardCvv; break;
        }
        sendKeysFunction(myElement, value);
    }


    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "verifyBlack" : myElement =verifyBlack; break;
            case "siparisiTamamla" : myElement =siparisiTamamla; break;
        }
        verifyContainsText(myElement,text);
    }


    public void selectMenu(String strElement, String value){
        switch (strElement)
        {
            case "city" : myElement =city; break;
            case "township" : myElement =township; break;
            case "district" : myElement =district; break;
        }
        selectMenuFunction(myElement,value);
    }


    public void selectMenuValue(String strElement, String value){
        switch (strElement)
        {
            case "cardMonth" : myElement =cardMonth; break;
            case "cardYear" : myElement =cardYear; break;
        }
        selectMenuValueFunction(myElement,value);
    }
}
