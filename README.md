# BibleWrap
API wrapper written in Kotlin for the getbible.net API. The aim of this library is to 
wrap the endpoints of the API at getbible.net to make them easier to use in Kotlin and 
Java projects. 

--------------
## Example Usage  
```kotlin
bibleWrap = BibleWrap()
bibleWrap.getBook("genesis") // Returns the entire contents of Genesis.
biblewrap.getChapter("john1") // Returns John chapter 1.
```

## Limitations
It is important to note that this does not parse the JSON data or serialize anything. It 
only returns the JSONObject exactly as it was received from the endpoint.   

I am open to adding features to parse the JSON data and return it in different formats, 
but currently for the project I'm developing it for it isn't necessary.