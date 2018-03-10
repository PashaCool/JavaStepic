/*
 * ¬аша задача Ч реализовать метод который устанавливает соединение с роботом, отдает
 * ему команду на перемещение в заданную точку и затем закрывает соединение, выполн€€
 * при необходимости повтор этой последовательности до трех раз. ѕри этом:
 * ѕопытка отдать команду роботу считаетс€ успешной, если удалось установить соединение
 * и выполнить метод RobotConnection.moveRobotTo() без исключений. ќшибка закрыти€
 * соединени€ не важна и должна игнорироватьс€.
 * ≈сли перва€ попытка подключитьс€ и отдать команду оказалась неуспешной, то закрываем
 * соединение и выполн€ем вторую попытку. ≈сли втора€ тоже не удалась, то выполн€етс€
 * треть€. ѕосле третьей неудачи метод должен бросить исключение RobotConnectionException.
 * ћетод отвечает за открытие и закрытие соединени€. ≈сли соединение удалось установить,
 * то оно об€зательно должно быть закрыто несмотр€ на возможные исключени€, случившиес€
 * в дальнейшем во врем€ работы метода.
 * ≈сли во врем€ работы метода случилось исключение любого типа, отличного от
 * RobotConnectionException, метод должен завершитьс€ и выбросить это исключение, не
 * выполн€€ повторных попыток пообщатьс€ с роботом. ≈динственное, что метод должен сделать
 * перед выбросом этого исключени€ Ч закрыть открытое соединение RobotConnection.
 */

package exceptions.handling;

public class MoveConnectionRobot {
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY)
			throws RobotConnectionException {
		boolean con = false;
		for (int i = 0; !con && (i < 3); i++) {
			try (RobotConnection connection = robotConnectionManager.getConnection()) {
				connection.moveRobotTo(toX, toY);
				con = true;
			} catch (RobotConnectionException e) {
			}
		}
		if (!con) {
			throw new RobotConnectionException("3 connection failed");
		}
	}
}
