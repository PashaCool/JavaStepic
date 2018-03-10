/*
 * �� ��������� ���������� �������� RobotConnectionManager.
 */

package exceptions.handling;

public interface RobotConnectionManager {
	/*
	 * ����� getConnection() ������ ������� ����������� � ������� � ����������
	 * ������������� ����������, ����� ������� ����� �������� ������ �������.
	 * ��������� ���������� ����� ����������� ���������, � ����� ��� �������������
	 * ���������� ����� �������� �����������. ������ ������. ������� ����� �����
	 * RobotConnectionManager � RobotConnection ����� ������� ������������� ����������
	 * RobotConnectionException.
	 */
	RobotConnection getConnection();
}