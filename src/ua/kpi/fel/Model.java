package ua.kpi.fel;

import java.time.LocalDateTime;

public class Model {
    private String name;
    private String surname;
    private String nickName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfCreation;

    private String fullName;

    public void createNote() throws EmailNotUniqueException, NickNameNotUniqueException {
        Notebook notebook = new Notebook(nickName, phoneNumber, email, dateOfCreation, fullName);
        checkingNotebookForUniqueness(notebook);

        notebook.printNote();
    }

    public void checkingNotebookForUniqueness(Notebook notebook) throws EmailNotUniqueException, NickNameNotUniqueException {
        for (DB db : DB.values()) {
            if (db.getEmail().equals(notebook.getEmail())) {
                throw new EmailNotUniqueException();
            }
            else if (db.getNickName().equals(notebook.getNickName())) {
                throw new NickNameNotUniqueException();
            }
        }
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

}
