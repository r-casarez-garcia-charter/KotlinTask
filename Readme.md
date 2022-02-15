// Task 1: Get a list of unique types of food in the order.
Get the order list from res/raw/order.json.
Utility class FileUtility can be used to read the raw resource.
```
FileUtil.readRaw(context: Context, rawId: Int): String
```

// Task 2: Calculate the price of pizza in the provided order using the following rules:
// Size: small=5€, medium=10€, big=15€
// Toppings: 1€ each
// Sauce: 5€ for sauce regardless of color / count

// Task 3: Calculate the pizza price in USD
// Fetch the exchange rate from the following location:
// https://gist.githubusercontent.com/darkalor/8b916a24ee746c432165ecefeeb5831a/raw/992f1ca2db87c83d58af8cb8d105dd88790a3195/euroPrice.json

File description:
- Extensions.kt: Contains extension function for HttpClientBuilder.
- FileUtil.kt: Contains utility function to read asset.
- NetworkModule.kt: Contains default instances for networking (OkHttpClient.Builder, )