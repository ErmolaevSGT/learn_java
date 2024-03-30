package org.antonchat.storage;

import org.antonchat.chat.Message;
import org.antonchat.chat.User;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersistentStorageTest {
    @Test
    public void testMessageFromString() {
        String str = "2024-03-22 22:20:00\tПавел:\tПривет, как дела?";

        // TODO: Тестируем это, оно должно заработать
        Message actual = FileStorage.messageFromString(str);

        Message expected = new Message() {
            @Override
            public DateTime time() {
                return new DateTime()
                        .withYear(2024)
                        .withMonthOfYear(03)
                        .withDayOfMonth(22)
                        .withHourOfDay(22)
                        .withMinuteOfHour(20)
                        .withSecondOfMinute(0);
            }

            @Override
            public User sender() {
                return new org.antonchat.data.User("Павел");
            }

            @Override
            public String text() {
                return "Привет, как дела?";
            }
        };

        Assertions.assertEquals(expected.time(), actual.time());
        Assertions.assertEquals(expected.sender(), actual.sender());
        Assertions.assertEquals(expected.text(), actual.text());
    }
}