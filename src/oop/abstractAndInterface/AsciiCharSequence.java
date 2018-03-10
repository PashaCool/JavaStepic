/*
 * �������� ����� AsciiCharSequence, ����������� ���������� �������� ������������������
 * ASCII-�������� (�� ���� ������� � ���� ����) � ������� ����. �� ��������� � �������
 * String, �������� ������ ������ ��� char, AsciiCharSequence ����� �������� � ��� ����
 * ������ ������. ����� AsciiCharSequence ������:
 * ������������� ��������� java.lang.CharSequence;
 * ����� �����������, ����������� ������ ����;
 * ���������� ������ length(), charAt(), subSequence() � toString()
 * ��������� ������� � �������� �� �� ��������� �������� � �������� ���������� java.lang.CharSequence
 * (JavaDoc ��� ���������).
 * � ������ ������� ������� charAt() � subSequence() ������ ����� ���������� ����������
 * ������� ���������, ������� �� ��������� � ���������� ������ ���������� �� �����.
 */

package oop.abstractAndInterface;

public class AsciiCharSequence implements CharSequence {
	private byte[] arr;

	public AsciiCharSequence(byte[] bt) {
		arr = bt;
	}

	@Override
	public char charAt(int index) {
		return (char) arr[index];
	}

	@Override
	public int length() {
		return arr.length;
	}

	public CharSequence subSequence(int start, int end) {
		byte[] h = new byte[end - start];
		for (int i = start, j = 0; i < end; i++, j++) {
			h[j] = arr[i];
		}
		CharSequence cha = new AsciiCharSequence(h);
		return cha;
	}

	@Override
	public String toString() {
		return new String(arr);
	}
}