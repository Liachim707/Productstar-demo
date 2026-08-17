package com.example.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Tag smoke  // Applies to all tests in this class
 */
class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        // Setup before each test
        app = new App();
        System.out.println("Setup data for test");
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test
        app = null;
        System.out.println("Tear down");
    }

    @Test
    @Tag("unit")
    void testFormatProductInfoBasic() {
        // Arrange
        String name = "Notebook";
        double price = 3500.0;
        // Act
        String result = app.formatProductInfo(name, price);
        // Assert
        assertEquals("Item: Notebook, Cost: 3500.00", result);
    }

    @Test
    @Tag("unit")
    void testFormatProductInfoDifferentFromUtils() {
        // Compare with Utils to show difference
        String name = "Book";
        double price = 120.5;
        String result = app.formatProductInfo(name, price);
        String utilsResult = com.example.demo.Utils.formatProductInfo(name, price);
        assertNotEquals(result, utilsResult); // They should be different by design
    }

    @ParameterizedTest
    @Tag("smoke")
    @ValueSource(strings = {"Pen", "Backpack", "Headphones"})
    void testFormatProductInfoWithParameter(String productName) {
        double price = 500.0;
        String result = app.formatProductInfo(productName, price);
        // Check that the output contains the product name
        assertTrue(result.contains(productName), () -> "Output does not contain product name: " + result);
    }
}
