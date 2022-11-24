<h1 align="center"> Answers for week2's question❓</h1>

1. When should accessor methods be used?  
- Use of accessors to restrict direct access to a field variable is preferred over the use of public fields, however, making getters (accessor) and setters for each and every field is overkill.  
- Fields can be declared public for package-private or private nested classes. Exposing fields in these classes produces less visual clutter compared to the accessor method approach, both in the class definition and in the client code that uses it.
- Accessors should be added to a field where they're really required. A class should expose larger behavior which happens to use its state, rather than a repository of state to be manipulated by other classes.

2. If you create a constructor method to build a DVD by title then create a constructor method to build a DVD by category. Does JAVA allow you to do this?  
Java does not allow you to do this because both constructor method to build a DVD by title and by category has the same method signature <code>DigitalVideoDisc(String)</code>.