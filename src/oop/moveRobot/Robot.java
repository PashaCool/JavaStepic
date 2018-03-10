/*
 * ����� ����������� ������� Robot. �� ������ ������������ ���������� ��� ��������
 * (���������� ��� ����������):
 */

package oop.moveRobot;

public interface Robot {
	// ������� ����������� �������
	public Direction getDirection();

	// ������� ���������� X
    public int getX();

 // ������� ���������� Y
    public int getY();

 // ����������� �� 90 �������� ������ ������� �������
    public void turnLeft();

 // ����������� �� 90 �������� �� ������� �������
    public void turnRight();

 // ��� � ����������� �������
    // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
    public void stepForward();
}

