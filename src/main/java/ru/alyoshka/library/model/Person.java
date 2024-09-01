package ru.alyoshka.library.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;
    @NotNull(message = "Field \"Name\" shouldn't be empty")
    @Size(min = 2, max = 50)
    private String name;

    @NotNull(message = "Field \"Surname\" shouldn't be empty")
    @Size(min = 2, max = 50)
    private String surname;
    private String patronymic;

    @Min(value = 1930, message = "Birth year should be above 1930")
    @Max(value = 2024, message = "You can't be born in future as it's 2024 year now")
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String name, String surname, String patronymic, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
