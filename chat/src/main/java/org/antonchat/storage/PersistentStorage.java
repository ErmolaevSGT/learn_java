package org.antonchat.storage;

import org.antonchat.chat.Message;

import java.util.List;

/**
 * Постоянное хранилище сообщений
 */
public interface PersistentStorage {
    /**
     * @return возвращает все сохраненные в хранилище сообщения
     */
    List<Message> readAllMessages();

    /**
     * @param messages записывает все сообщения в хранилище (старые которые там были удаляет)
     */
    void writeAllMessages(List<Message> messages);
}
