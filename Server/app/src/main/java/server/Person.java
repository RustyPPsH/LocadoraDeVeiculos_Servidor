
package server;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private String nationality;
    private String idNumber;
    private String birthdayDate;
    private String licenceDate;
    private String phone;
    private String mail;
    private List<Car> rentedCars;

    public Person(String name, String surname, String nationality, String idNumber, String birthdayDate,
            String licenceDate, String phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.birthdayDate = birthdayDate;
        this.licenceDate = licenceDate;
        this.phone = phone;
        this.mail = mail;
        this.rentedCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getLicenceDate() {
        return licenceDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setLicenceDate(String licenceDate) {
        this.licenceDate = licenceDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public void clearRentedCars() {
        rentedCars.clear();
    }

    @Override
    public String toString() {
        return "\n\nINFORMAÇÃO DO CLIENTE" +
                "\nNome=" + name +
                "\nSobrenome=" + surname +
                "\nNacionalidade=" + nationality +
                "\nID Numero=" + idNumber +
                "\nNascimento=" + birthdayDate +
                "\nData CNH=" + licenceDate +
                "\nTelefone=" + phone +
                "\nEmail=" + mail;
    }

}