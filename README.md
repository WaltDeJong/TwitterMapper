# Twitter Mapper

Twitter Mapper is a graphical Java application developed as part of a class assignment. The application monitors tweets in real time and plots them on a world map. It was initially developed to provide a platform to understand and interact with the Twitter API and a geographical mapping library.

## Features

The core features of the application include:

* Real-time monitoring and mapping of tweets.
* Live and playback modes for viewing tweets.
* Customizable search terms for filtering tweets.

## My Contributions

As part of the class project, I was tasked with extending and improving the functionality of the application. My primary contributions include:

1. **Implementation of Observable Design Pattern**: Modified the `TwitterSource` abstract class to implement the Observable design pattern, enabling communication of incoming tweets to classes using them.

2. **Implementation of Filter Package**: Implemented the `AndFilter` and `OrFilter` classes to support complex filter expressions. Also connected these classes to the filter parser.

3. **Enhancement of Query Class**: Extended the `Query` class to observe the `TwitterSource` object and place a marker on the map for tweets matching the filter expression.

4. **Development of Enhanced Markers**: Developed a new marker class for displaying more interesting information about the tweet, such as the filter it matched and the image of the tweet's originator.

5. **Implementation of Tool-Tips**: Added tool-tip functionality to display a large image of the tweet's originator and the tweet text when hovering over a marker on the map.

