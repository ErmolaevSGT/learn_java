package org.antonchat.chat;

import java.util.List;

/**
 * Чат
 */
public interface Messager {
    /**
     * @param count сколько последних сообщений получить
     * @return последние сообщения
     */
    List<Message> getLastMessages(long count);

    /**
     * @param message отправляемое сообщение
     */
    void sendMessage(Message message);
}
