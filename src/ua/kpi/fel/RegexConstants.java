package ua.kpi.fel;

public interface RegexConstants {
    String name = "^[А-Яа-яЁёЇїІіЄєҐґ]+[А-Яа-яЁёЇїІіЄєҐґ']+$";
    String surname = "^[А-Яа-яЁёЇїІіЄєҐґ]+[А-Яа-яЁёЇїІіЄєҐґ'-]+$";
    String nickName = "\\S+";
    String phoneNumber = "0\\d{9}";
    String email = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
}
