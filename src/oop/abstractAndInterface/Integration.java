/*
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на
 * заданном интервале по формуле левых прямоугольников. Функция задана объектом,
 * реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод
 * applyAsDouble() принимает значение аргумента и возвращает значение функции в
 * заданной точке. Интервал интегрирования задается его конечными точками aa и bb,
 * причем a<=ba<=b. Для получения достаточно точного результата используйте шаг сетки
 * не больше 10−610−6.
 * Пример. Вызов integrate(x -> 1, 0, 10) должен возвращать значение 10.
 */

package oop.abstractAndInterface;

import java.util.function.DoubleUnaryOperator;

public class Integration {
	public static double integrate(DoubleUnaryOperator f, double a, double b) {
	    double step = 1e-7;
	    double sum = 0;
	     do {
	        //double h = f.applyAsDouble(a);
	        //double h2 = f.applyAsDouble(a + step);
	        //sum += (h + h2)*step/2;
	        sum += f.applyAsDouble(a) * step;
	        a += step;
	     }while( a + step < b);
	    return sum;
	}
}
