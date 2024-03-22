package org.antonchat.storage;

import org.antonchat.chat.Message;

import java.util.List;

public class FileStorage implements PersistentStorage {
    @Override
    public List<Message> readAllMessages() {
        return null;
    }

    @Override
    public void writeAllMessages(List<Message> messages) {

    }

    public static Message messageFromString(String messageAsString) {
        // TODO: В MessageImpl заполнить данные из строки messageAsString и вернуть в return
        throw new UnsupportedOperationException("Надо сделать, не работает");
    }
}
