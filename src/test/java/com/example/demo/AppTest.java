package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("smoke")
class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
        System.out.println("Подготовка данных для теста");
    }

    @AfterEach
    void tearDown() {
        app = null;
        System.out.println("Очистка после теста");
    }

    @Test
    @Tag("unit")
    void testFormatProductInfoBasic() {
        String name = "Notebook";
        double price = 3500.0;

        String result = app.formatProductInfo(name, price);

        assertEquals("Item: Notebook, Cost: 3500.00", result);
    }

    @Test
    @Tag("unit")
    void testFormatProductInfoMatchesUtils() {
        String name = "Book";
        double price = 120.5;

        String appResult = app.formatProductInfo(name, price);
        String utilsResult = Utils.formatProductInfo(name, price);

        assertEquals(utilsResult, appResult);
        assertEquals("Item: Book, Cost: 120.50", appResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pen", "Backpack", "Headphones"})
    void testFormatProductInfoWithParameter(String productName) {
        double price = 500.0;

        String result = app.formatProductInfo(productName, price);

        assertTrue(
                result.contains(productName),
                () -> "В результате отсутствует название товара: " + result
        );
        assertEquals("Item: " + productName + ", Cost: 500.00", result);
    }
}
