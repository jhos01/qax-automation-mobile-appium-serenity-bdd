package test;
import org.junit.Assert;
import org.junit.Test;
import pages.*;
public class EndToEndFlowTest extends BaseTest {
    @Test
    public void shouldCompleteFullPurchaseFlow() {

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.sortByPriceAscending();

        List<String> products = List.of(
                "Sauce Labs Backpack",
                "Sauce Labs Bike Light",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Onesie"
        );

        productPage.addMultipleProductsToCart(products);

        MyCartPage cartPage = productPage.goToCart();

        cartPage.selectCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.fillOutFullNameTextField("John Doe")
                .fillOutAddressLine1TextField("Street 123")
                .fillOutCityTextField("New York")
                .fillOutStateOrRegionTextField("NY")
                .fillOutZipCodeTextField("10001")
                .fillOutCountryTextField("USA")
                .selectToPaymentButton();

        PaymentMethodPage paymentPage = new PaymentMethodPage(driver);

        paymentPage.enterFullName("John Doe")
                .enterCardNumber("4111111111111111")
                .enterExpirationDate("12/30")
                .enterSecurityCode("12471")
                .tapReviewOrder();

        ReviewYourOrderPage reviewPage =
                new ReviewYourOrderPage(driver);

        reviewPage.clickOnPlaceOrderButton();

        Assert.assertTrue(reviewPage.isOrderConfirmed());
    }
}
