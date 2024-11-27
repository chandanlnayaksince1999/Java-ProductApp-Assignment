# Java-training-bootcamp-assignments
This repo is to submit only core-java assignments
This `README.md` file provides a comprehensive guide to understand the project, its functionalities, and how to get started with the application. If you have any more questions or need further details, feel free to ask!

# Product Management App

## Assignment 01: Java Console Based Product Management Application

### Overview
This project is a console-based application designed to manage products using Java Collections and Multi-Threading. The application provides functionalities to add, update, delete, view products, and perform various statistical operations using the Stream API.

### Functionalities
1. **Add Product**: Add a new product to the inventory.
2. **Update Product**: Update an existing product's details.
3. **Delete Product**: Remove a product from the inventory.
4. **View Product**: Display details of a specific product.
5. **View All Products**: Display details of all products in the inventory.
6. **Print Statistics**: Provide statistical data about products:
   - Number of products with a price greater than 10,000.
   - Number of products by category, sorted by category.
   - Average price by product category.
   - List of product IDs whose names contain a given name.
7. **Import**: Import product details from a file.
8. **Export**: Export product details to a file.
9. **Exit**: Exit the application.

### Product Class
```java
public class Product {
    private int id;
    private ProductCategory category;
    private String description;
    private double price;
    private boolean active;

    // Constructor, getters, and setters
}

public enum ProductCategory {
    MOBILES,
    LAPTOPS,
    FURNITURES,
    STATIONARY
}

###Import and Export Functionality
Import: Read product details from a file and populate the product list.

Export: Write current product details to a file for backup or sharing purposes.

Multi-Threading
Multi-threading can be used to handle concurrent imports and exports, ensuring the application remains responsive during these operations.

