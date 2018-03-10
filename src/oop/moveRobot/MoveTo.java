/*
 * �� ������� ���� ��������� �����. ������� ������ �� ���� ����������� �����
 * ������������� ������������: X � Y. ��� X ������� ����� �������, ��� Y � �����
 * �����. (�������, ��� �������� ������� ������� � �����?) � ��������� ������ �����
 * ��������� � ��������� ������� �� ����. ����� ��������, ���� ����� �������: �����,
 * ����, ������� ��� ������. ���� ������ � �������� ������ � �������� ����� ��������
 * ����.
 * ������
 * � ����� ��������: toX == 3, toY == 0; ��������� ��������� ������ �����:
 * robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 * ����� �������� ������ � ��������� ����� (3, 0), ����� ������ ������� � ������
 * ��������� ������:
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 */

package oop.moveRobot;

public class MoveTo {
	public static void moveRobot(Robot robot, int toX, int toY) {
	    Direction right = Direction.UP;
	    int x = robot.getX();
	    int y = robot.getY();
	    if(x < toX){
	        right = Direction.RIGHT;
	    } else if ( x > toX) {
	        right = Direction.LEFT;
	    } else right = robot.getDirection();
	    while (!(right.equals(robot.getDirection()))) {
	        robot.turnRight();
	    }
	    while(robot.getX() != toX){
	        robot.stepForward();
	    }
	    
	    if(y < toY){
	        right = Direction.UP;
	    } else if ( y > toY) {
	        right = Direction.DOWN;
	    } else right = robot.getDirection();
	    while (!(right.equals(robot.getDirection()))) {
	        robot.turnRight();
	    }
	    
	    while(robot.getY() != toY){
	        robot.stepForward();
	    }
	}
}
