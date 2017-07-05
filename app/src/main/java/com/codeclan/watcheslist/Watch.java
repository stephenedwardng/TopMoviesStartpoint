package com.codeclan.watcheslist;


public class Watch {

    private int ranking;
    private String title;
    private int year;

    public Watch(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

}
