package test;
import org.junit.Assert;
import org.junit.Test;
import pages.ProductViewPage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortProductsTest extends BaseTest{
    @Test
    public void shouldSortProductsByNameAscending() {

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.sortByNameAscending();

        List<String> actual = productPage.getAllVisibleProductNames();
        List<String> expected = actual.stream()
                .sorted()
                .collect(Collectors.toList());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortProductsByNameDescending() {

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.sortByNameDescending();

        List<String> actual = productPage.getAllVisibleProductNames();
        List<String> expected = actual.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortProductsByPriceAscending() {

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.sortByPriceAscending();

        List<Double> actual = productPage.getAllVisibleProductPrices();
        List<Double> expected = actual.stream()
                .sorted()
                .collect(Collectors.toList());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortProductsByPriceDescending() {

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.sortByPriceDescending();

        List<Double> actual = productPage.getAllVisibleProductPrices();
        List<Double> expected = actual.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expected, actual);
    }
}
