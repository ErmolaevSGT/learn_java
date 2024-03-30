package org.antonchat.data;

public class User implements org.antonchat.chat.User {
    private final String nickname;

    public User(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String nickname() {
        return this.nickname;
    }
}
