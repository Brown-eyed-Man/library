package ru.alyoshka.library.model;

import jakarta.validation.constraints.*;

public class Person {
    private int id;
    @NotNull(message = "Field \"Name\" shouldn't be empty")
    @Size(min = 5, max = 100, message = "Size of the name should be between 4 and 100")
    @Pattern(regexp = "([A-ZА-Я][a-zа-я]+ [A-ZА-Я][a-zа-я]+ [A-ZА-Я][a-zа-я]+|[A-ZА-Я][a-zа-я]+ [A-ZА-Я][a-zа-я]+)",
    message = "Example: Петросян Евгений Ваганович (Отчество указывать при наличии)")
    private String fullName;

    @Min(value = 1930, message = "Birth year should be above 1930")
    @Max(value = 2024, message = "You can't be born in future as it's 2024 year now")
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String fullName, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
