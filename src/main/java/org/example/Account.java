package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() > 3 && name.length() < 19) {
            if (name.contains(" ")) {
                if (!name.startsWith(" ") && !name.endsWith(" ")) {
                    System.out.println(true);
                    System.out.println(name);
                    return true;
                }
            }
        }
        System.out.println(false);
        System.out.println(name);
        return false;
    }
}
