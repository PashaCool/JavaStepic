/*
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами
 * (реализация вам неизвестна):
 */

package oop.moveRobot;

public interface Robot {
	// текущее направление взгляда
	public Direction getDirection();

	// текущая координата X
    public int getX();

 // текущая координата Y
    public int getY();

 // повернуться на 90 градусов против часовой стрелки
    public void turnLeft();

 // повернуться на 90 градусов по часовой стрелке
    public void turnRight();

 // шаг в направлении взгляда
    // за один шаг робот изменяет одну свою координату на единицу
    public void stepForward();
}

