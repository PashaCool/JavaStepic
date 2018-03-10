/*
 * В этой задаче вам нужно реализовать метод, настраивающий параметры логирования.
 * Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем
 * при помощи properties-файла. 
 * Требуется выставить такие настройки, чтобы:
 * 1)Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
 * 2)Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня
 * WARNING и серьезнее. 
 * 3)Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java",
 * независимо от серьезности сообщения печатались в консоль в формате XML (*) и не
 * передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
 */

package exceptions.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggingParam {
	private static void configureLogging() {
		Logger logA = Logger.getLogger("org.stepic.java.logging.ClassA");
		logA.setLevel(Level.ALL);
		Logger logB = Logger.getLogger("org.stepic.java.logging.ClassB");
		logB.setLevel(Level.WARNING);
		Logger logPack = Logger.getLogger("org.stepic.java");
		logPack.setUseParentHandlers(false);
		Handler handler = new ConsoleHandler();
		handler.setLevel(Level.ALL);
		handler.setFormatter(new XMLFormatter());
		logPack.addHandler(handler);
	}
}
