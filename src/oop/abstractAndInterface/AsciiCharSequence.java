/*
 * Ќапишите класс AsciiCharSequence, реализующий компактное хранение последовательности
 * ASCII-символов (их коды влезают в один байт) в массиве байт. ѕо сравнению с классом
 * String, хран€щим каждый символ как char, AsciiCharSequence будет занимать в два раза
 * меньше пам€ти.  ласс AsciiCharSequence должен:
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определ€ть методы length(), charAt(), subSequence() и toString()
 * —игнатуры методов и ожидани€ по их поведению смотрите в описании интерфейса java.lang.CharSequence
 * (JavaDoc или исходники).
 * ¬ данном задании методам charAt() и subSequence() всегда будут подаватьс€ корректные
 * входные параметры, поэтому их проверкой и обработкой ошибок заниматьс€ не нужно.
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