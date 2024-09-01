package ru.alyoshka.library.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;
    @NotNull(message = "Field \"Title\" shouldn't be empty")
    @Size(min = 2, max = 70, message = "Size of the title should be between 2 and 70")
    private String title;

    @NotNull(message = "Field \"Title\" shouldn't be empty")
    @Size(min = 2, max = 70, message = "Size of the author should be between 2 and 70")
    private String author;

    @Max(value = 2024, message = "The book can't be written before 2024")
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
