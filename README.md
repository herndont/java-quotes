# Java-Quotes (Lab08)
## Authors:

Trey Herndon and Jessica Zuchowski

## Feature Task:

This app was created in Java and utilizes Gson to convert JSON files to Java, in this case to return a random author 
and quote object from the array in our .json file. To use, simply run App.main() from your CLI. 

## Dependencies:

Using Gson with Gradle: implemented by adding `dependencies {
    implementation 'com.google.code.gson:gson:2.8.5'
}` to our build.gradle file.

## Resources:

<a href="https://github.com/google/gson/blob/master/UserGuide.md#TOC-Gson-Users"> Gson User Guide </a>


# Java-Quotes (Lab09)
## Authors:

Jessica Zuchowski and Trey Herndon

## Feature Task:

    - Start by refactoring anything that you don’t like about your solution from yesterday.
    - When running the application, don’t read in the quotes file. Instead, make a request to an API to get a random 
      quote.
    - Please do not delete your existing code, look at the very next feature task, you will still need that code
    - Pick an API to use for quotes.
    - Rather than a Quote of the Day, please use an API that allows you to show a random quote.
    - We do still have this quotes file, though, and it might still be useful! Ensure that if your app has errors in 
      connecting to the Internet, you instead display a random quote from your file.
    - When we grab a random quote from the Internet, we could add it to our file of quotes, for use if the app goes 
      offline in the future. Add that functionality: when a quote comes back from a request, it’s also cached in the json file.

## Dependencies:

Test code by running `./gradlew test`

Quotes are being used from: `http://ron-swanson-quotes.herokuapp.com/v2/quotes`


## Resources:
<a href="https://github.com/google/gson/blob/master/UserGuide.md#TOC-Gson-Users"> Gson User Guide </a>
