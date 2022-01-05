package pages;


public class RegistroUsuario extends BasePage{

    private String SignInButton = "//a[contains(text(),'Sign in')]";
    private String emailTextField = "//input[@id='email_create']";
    private String CreateAnAccountButton = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]";
    private String titleMr = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]";
    private String titleMrs = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/label[1]";
    private String firstNameTextField = "//input[@id='customer_firstname']";
    private String lastNameTextField = "//input[@id='customer_lastname']";
    private String passwordTextField = "//input[@id='passwd']";
    private String companyTextField = "//input[@id='company']";
    private String addressTextField = "//input[@id='address1']";
    private String addressLine2TextField = "//input[@id='address2']";
    private String cityTextField = "//input[@id='city']";
    private String postCodeTextField = "//input[@id='postcode']";
    private String informationTextField = "//textarea[@id='other']";
    private String homePhoneTextField = "//input[@id='phone']";
    private String mobilePhoneTextField = "//input[@id='phone_mobile']";
    private String addressAliasTextField = "//input[@id='alias']";
    private String RegisterButton = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]";
    private String registerStatus = "//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]";

    public RegistroUsuario() {
        super(driver);
    }

    public void navigateToShop(){
        maximizeBrowser();
        navigateTo("http://automationpractice.com/index.php");
    }

    public void clickSignInButton(){
        clickElement(SignInButton);
    }

    public void enterEmail(String email){
        write(emailTextField, email);
    }

    public void clickCreateAnAccountButton(){
        clickElement(CreateAnAccountButton);
    }

    public void clickTitleCheckbox(String title){
        if (title == "Mr.") {
            clickElement(titleMr);
        }
        else if (title == "Mrs."){
            clickElement(titleMrs);
        }
    }

    public void enterFirstName(String firstName){
        write(firstNameTextField, firstName);
    }

    public void enterLastName(String lastName){
        write(lastNameTextField, lastName);
    }

    public void enterPassword(String password){
        write(passwordTextField, password);
    }

    public void selectDateBirth(String day, String month, String year){
        clickElement("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/select[1]/option["+(Integer.parseInt(day)+1)+"]");
        clickElement("//option[contains(text(),'"+month+"')]");
        clickElement("//option[contains(text(),'"+1990+"')]");
    }

    public void enterCompany(String company){
        write(passwordTextField, company);
    }

    public void enterAddress(String address, String addressLine2){
        write(addressTextField, address);
        write(addressLine2TextField, addressLine2);
    }

    public void enterCity(String city){
        write(cityTextField, city);
    }

    public void selectState(String state){
        clickElement("//option[contains(text(),'"+state+"')]");
    }

    public void enterPostalCode(String postalCode){
        write(postCodeTextField, postalCode);
    }

    public void selectCountry(String country){
        clickElement("//option[contains(text(),'"+country+"')]");
    }

    public void enterAdditionalInformation(String information){
        write(informationTextField, information);
    }

    public void enterHomePhone(String homePhone){
        write(homePhoneTextField, homePhone);
    }

    public void enterMobilePhone(String mobilePhone){
        write(mobilePhoneTextField, mobilePhone);
    }

    public void enterAddressAlias(String addressAlias){
        write(addressAliasTextField, addressAlias);
    }

    public void clickRegisterButton(){
        clickElement(RegisterButton);
    }

    public String registerStatus(){
        return textFromElement(registerStatus);
    }
}
