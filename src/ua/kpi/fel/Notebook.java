package ua.kpi.fel;

import java.time.LocalDateTime;

public class Notebook {
    private String nickName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfCreation;
    private String fullName;

    public Notebook(String nickName, String phoneNumber, String email, LocalDateTime dateOfCreation, String fullName) {
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfCreation = dateOfCreation;
        this.fullName = fullName;
    }

    public void printNote() {
        System.out.println(fullName + " " + nickName + " " + phoneNumber + " " + email + " " + dateOfCreation);
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }
}
