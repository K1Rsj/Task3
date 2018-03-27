package ua.kpi.fel;

import java.time.LocalDateTime;

public class Notebook {
    private String name;
    private String surname;
    private String nickName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfCreation;
    private String fullName;

    public void createNote() throws EmailNotUniqueException, NickNameNotUniqueException {
        Notebook notebook = new Notebook(nickName, phoneNumber, email, dateOfCreation, fullName);
        notebook.printNote();
    }

    public Notebook(String nickName, String phoneNumber, String email, LocalDateTime dateOfCreation, String fullName) throws EmailNotUniqueException, NickNameNotUniqueException {
        if (checkEmailForUniqueness(email)) {
            throw new EmailNotUniqueException("Email is already used");
        }
        else if (checkNickNameForUniqueness(nickName)) {
            throw new NickNameNotUniqueException("Nickname is already used");
        }
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfCreation = dateOfCreation;
        this.fullName = fullName;
    }

    public Notebook() {
    }

    public boolean checkEmailForUniqueness(String value){
        for (DB db : DB.values()) {
            if (db.getEmail().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNickNameForUniqueness(String value){
        for (DB db : DB.values()) {
            if (db.getNickName().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void printNote() {
        System.out.println(fullName + " " + nickName + " " + phoneNumber + " " + email + " " + dateOfCreation);
    }

    public void setFullName() {
        fullName = name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }
}
