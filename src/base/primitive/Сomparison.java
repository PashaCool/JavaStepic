/*
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */

package base.primitive;

public class Сomparison {
	public static boolean doubleExpression(double a, double b, double c) {
		return Math.abs(a + b - c) < 1E-4;
	}
}
