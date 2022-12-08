<h1 align="center"> Answers for week3's question❓</h1>

1. When overriding the `equals()` method of the `Object` class, you will have to cast the `Object` parameter 1 to the type of object that you are dealing with. For example, in the `Media` class, you must cast the Object obj to a `Media`, and then check the equality of the two objects’ attributes as the above requirements (i.e. `title` for Media; `title` and `length` for `Track`). If the passing object is not an instance of `Media`, what happens?  
&rarr; If the passing object is not an instance of Media, error will happen when we try to cast <code>obj</code> to <code>Media</code> type.


2. Alternatively, to compare items in the cart, instead of using `Comparator`, we can use the `Comparable` interface and override the `compareTo()` method. Suppose we are taking this `Comparable` interface approach.
- What class should implement the `Comparable` interface?  
&rarr; `Media` and `Track` class
- In those classes, how should you implement the `compareTo()` method be to reflect the ordering that we want?
    ```
    public abstract class Media implements Comparable<Media>
    ...
    @Override
    // Compare cost first, then title
    public int compareTo(Media media) {
        return Comparator.comparing(Media::getCost)
                .thenComparing(Media::getTitle)
                .compare(this, media);
    }
    // The same goes for Track class
    ```
- Can we have two ordering rules of the item (by title then cost and by cost then title) if we use this `Comparable` interface approach?  
&rarr; When using `Comparable` interface approach, we can't have 2 ordering rules at the same time. We can only have one ordering rule which is defined in the `compareTo()` function. 
- Suppose the DVDs has a different ordering rule from the other media types, that is by title, then decreasing length, then cost. How would you modify your code to allow this?  
&rarr; We can override the `compareTo()` method in `DigitalVideoDisc` class
    ```
    @Override
    public int compareTo(Media media) {
        DigitalVideoDisc dvd = (DigitalVideoDisc) media;
        return Comparator.comparing(DigitalVideoDisc::getTitle)
                .thenComparing(DigitalVideoDisc::getLength, Comparator.reverseOrder())
                .thenComparing(DigitalVideoDisc::getCost)
                .compare(this, dvd);
    }
    ```
