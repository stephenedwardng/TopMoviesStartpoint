package com.codeclan.watcheslist;


import java.util.ArrayList;

public class Watches {

    private ArrayList<Watch> list;

    public Watches() {
        list = new ArrayList<Watch>();
        list.add(new Watch(1, "The Shawshank Redemption", 1994));
        list.add(new Watch(2, "The Godfather", 1972));
        list.add(new Watch(3, "The Godfather: Part II", 1974));
        list.add(new Watch(4, "The Dark Knight", 2008));
        list.add(new Watch(5, "12 Angry Men", 1957));
        list.add(new Watch(6, "Schindler's List", 1993));
        list.add(new Watch(7, "Pulp Fiction", 1994));
        list.add(new Watch(8, "Lord of the Rings: The Return of the King", 2003));
        list.add(new Watch(9, "The Good, the Bad and the Ugly", 1966));
        list.add(new Watch(10, "Fight Club", 1999));
        list.add(new Watch(11, "Lord of the Rings: The Fellowship of the Ring", 2001));
        list.add(new Watch(12, "Star Wars: Episode V - The Empire Strikes Back", 1980));
        list.add(new Watch(13, "Forrest Gump", 1994));
        list.add(new Watch(14, "Inception", 2010));
        list.add(new Watch(15, "The Lord of the Rings: The Two Towers", 2002));
        list.add(new Watch(16, "One Flew Over the Cuckoo's Nest", 1975));
        list.add(new Watch(17, "Goodfellas", 1990));
        list.add(new Watch(18, "The Matrix", 1999));
        list.add(new Watch(19, "Seven Samurai", 1954));
        list.add(new Watch(20, "Star Wars: Episode IV - A New Hope", 1977));
    }

    public ArrayList<Watch> getList() {
        return new ArrayList<Watch>(list);
    }

}
