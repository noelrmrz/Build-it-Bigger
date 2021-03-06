package com.noelrmrz.jokeslibrary;

import java.util.ArrayList;
import java.util.List;

public class JokesLibrary {
    private List<String> jokes = new ArrayList<>();

    public JokesLibrary() {
        jokes.add("Why don't calculus majors throw house parties?  Because you should never drink and derive.");
        jokes.add("What do you call a gay math major?  A homogeneous");
        jokes.add("What do you call it when computer science majors make fun of each other?  cyber boolean.");
        jokes.add("Why didn't the computer engineering student like to talk about his major?  Because it made his mother board.");
        jokes.add("Your computer science teaching momma is so fat...She can flatten a binary tree in O(1).");
        jokes.add("Why didn't the client tip the server?  Because they didn't have enough cache.");
        jokes.add("Why programmers wear glasses?  They can't C#.");
        jokes.add("Yo momma is so fat...SQL Server introduced BIGINT to store her weight.");
        jokes.add("Yo momma is so fat...Even Dijkstra couldn't find a path around her.");
        jokes.add("Yo momma is so fat...She eats her spam mail.");
        jokes.add("Yo momma is so fat...She compresses files by stepping on them");
        jokes.add("Yo momma is so fat...She causes a 32 bit overflow on the display of her digital scale, twice.");
    }

    public String getJoke() {
        return jokes.get(randomNumberInRange());
    }

    private int randomNumberInRange() {
        return (int) (Math.random() * (jokes.size() - 1));
    }
}