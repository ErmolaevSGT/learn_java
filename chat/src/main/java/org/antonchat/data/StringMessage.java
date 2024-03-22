package org.antonchat.data;

import org.antonchat.chat.Message;
import org.antonchat.chat.User;
import org.joda.time.DateTime;

public class StringMessage implements Message {
    private DateTime time;
    private User sender;
    private String text;

    @Override
    public DateTime time() {
        return this.time;
    }

    @Override
    public User sender() {
        return this.sender;
    }

    @Override
    public String text() {
        return this.text;
    }

    public void setTime(DateTime time) {
        this.time = time;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setText(String text) {
        this.text = text;
    }
}
