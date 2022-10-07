package io.codelex.collections.practice.phonebook;

public class PhoneApp {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        PhoneDirectory.putNumber("Augusts", "25543670");
        PhoneDirectory.putNumber("Augusts1", "25543670");
        PhoneDirectory.putNumber("August2", "25543670");
        System.out.println(PhoneDirectory.getNumber("Augusts"));
        System.out.println(PhoneDirectory.getData().toString());
        System.out.println(PhoneDirectory.getDataCount());
    }
}
