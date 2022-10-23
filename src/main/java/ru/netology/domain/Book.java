package ru.netology.domain;

public class Book extends Product {

    public String author;

    public Book(String name, int id, int cost, String author) {
        super(name, id, cost);
        this.author = author;
    }

    @Override
    public boolean matches(String query) {

        if (super.matches(query)) {
            return true;
        }

        if (author.contains(query)) {
            return true;
        }
        return false;
    }


}
