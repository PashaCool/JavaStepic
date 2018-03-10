/*
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после
 * символа "\" (обратный слэш) на расстоянии a.
 */

package base.typeConversion;

public class SlashAndLetter {
	public static char charExpression(int a) {
		return (char) ('\\' + a);
	}
}
