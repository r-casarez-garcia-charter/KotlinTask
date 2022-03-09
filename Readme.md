The project contains an empty activity and has the most common android dependencies:
* gson
* coroutines
* rxjava2, rxAndroid.
* okhttp
* retrofit (gson converter, kotlinx serialization converter and rxjava2 call adapter)
    *  gson converter.
    * kotlinx serialization converter
    * rxjava2 adapter.
* lifecycle
    * viewmodel
    * livedata
    * runtime-ktx

Feel free to use any of the available dependencies or add new ones.

#### Task 1: Read the order data from res/raw/order.json
Utility class FileUtility can be used to read the raw resource.
```kotlin
FileUtil.readRaw(context: Context, rawId: Int): String
```
#### Task 2: Calculate the price of pizza in the provided order using the following rules:
1. Size: small=5€, medium=10€, big=15€
2. Toppings: 1€ each
3. Sauce: 5€ for sauce regardless of color / count

#### Task 3: Calculate the pizza price in USD
Fetch the exchange rate from the following location: https://gist.githubusercontent.com/darkalor/8b916a24ee746c432165ecefeeb5831a/raw/992f1ca2db87c83d58af8cb8d105dd88790a3195/euroPrice.json

#### Show price.
Show the total price in Euros and USD, prices can be displayed on the screen or logged to the console.

### Tips.
Feel freer to use any json parser library of your preference. Dependency included for Gson and kotlin Serializatrion.
Predefined default builders for retrofit and okhttp created in `NetworkModule` object.
