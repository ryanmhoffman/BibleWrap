# BibleWrap

***This project is no longer being maintained and I'm not sure it is even still working***  
As of January 2018 everything was minimally working, but there was a lot more necessary to 
make it more usable. Feel free to submit a PR if you want to contribute.  


API wrapper written in Kotlin for the getbible.net API. The aim of this library is to 
wrap the endpoints of the API at getbible.net to make them easier to use in Kotlin and 
Java projects. 

--------------
## Example Usage  
```kotlin
val bibleWrap = BibleWrap()
bibleWrap.getBook(Books.GENESIS) // Returns the entire contents of Genesis.
biblewrap.getChapter(Books.JOHN, 1) // Returns John chapter 1.
```

## Where it Stands Currently
This project is still under heavy development, but the method '''getPassage("passage")'''
is working. It needs refactored to be more modular so there isn't redundancy across the
other methods, but that method does work. It should be used with care because it accepts
a String as an argument and it will not handle exceptions nicely (yet) if you specify
an invalid endpoint.

## Limitations
It is important to note that this does not parse the JSON data or serialize anything. It 
only returns the JSONObject exactly as it was received from the endpoint.   

I am open to adding features to parse the JSON data and return it in different formats, 
but currently for the project I'm developing it for it isn't necessary.
