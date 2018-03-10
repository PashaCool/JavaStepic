/*
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так,
 * чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im,
 * а hashCode() был бы согласованным с реализацией equals(). Реализация hashCode(),
 * возвращающая константу или не учитывающая дробную часть re и im, засчитана не
 * будет
 * Пример
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
