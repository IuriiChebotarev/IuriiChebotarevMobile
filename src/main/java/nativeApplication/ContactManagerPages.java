package nativeApplication;

public enum ContactManagerPages {

    DEFAULT_PAGE("Contact Manager"),
    ADD_CONTACT_PAGE("Add Contact");

    public String name;

    ContactManagerPages(String name) {
        this.name = name;
    }
}
