/*
 * Реализуйте метод, вычисляющий факториал заданного натурального числа. Факториал
 * NN вычисляется как 1⋅2⋅...⋅N1⋅2⋅...⋅N. Поскольку это очень быстро растущая функция,
 * то даже для небольших NN вместимости типов int и long очень скоро не хватит.
 * Поэтому будем использовать BigInteger.
 */
package base.controlStructures;

import java.math.BigInteger;

public class Factorial {
	/**
	 * Calculates factorial of given <code>value</code>.
	 *
	 * @param value positive number
	 * @return factorial of <code>value</code>
	 */
	public static BigInteger factorial(int value) {
	    BigInteger a = new BigInteger("1");
	    BigInteger c = new BigInteger("1");
	        for (int i = 1; i <= value; i++){
	            c = BigInteger.valueOf(i);
	            a = a.multiply(c);
	    }
	    return a;
	}
}
