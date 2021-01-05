package com.alesia.login.model;

public class User {
    private final String login;
    private final String password;
    private boolean isUserBlocked = false;
    private int triesCount = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void unblockUser() {
        isUserBlocked = false;
    }

    public void decrementTries() {
        triesCount--;
        if (triesCount == 0) {
            blockUser();
        }
    }

    public void resetTries() {
        triesCount = 3;
    }

    private void blockUser() {
        isUserBlocked = true;
        System.out.println("Set user block");
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUserBlocked() {
        return isUserBlocked;
    }

    public int getTries() {
        return triesCount;
    }

    public void setTries(int tries) {
        this.triesCount = tries;
    }
}
