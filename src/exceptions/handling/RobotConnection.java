/*
 * Подключение к роботу представляется в программе интерфейсом RobotConnection.
 */

package exceptions.handling;

public interface RobotConnection extends AutoCloseable {
	void moveRobotTo(int x, int y);

	@Override
	void close();
}
