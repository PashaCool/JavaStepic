/*
 * ���������� ����� sqrt(), ����������� ���������� ������ �����. � ������� ��
 * Math.sqrt(), ��� ����� ��� �������� �������������� ��������� ������ �������
 * ���������� java.lang.IllegalArgumentException � ����������
 * "Expected non-negative number, got ?", ��� ������ ��������� ����� �����������
 * ���������� ���������� � ����� �����.
 */

package exceptions.introduce;

public class Sqrt {
	public static double sqrt(double x) {
		if (x >= 0)
			return Math.sqrt(x);
		else
			throw new java.lang.IllegalArgumentException("Expected non-negative number, got " + x);
	}
}
