/*
 * ���������� �����, ������������ ����� �� ������: ������ ��, ��� a + b = c?
 * ���������� ����������� � 0.0001 (1E-4)
 */

package base.primitive;

public class �omparison {
	public static boolean doubleExpression(double a, double b, double c) {
		return Math.abs(a + b - c) < 1E-4;
	}
}
