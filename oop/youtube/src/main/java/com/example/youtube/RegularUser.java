package com.example.youtube;

public class RegularUser{

    public static void main(String [] args) {
        ActionList al = new ActionList();
        al.addUser(new User("Adam", "20220228"));
        al.addUser(new User("Alice", "mscs2022"));
        al.addContent(new Content("One day", "120mins", "One Day is a 2011 romantic drama film directed by Lone Scherfig from a screenplay by David Nicholls, based on Nicholls' 2009 novel of the same name. It stars Anne Hathaway and Jim Sturgess, with Patricia Clarkson, Ken Stott and Romola Garai in supporting roles. It was released in the United States on 19 August 2011 by Focus Features and in the United Kingdom on 24 August 2011 by Universal Pictures.", 2011));
        al.addContent(new Content("Interstellar", "125mins", "Interstellar is a 2014 epic science fiction film co-written, directed and produced by Christopher Nolan. It stars Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, Ellen Burstyn, Matt Damon, and Michael Caine. Set in a dystopian future where humanity is struggling to survive, the film follows a group of astronauts who travel through a wormhole near Saturn in search of a new home for mankind.", 2014));

    }


}
