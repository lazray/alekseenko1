package ru.dvfu.mrcpk.alekseenko.theme11;


// Класс абстракция верхнего уровня
public abstract class Person {

    protected String  firstname, lastname, middlename, gender, email, phonenumber, addresses;

    public Person(String firstname, String lastname, String middlename, String gender, String email, String phonenumber, String addresses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.gender = gender;
        this.email = email;
        this.phonenumber = phonenumber;
        this.addresses = addresses;
    }

    Person(String firstname, String lastname, String middlename) {

    }

    void addFhoneNumber(){}

    System.out.println( "Введите номер телефона" )


}
