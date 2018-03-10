/*
 * ���������� �����, ��������� ��� ��������������� �� ���������� ������� ����� �
 * ���� ��������������� � ��� �� ������� ������. ������� ����� ���� ����� �����, �
 * ��� ����� �������. ��������������, ��� �� ���������� �������� �������, �������
 * �������� ���������: �� ����� ���� �� ���� �������� �������� � ����� �����������
 * ��������������� �������������� ������. ���, ����� ���������� ����������� �������
 * ��� ������ Arrays.sort() ��� �� �����������. � ���������, ������������� ��� ��
 * ���������, ��� ��� ��� �������� �� ����� ������� :)
 * �������������� ��������������� ��������. ���������� ������, ����� main � ���������
 * �����-������ ������� ����������� �������. 
 * ������
 * ���� �� ���� �������� ������� {0, 2, 2} � {1, 3}, �� �� ������ ������ ����������
 * ������ {0, 1, 2, 2, 3}
 */

package base.controlStructures;

public class SortArray {
	/**
	 * Merges two given sorted arrays into one
	 *
	 * @param a1 first sorted array
	 * @param a2 second sorted array
	 * @return new array containing all elements from a1 and a2, sorted
	 */
	public static int[] mergeArrays(int[] a1, int[] a2) {
	    int[] a3 = new int[a1.length + a2.length];
	    int i, j, k;
	    for (i = 0, j = 0, k = 0; k < a3.length; k++) {
	        if ( i > a1.length - 1) {
	            int a = a2[j];
	            a3[k] = a;
	            j++;
	        } else if (j > a2.length - 1) {
	            int a = a1[i];
	            a3[k] = a;
	            i++;
	        } else if (a1[i] < a2[j]) {
	            int a = a1[i]; 
	            a3[k] = a;
	            i++;
	        } else {
	            int b = a2[j];
	            a3[k] = b;
	            j++;
	        }
	    }
	        return a3;
	}
}
