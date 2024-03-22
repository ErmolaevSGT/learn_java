package org.antonchat.chat;

import org.joda.time.DateTime;

/**
 * Сообщение чата
 */
public interface Message {
    /**
     * @return время отправки сообщения
     */
    DateTime time();

    /**
     * @return кто отправил сообщение
     */
    User sender();

    /**
     * @return текст сообщения
     */
    String text();
}
