package org.antonchat.server;

/**
 * Сервер
 */
public interface Server {
    /**
     * Запускает сервер на локальном хосте и на стандартном порту
     */
    void serve();

    /**
     * Запускает сервер на локальном хосте и на порту port
     * @param port порт на котором нужно запустить сервер
     */
    void serve(long port);

    /**
     * Запускает сервер на хосте host и на порту port
     * @param host хост на котором нужно запустить сервер
     * @param port порт на котором нужно запустить сервер
     */
    void serve(String host, long port);
}
