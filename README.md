# Shopify Java SDK
Shopify Java SDK for Orders and Gift Cards

## Property File Configuration
The following properties will be used to create the Shopify API Context:

```properties
accessToken=
apiVersion=2024-07
username=
password=
shopSubdomain=
```

## API Call Example

### How to create a Gift Card in Shopify?

1. **Set Gift Card Object**

    ```java
    // Set Gift Card Object
    GiftCard giftCard = new GiftCard();
    giftCard.setCode("12345678901234");
    giftCard.setNote("Not for gift card");
    giftCard.setInitialValue("10.00");
    giftCard.setBalance("10.00");
    ```

2. **Create Gift Card Request**

    ```java
    // Create Gift Card Request
    GiftCardRequest giftCardRequest = new GiftCardRequest();
    giftCardRequest.setGiftCard(giftCard);
    ```

3. **Create API Context**

    ```java
    // Create API Context
    ApiContext apiContext = new ApiContext();
    apiContext.setUsername("username");
    apiContext.setPassword("password");
    apiContext.setShopSubdomain("shopSubdomain");
    apiContext.setApiVersion("apiVersion");
    ```

4. **Gift Card API Resource**

    ```java
    // Gift Card API Resource
    GiftCardResource cardResource = new GiftCardResource(apiContext);
    try {
        // Execute the request
        GiftCardResponse cardResponse = cardResource.createGiftCard(giftCardRequest);
        System.out.println("GiftCard created");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    ```

This example demonstrates how to create a Gift Card in Shopify using the Shopify Java SDK. Adjust `username`, `password`, `shopSubdomain`, and `apiVersion` with your actual Shopify API credentials. The `GiftCard` object is set with its properties, and then a `GiftCardRequest` is created. The API context is configured with the necessary credentials, and the Gift Card API Resource is used to execute the request and handle the response.
