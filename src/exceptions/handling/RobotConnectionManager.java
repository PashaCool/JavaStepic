/*
 * «а установку соединени€ отвечает RobotConnectionManager.
 */

package exceptions.handling;

public interface RobotConnectionManager {
	/*
	 * ћетод getConnection() делает попытку соединитьс€ с роботом и возвращает
	 * установленное соединение, через которое можно отдавать роботу команды.
	 * ”становка соединени€ может завершитьс€ неуспешно, а также уже установленное
	 * соединение может внезапно разорватьс€. ¬с€кое бывает. ѕоэтому любой метод
	 * RobotConnectionManager и RobotConnection может бросить непровер€емое исключение
	 * RobotConnectionException.
	 */
	RobotConnection getConnection();
}