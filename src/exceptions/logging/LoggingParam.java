/*
 * � ���� ������ ��� ����� ����������� �����, ������������� ��������� �����������.
 * ���������������� � ���� ��������� ��������� ����� ������ � ������ ���������, ���
 * ��� ������ properties-�����. 
 * ��������� ��������� ����� ���������, �����:
 * 1)������ � ������ "org.stepic.java.logging.ClassA" �������� ��������� ���� �������.
 * 2)������ � ������ "org.stepic.java.logging.ClassB" �������� ������ ��������� ������
 * WARNING � ���������. 
 * 3)��� ���������, ��������� �� ����������� �������� �� ������� "org.stepic.java",
 * ���������� �� ����������� ��������� ���������� � ������� � ������� XML (*) � ��
 * ������������ ����������� ������������ �� ������� "org.stepic", "org" � "".
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
