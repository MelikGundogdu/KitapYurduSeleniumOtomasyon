package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = By.id("cart-items");
    By cartClik = By.id("sprite-cart-icon");
    By cartContainerLocator = By.id("js-cart");

    By cartUpdate = new By.ByCssSelector("i.fa.fa-refresh.green-icon");

    By cartRemove = new By.ByCssSelector("i.fa.fa-times.red-icon");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }


    public void goToSepet(){

        click(cartClik);
    }

    public void goToCart() {

        click(cartContainerLocator);

    }
    public void cart_update(){
        click(cartUpdate);
    }
    public void cart_remove(){
        click(cartRemove);
    }


    private int getCartCount() {
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }





}
