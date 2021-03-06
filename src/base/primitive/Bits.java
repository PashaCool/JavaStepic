/*
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа
 * на противоположное. Данная задача актуальна, например, при работе с битовыми
 * полями. Договоримся, что биты нумеруются от младшего (индекс 1) к старшему
 * (индекс 32).
 */

package base.primitive;

public class Bits {
	/**
	 * Flips one bit of the given <code>value</code>.
	 *
	 * @param value any number
	 * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
	 * @return new value with one bit flipped
	 */
	public static int flipBit(int value, int bitIndex) {
	    int d = (int)Math.pow(2, bitIndex-1);
	    return value ^ d;
	}

}
