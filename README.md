# Product-Catalogue-API
Overview
The Product Catalogue API provides endpoints for managing products in a structured catalogue system. Products in the system have a complex, nested data structure, including attributes such as name, description, price, categories, availability, and ratings.

Setup Instructions
Clone the Repository:
bash
Copy code
git clone <repository-url>
Install Dependencies:
bash
Copy code
cd product-catalogue-api
mvn clean install
Run the Application:
bash
Copy code
java -jar target/product-catalogue-api.jar
Access the API:
Base URL: http://localhost:8888
Endpoints
Add Product:
Endpoint: POST /addProduct
Description: Adds a new product to the system.
Example Request Body:
json
Copy code
{
  "name": "Sample Product",
  "description": "This is a sample product description.",
  "price": 99.99,
  "categories": "Electronics, Gadgets",
  "attributes": {
    "color": "Black",
    "weight": "1 kg"
  },
  "availability": {
    "inStock": true,
    "quantity": 100
  },
  "ratings": []
}
Retrieve Product:
Endpoint: GET /retrievProduct
Description: Retrieves a list of all products stored in the system.
Update Price:
Endpoint: PATCH /updatePrice/{id}/{price}
Description: Updates the price of a specific product identified by its ID.
Update Availability:
Endpoint: PATCH /updateAvailability/{id}/{inStock}/{quantity}
Description: Updates the availability status of a specific product identified by its ID.
Update Categories:
Endpoint: PATCH /updatecategories/{id}/{categories}
Description: Updates the categories of a specific product identified by its ID.
Delete Product:
Endpoint: DELETE /deleteProduct/{id}
Description: Deletes a specific product from the system identified by its ID.
Documentation
For detailed API documentation, please refer to the API Documentation file.
