/*
 * –еализуйте метод, провер€ющий, €вл€етс€ ли заданное число по абсолютной величине
 * степенью двойки.
 */

package base.typeConversion;

public class PowerOfTwo {
	/**
	 * Checks if given <code>value</code> is a power of two.
	 *
	 * @param value any number
	 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
	 */
	public static boolean isPowerOfTwo(int value) {
	    if (value == 0)
	        return false;
	    else{
	        int res = Math.abs(value);
	        return (res & (res - 1)) == 0;
	    }
	}
}
