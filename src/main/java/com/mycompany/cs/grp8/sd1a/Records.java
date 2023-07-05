package com.mycompany.cs.grp8.sd1a;

public class Records {
    private static String name;
    private static String accountNum;

    // Setters
    public void setName(String nameValue) {
        name = nameValue;
    }

    public void setAccountNum(String accountNumVal) {
        accountNum = accountNumVal;
    }

    // Getters
    public static String getName() {
        return name;
    }

    public static String getAccountNum() {
        return accountNum;
    }
}
