package ua.kpi.fel;

public enum DB {
    FIRST ("Misha", "mihail@gmail.com"),
    SECOND ("Vasya", "vasya@gmail.com"),
    THIRD ("Valera", "valera@gmail.com");

    private final String nickName;
    private final String email;

    DB(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }
}
