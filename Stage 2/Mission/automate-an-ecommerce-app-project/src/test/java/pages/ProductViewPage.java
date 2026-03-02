package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class ProductViewPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By hamburgerButton =
            By.id("com.saucelabs.mydemoapp.android:id/menuIV");

    private final By sortIcon =
            By.id("com.saucelabs.mydemoapp.android:id/sortIV");

    private final By nameAscendingOption =
            By.xpath("//android.widget.TextView[@text='Name - Ascending']");

    private final By nameDescendingOption =
            By.xpath("//android.widget.TextView[@text='Name - Descending']");

    private final By priceAscendingOption =
            By.xpath("//android.widget.TextView[@text='Price - Ascending']");

    private final By priceDescendingOption =
            By.xpath("//android.widget.TextView[@text='Price - Descending']");

    private final By productContainer =
            By.xpath("//android.view.ViewGroup[@content-desc='Product Item']");

    private final By productName =
            By.id("com.saucelabs.mydemoapp.android:id/titleTV");

    private final By productPrice =
            By.id("com.saucelabs.mydemoapp.android:id/priceTV");

    private final By addToCartButton =
            By.id("com.saucelabs.mydemoapp.android:id/cartBt");

    private final By cartIcon =
            By.id("com.saucelabs.mydemoapp.android:id/cartIV");

    public ProductViewPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public ProductViewPage openHamburgerMenu() {
        driver.findElement(hamburgerButton).click();
        return this;
    }

    public ProductViewPage openSortMenu() {
        driver.findElement(sortIcon).click();
        return this;
    }

    public ProductViewPage sortByNameAscending() {
        openSortMenu();
        driver.findElement(nameAscendingOption).click();
        return this;
    }

    public ProductViewPage sortByNameDescending() {
        openSortMenu();
        driver.findElement(nameDescendingOption).click();
        return this;
    }

    public ProductViewPage sortByPriceAscending() {
        openSortMenu();
        driver.findElement(priceAscendingOption).click();
        return this;
    }

    public ProductViewPage sortByPriceDescending() {
        openSortMenu();
        driver.findElement(priceDescendingOption).click();
        return this;
    }

    public ProductViewPage addProductToCartByName(String name) {

        List<WebElement> products = driver.findElements(productContainer);

        for (WebElement product : products) {
            String currentName = product.findElement(productName).getText();

            if (currentName.equals(name)) {
                product.findElement(addToCartButton).click();
                break;
            }
        }
        return this;
    }

    public ProductViewPage addMultipleProductsToCart(List<String> names) {
        for (String name : names) {
            addProductToCartByName(name);
        }
        return this;
    }

    public MyCartPage goToCart() {
        driver.findElement(cartIcon).click();
        return new MyCartPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public List<String> getAllVisibleProductNames() {
        return driver.findElements(productName)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<Double> getAllVisibleProductPrices() {
        return driver.findElements(productPrice)
                .stream()
                .map(e -> Double.parseDouble(e.getText().replace("$", "")))
                .collect(Collectors.toList());
    }

    public boolean areProductsSortedAscending() {
        List<String> actual = getAllVisibleProductNames();
        List<String> sorted = actual.stream().sorted().collect(Collectors.toList());
        return actual.equals(sorted);
    }

    public boolean areProductsSortedDescending() {
        List<String> actual = getAllVisibleProductNames();
        List<String> sorted = actual.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return actual.equals(sorted);
    }
}