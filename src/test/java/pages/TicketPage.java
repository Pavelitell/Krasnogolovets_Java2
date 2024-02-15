package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BasePage {


    @FindBy(xpath = "//input [@id='dataEmail']")
    private WebElement email;
    @FindBy(xpath = "//input [@id='dataName']")
    private WebElement name;
    @FindBy(xpath = "//select [@id='dataGender']")
    private WebElement gender;
    @FindBy(xpath = "//*[@id=\"dataGender\"]/option[2]")
    private WebElement female;
    @FindBy(xpath = "//*[@id=\"dataGender\"]/option[1]")
    private WebElement male;
    @FindBy(id = "dataCheck11")
    private WebElement Checkbox1;
    @FindBy(id = "dataCheck12")
    private WebElement Checkbox2;
    @FindBy(id = "dataSelect21")
    private WebElement radiobutton1;
    @FindBy(id = "dataSelect22")
    private WebElement radiobutton2;
    @FindBy(id = "dataSelect23")
    private WebElement radiobutton3;
    @FindBy(xpath = "//button [@id='dataSend']")
    private WebElement SubmitBtn;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button")
    public WebElement OkBtn;


    public TicketPage() {
        PageFactory.initElements(driver, this);
    }


    public TicketPage fillForm() {
        enterEmail("A@A");
        name.sendKeys("Yana");
        selectFemale();
        checkboxSelector(false, true);
        radiobtnSelector(2);
        SubmitBtn.click();
        OkBtn.click();
        return this;
    }

    public TicketPage fillForm2(){
        enterEmail("B@B");
        name.sendKeys("Vladimir");
        checkboxSelector(true, false);
        radiobtnSelector(1);
        SubmitBtn.click();
        OkBtn.click();
        return this;

    }

    public TicketPage fillForm3(){
        enterEmail("C@C");
        name.sendKeys("Tanya");
        selectFemale();
        checkboxSelector(false, false);
        radiobtnSelector(3);
        SubmitBtn.click();
        OkBtn.click();
        return this;

    }

    public TicketPage enterEmail(String emailData) {
        email.sendKeys(emailData);
        return this;
    }

///Так как мужской пол выполнен по умолчанию, напишу метод только на женский
    public TicketPage selectFemale() {
        gender.click();
        female.click();
        return this;
    }


    public TicketPage checkboxSelector(Boolean box1, Boolean box2) {
        if (box1 && box2) {
            Checkbox1.click();
            Checkbox2.click();
        } else if (box1 && !box2) {
            Checkbox1.click();
        } else if (!box1 && box2) {
            Checkbox2.click();
        }
        return this;
    }

    public TicketPage radiobtnSelector(Integer btn) {
        switch (btn) {
            case 1:
                radiobutton1.click();
                break;
            case 2:
                radiobutton2.click();
                break;
            case 3:
                radiobutton3.click();
                break;
            default:
                radiobutton1.click();
                break;
        }
        return this;
    }

    public TicketPage clearAll(){
        email.clear();
        name.clear();
        checkboxSelector(false,false);
        radiobtnSelector(1);
        return this;
    }

}
