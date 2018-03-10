/*
 * Установка соединения может завершиться неуспешно, а также уже установленное
 * соединение может внезапно разорваться. Всякое бывает. Поэтому любой метод
 * RobotConnectionManager и RobotConnection может бросить непроверяемое исключение
 * RobotConnectionException:
 */

package exceptions.handling;

public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
