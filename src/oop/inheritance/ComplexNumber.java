/*
 * ��� ����� ComplexNumber. �������������� � ��� ������ equals() � hashCode() ���,
 * ����� equals() ��������� ���������� ComplexNumber �� ����������� ����� re � im,
 * � hashCode() ��� �� ������������� � ����������� equals(). ���������� hashCode(),
 * ������������ ��������� ��� �� ����������� ������� ����� re � im, ��������� ��
 * �����
 * ������
 * ComplexNumber a = new ComplexNumber(1, 1);
 * ComplexNumber b = new ComplexNumber(1, 1);
 * a.equals(b) must return true
 * a.hashCode() must be equal to b.hashCode()
 */

package oop.inheritance;

public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}

	public boolean equals(Object c) {
		Double re = this.re;
		Double im = this.im;
		if (this == c)
			return true;
		if (c == null)
			return false;
		if (getClass() != c.getClass())
			return false;
		ComplexNumber d = (ComplexNumber) c;
		return (re.equals(d.getRe()) && (im.equals(d.getIm()))) ? true : false;
	}

	public int hashCode() {
		return (int) ((re - im * 2) * (im + re / im)) * 10000000;
	}

}
